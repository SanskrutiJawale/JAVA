public class Abs {
    public static void main(String args[]){
        Mustang myHorse= new Mustang();

    }
}

abstract class Animals {   //abstract class
    String color;
    Animals(){  //constructor
        System.out.println("Animal constructor called");
    }
    void eat(){
        System.out.println("animals eats food");
    }

    abstract void  walk();
}
class Horse extends Animals{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void walk(){
        System.out.println("Horse has 4 legs");
    }

}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chiken extends Animals{
    void walk(){
        System.out.println("walks on 2 legs");
    }

}