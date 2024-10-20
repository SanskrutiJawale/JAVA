public class CopyConstructors{
    public static void main(String args[]){
        Students s1= new Students();
        s1.name="khushi";
        s1.roll=123;
        s1.roll=345;
        Students s2= new Students(s1);

    }
}
class Students {
    String name;
    int roll;

    Students(Students s1){
        this.name=s1.name;
        System.out.println(name);
        this.roll=s1.roll;
        System.out.println(roll);
    }
    Students(){
        System.out.println("Constructor call");

    }
    Students(String name){
        this.name= name;
        System.out.println(name);
    }
    Students(int roll){
        this.roll= roll;
        System.out.println(roll);
    }
}