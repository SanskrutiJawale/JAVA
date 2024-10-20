public class StaticKeyword {
    public static void main(String args[]){
        Stud s1= new Stud();
        s1.schoolName="Sanjivani";

        Stud s2= new Stud();
        System.out.println(s2.schoolName);//static variable name which is set for s1 object
    }
}

class Stud {
    String name;
    int roll;

    static String schoolName;// static keyword is used

    void setName(String name){
        this.name=name;
    }

    String getName(){
        return this.name;
    }
}