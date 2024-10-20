public class FunctionOverloding {
    public static void main(String args[]){
        Calculator calc= new Calculator();
        System.out.println(calc.sum(3, 5));
        System.out.println(calc.sum((float)2.5, (float)6.8));
        System.out.println(calc.sum(4,3,2));
    }
}
class Calculator{
    int sum(int a, int b){
        System.out.println("Two parameter are passed of integer type");
        return a + b;
    }
    float sum(float a, float b){
        System.out.println("Two parameter are passed of float type");
        return a + b;
    }
    int sum(int a, int b, int c){
        System.out.println("Three parameter are passed");
        return a + b + c ;
    }
}