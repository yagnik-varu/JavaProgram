public class ConstructorOverloading {
    
    int rollNo;
    String name;
    ConstructorOverloading() {
        System.out.println("Constructor without any argument.");
        System.out.println("Name: " + this.name);
        System.out.println("Rollno: " + this.rollNo);
    }
    ConstructorOverloading(int rollNo, String name) {
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("Constructor with two argument.");
        System.out.println("Name: " + this.name);
        System.out.println("Rollno: " + this.rollNo);
    }
    ConstructorOverloading(int rollNo) {
        this.rollNo = rollNo;
        System.out.println("Constructor with rollNo argument.");
        System.out.println("Name: " + this.name);
        System.out.println("Rollno: " + this.rollNo);
    }
    ConstructorOverloading(String name) {
        this.name = name;
        System.out.println("Constructor with name argument.");
        System.out.println("Name: " + this.name);
        System.out.println("Rollno: " + this.rollNo);
    }
    public static void main(String[] args) {
        ConstructorOverloading obj  = new ConstructorOverloading();
        ConstructorOverloading obj1 = new ConstructorOverloading(121, "John");
        ConstructorOverloading obj3 = new ConstructorOverloading(121);
        ConstructorOverloading obj2 = new ConstructorOverloading( "John");
    }

}
