package Vehicle;

public class Camions extends Vehiculos {
    private double pes;

    public Camions(int velocitatMaxima, int numEixos, int numRodes, double pes) {
        super(velocitatMaxima, numEixos, numRodes);
        this.pes = pes;
    }

    public double getPes() {
        return pes;
    }

    public void setPes(double pes) {
        this.pes = pes;
    }
}
