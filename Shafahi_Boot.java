public class Boot {
    // Private Attribute mit Standardwerten
    private String name = "UNKN";
    private int plaetze = 0;
    private boolean motorisiert = false;

    // Konstruktor
    public Boot(String neuName, int neuPlaetze, boolean neuMotorisiert) {
        name = neuName;
        plaetze = neuPlaetze;
        motorisiert = neuMotorisiert;
    }

    // Get-Methoden
    public String getName() {
        return name;
    }

    public int getPlaetze() {
        return plaetze;
    }

    public boolean isMotorisiert() {
        return motorisiert;
    }

    // Set-Methoden
    public void setName(String neuName) {
        name = neuName;
    }

    public void setPlaetze(int neuPlaetze) {
        plaetze = neuPlaetze;
    }

    public void setMotorisiert(boolean neuMotorisiert) {
        motorisiert = neuMotorisiert;
    }
}
