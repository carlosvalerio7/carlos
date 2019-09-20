package Vehicle;

public class Motocicletes extends Vehiculos {
    private boolean teCopilot;

    public Motocicletes(int velocitatMaxima, int numEixos, int numRodes, boolean teCopilot) {
        super(velocitatMaxima, numEixos, numRodes);
        this.teCopilot = teCopilot;

    }

    public boolean isTeCopilot() {
        return teCopilot;
    }

    public void setTeCopilot(boolean teCopilot) {
        this.teCopilot = teCopilot;
    }
}
