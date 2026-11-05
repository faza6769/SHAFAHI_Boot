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
        if(neuPlaetze < 1 || neuPlaetze > 5000){
            // Der wert von plaetze wird auf default gesetzt. 
            plaetze = 0;
            // eine Fehlermeldung wird ausgegeben, dass die Werte in gültigen Bereich gegeben werden müssen.
            System.out.println("Die Werte müssen zwischen 1 und 5000 liegen ");
        }else{
            plaetze = neuPlaetze;
        }
        
    }
    public void setMotorisiert( boolean neuMotorisiert){
        motorisiert = neuMotorisiert;
    }
    
    public void printBoot(){
        if(plaetze < 1 || plaetze > 5000){
            System.out.println("Die Werte müssen zwischen 1 und 5000 liegen ");
        }
        if(motorisiert == true){
            System.out.println(name + " Boot: " + plaetze + " Plaetze - " + "motorbot");
        }else{
            System.out.println(name + " Boot: " + plaetze + " Plaetze - " + "ohne bot");
        }
    }
    

    
}