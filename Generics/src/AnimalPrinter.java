public class AnimalPrinter <T extends Animal>{

    T thingToPrint;
    AnimalPrinter(T thingToPrint){
        this.thingToPrint=thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint.getName());
    }
}
