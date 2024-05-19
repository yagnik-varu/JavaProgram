public class MethodCalling extends Parent {
    void display() {
        System.out.println("Child Class Method");
        super.display();
    }
    public static void main(String[] args) {
        MethodCalling obj  = new MethodCalling();
        obj.display();
    }
}
class Parent {
    void display() {
        System.out.println("Parent class method");
    }
} 
