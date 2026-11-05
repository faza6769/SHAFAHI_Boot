public class boot
{
    private String name;
    private int plaetze;
    private boolean motorisiert;

    public boot(String name, int plaetze, boolean motorisiert) {
        this.name = name;
        this.plaetze = plaetze;
        this.motorisiert = motorisiert;
        printBoot();
     }

    // erstellen von Get un Set Methoden 
    public String getName(){
        return name;
    }
    public int getPlaetze(){
        return plaetze;
    }
    public boolean getMotorisiert(){
        return motorisiert;
    }
  
    // erstellen von SetMethoden     
    public void setName(String neuName){
        name = neuName;
    }
    public void setPlaetze (int neuPlaetze ){
        plaetze = neuPlaetze;
    }
    public void setMotorisiert( boolean neuMotorisiert){
        motorisiert = neuMotorisiert;
    }
    
    public void printBoot(){
        System.out.println(name + " Boot: " + plaetze + " Plaetze - " + motorisiert);
    }
    

    
}