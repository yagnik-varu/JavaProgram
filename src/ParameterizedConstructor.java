

public class ParameterizedConstructor { 

    int rollNo;
    String name;
    ParameterizedConstructor(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        System.out.println("Name: " + this.name);
        System.out.println("Roll No: " + this.rollNo);
    }
    
    public static void main(String[] args) {
        
        ParameterizedConstructor obj = new ParameterizedConstructor(1, "Rahul");
    }
    
}
