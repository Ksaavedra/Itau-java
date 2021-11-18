package exercicios.exercicio01;

public class Placar {
    //aributos
    private String nomeTime1, nomeTime2;
    private int golsTime1, golsTime2;

    //construtores
    public Placar(){
        //nomeTime1 = "Time da casa";
        //nomeTime2 = "Visitante";
        this("Time da casa", "Visitante", 0, 0); //chama outro construtor de casse
    }

    public Placar(String nomeTime1, String nomeTime2) {
        //this.nomeTime1 = nomeTime1;
        //this.nomeTime2 = nomeTime2;
        this(nomeTime1, nomeTime2, 0, 0); // chama outro construtor de casse
    }

    public Placar(String nomeTime1, String nomeTime2, int golsTime1, int golsTime2) {
        //this.nomeTime1 = nomeTime1;
        //this.nomeTime2 = nomeTime2;
        //this.golsTime1 = golsTime1;
        //this.golsTime2 = golsTime2;

        this.nomeTime1 = nomeTime1;
        this.nomeTime2 = nomeTime2;
        if(golsTime1 >= 0){
            this.golsTime1 = golsTime1;
        }
        if(golsTime2 >= 0 ){
            this.golsTime2 = golsTime2;
        }
    }

    public String toString() {
        return nomeTime1 + " " + golsTime1 + " X " + golsTime2 + " " + nomeTime2;
    }
}
