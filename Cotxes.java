package Vehicle;

public class Cotxes extends Vehiculos {
    private int numSeients;

    public Cotxes(int velocitatMaxima, int numEixos, int numRodes, int numSeients) {
        super(velocitatMaxima, numEixos, numRodes);
        this.numSeients = numSeients;
    }

    public int getNumSeients() {
        return numSeients;
    }

    public void setNumSeients(int numSeients) {
        this.numSeients = numSeients;
    }
}
