package br.itau.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.spring02.repository.ClienteRepo;
import br.itau.spring02.dto.ClienteDTO;
import br.itau.spring02.model.Cliente;


@RestController
@CrossOrigin("*")
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired //injeção de dependêcia
    private ClienteRepo repo;

    @GetMapping
    private List<Cliente> listarTodos() {
        List<Cliente> lista = (List<Cliente>) repo.findAll(); // castinh
        return lista;
    }

    @GetMapping("/codigo/{codigo}") 
    public ResponseEntity<Cliente> buscarcliente(@PathVariable int codigo) {
        // busca um cliente com este código, e se não encontrar, preenche com null
        Cliente cliente = repo.findById(codigo).orElse(null);

        if(cliente != null) { // achou o cliente
            return ResponseEntity.ok(cliente); // ok = status 200
        }
        return ResponseEntity.notFound().build(); // notFround = status 404, sem conteúdo
    }

    @GetMapping("/cod/{codigo}") 
    public ResponseEntity<ClienteDTO> buscarclienteResumo(@PathVariable int codigo) {
        Cliente cliente = repo.findById(codigo).orElse(null);

        if(cliente != null) { 
            ClienteDTO clienteDTO = new ClienteDTO(cliente);
            return ResponseEntity.ok(clienteDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Cliente> inserir(@RequestBody Cliente novoCliente) {
        Cliente cliente = repo.save(novoCliente);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Void> apagar(@PathVariable int codigo) {
        Cliente cliente = repo.findById(codigo).orElse(null);

        if(cliente != null) {
            repo.delete(cliente);
            // return ResponseEntity.status(204).build();
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/email")
    public ResponseEntity<Cliente> buscarPorEmail(@RequestBody Cliente clienteProcurado) {
        Cliente clienteEncontrad = repo.findByEmail(clienteProcurado.getEmail());

        if(clienteEncontrad != null) {
            return ResponseEntity.ok(clienteEncontrad);
       }
       return ResponseEntity.notFound().build();
    }
} 