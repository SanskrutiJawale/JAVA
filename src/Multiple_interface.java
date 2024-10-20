public class Multiple_interface {
    public static void main(String args[]){
        Bear b= new Bear();
        b.eat_flesh();
        b.eat_plants();
    }
}

interface Herbivore{
    void eat_plants();
}

interface Carnivore{
    void eat_flesh();
}

class Bear implements Herbivore, Carnivore{
    @Override
    public void eat_plants() {
        System.out.println("Eats plant");
    }
    public void eat_flesh() {
        System.out.println("Eats flesh");
    }
}