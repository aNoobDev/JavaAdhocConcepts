import java.util.ArrayList;
import java.util.List;

/*
@author-Aftab Alam
*/public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Printer<Integer> integerPrinter=new Printer<>(23);
        integerPrinter.print();
        Printer<Double> doublePrinter = new Printer<>(2.3);
        doublePrinter.print();

        AnimalPrinter<Cat> catAnimalPrinter=new AnimalPrinter<>(new Cat("Mike"));
        catAnimalPrinter.print();


        AnimalPrinter<Dog> dogAnimalPrinter=new AnimalPrinter<>(new Dog("Warner"));
        dogAnimalPrinter.print();
        shout("Bark");
        shout(2,"Master");

        List<Integer> integerList=new ArrayList();
        integerList.add(1);
        print(integerList);

        List<String> stringList=new ArrayList();
        stringList.add("Soup");
        print(stringList);


    }
    public static <T> void shout(T thingToShout){
        System.out.println(thingToShout+" "+thingToShout);
    }

    public static <K,V> K shout(K thingToShout,V thingToShoutLoud){
        System.out.println(thingToShout+" "+thingToShoutLoud);
        return thingToShout;
    }
    public static void print(List<?> list){
        System.out.println(list);
    }
}