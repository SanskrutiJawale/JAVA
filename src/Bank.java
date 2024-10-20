public class Bank{
    public static void main(String args[]){
        BankAccount myAcc = new BankAccount();
        myAcc.username="sanskrutijawale";
        myAcc.setPass("khushi@123");// we called public function
    }
}

class BankAccount{
    public String username;
    private String password;

    public void setPass(String pwd){
        password = pwd;
        System.out.println(password);
    }
}