public class Dado {
    int facce;

    public Dado() {
        this.facce = 6;
    }

    public int lancia(){
        int randomNum = (int)(Math.random() * facce);
        return randomNum;
    }
}