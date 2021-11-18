package exercicios.exercicio04;

public class Relogio {
    
    //atributos
    private int hora, minuto, segundo;

    //métodos

    //construdor = inicilizar os tribuitos, preparar o obejos para uso
    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);

    }

    public int getHora() {
        return hora;
    }

    public void setHora(int novaHora) {
        if(novaHora >= 0 && novaHora < 24){
            hora = novaHora;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int novoMinuto) {
        if(novoMinuto >= 0 && novoMinuto < 60){
            minuto = novoMinuto;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int novoSegundo) {
        if(novoSegundo >= 0 && novoSegundo < 60){
            segundo = novoSegundo;
        }
    }

    public void exibir() {
        System.out.printf("%d:%d:%d\n", hora, minuto, segundo);
    }
}
