public interface Dog {
    default void eat(){
        System.out.println("Dog Eating");
    }
}
