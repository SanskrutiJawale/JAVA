public class GetAndSet {
    public static void main(String args[]){
        BankAcc ba = new BankAcc();
        ba.setColor("blue");
        System.out.println(ba.getColor());
        ba.settip(5);
        System.out.println(ba.gettip());
    }
}
class BankAcc{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }
    void setColor(String color){
        this.color=color;
    }
    void settip(int tip){
        this.tip=tip;
    }
}