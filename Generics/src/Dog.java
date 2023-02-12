public class Dog implements Animal{

    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }
}
