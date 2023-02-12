import java.util.Optional;

/*
@author-Aftab Alam
*/
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Optional<Cat> optionalCat=getCatByName("Fred");

        if(optionalCat.isPresent()){
            System.out.println(optionalCat.get().age);
        }
        else{
            System.out.println(0);
         }

        Cat myCat=optionalCat.orElse( new Cat("UNKNOWN",0));

        System.out.println(myCat.age);

        int age = optionalCat.map(Cat::getAge).orElse(0);
        System.out.println(age);
    }
    public static Optional<Cat> getCatByName(String name){

        Cat cat = new Cat("Fred", 4);
        return Optional.ofNullable(cat);
    }
}