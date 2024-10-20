public class inheritance1 {
    public static void main(String args[]){
    fish oppa= new fish();
    oppa.eat();
    }
}
// base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
// derived class
class fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}