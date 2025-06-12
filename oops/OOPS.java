package oops;

class Ayush{
    String name;
    String Age;

    public void PrintInfo(){
        System.out.println(this.name);
    }
}

public class OOPS {
    
    public static void main(String[] args) {
        
        Ayush a1 = new Ayush();
        a1.name = "ayush";
        a1.Age = "19";
        a1.PrintInfo();

    }
}
