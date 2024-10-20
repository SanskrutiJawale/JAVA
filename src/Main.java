//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pen p1 =new Pen();// created pen object
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}
class Pen{
    // properties and function
    String color;
    int tip;
    void setColor(String newColor){
        color= newColor;
    }
    void setTip(int newTip){
        tip= newTip;
    }
}