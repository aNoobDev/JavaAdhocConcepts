public class Cat implements Animal{

    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }
}
