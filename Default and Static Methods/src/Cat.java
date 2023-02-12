public interface Cat {
    default void eat(){
        System.out.println("Cat eating");
    }
    static void meow(){
        System.out.println("Cat Sound :- Meow Meow");
    }
}
