public class Horse implements Cat,Dog{

    //In case a class implements an interface and extends a class and both the interface
    // and class have same method then the class method will be given priority
    // while defining methods in interface as default, we can not override methods of object class

    /*
    * Since the Horse class implements two interface Cat and Dog and both the interface has same
    * method eat, this will lead to diamond problem so to avoid this we have to define a new eat
    * method in Horse class
    * */
    public void eat(){
        System.out.println("Horse eating");
    }
}
