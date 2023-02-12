public class Printer <T>{
    private T objectToPrint;
    public Printer(T objectToPrint){
        this.objectToPrint=objectToPrint;
    }

    public void print(){
        System.out.println(objectToPrint);
    }
}
