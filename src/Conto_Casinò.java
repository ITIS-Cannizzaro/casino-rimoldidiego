public class Conto_Casinò {
    double ContoCasinò;

    public Conto_Casinò() {
        ContoCasinò = 100000;
    }

    public double getContoCasinò() {
        return ContoCasinò;
    }

    public void perdita(double giocata){
        double temp=ContoCasinò;
        temp=temp-giocata;
        ContoCasinò=temp;
    }

    public void vincita(double giocata){
        double temp=ContoCasinò;
        temp=temp+(giocata*5);
        ContoCasinò=temp;
    }
}
