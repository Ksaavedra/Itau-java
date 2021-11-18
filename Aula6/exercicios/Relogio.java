package exercicios;

public class Relogio {
    int hora = 0;
    int minuto = 0;
    int segundo = 0;

    public void setHora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;

        if (segundo < 60 && minuto < 60 && hora < 24) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }else {
            System.out.println("Dados invalidos");
        }
    }

    public String getHora(){
        return this.hora + ":" + this.minuto + ":" + segundo;
    }

    public void pulse() {
        segundo++;
        if(segundo > 59){
            segundo = 0;
            minuto ++;
        }

        if(minuto > 59) {
            minuto = 0;
            hora ++;
        }

        if(hora > 23) {
            hora = 0;
        }
    }
}
