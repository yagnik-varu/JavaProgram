public class Main2 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
    
}
class Parent {
    private int a = 10;
    int b = 10;
    void display() {
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
}
class Child extends Parent {
    int c = 30;
    void show() {
        // System.out.println("A: " + a); // You can no use private property
        System.out.println("B: " + b);
        System.out.println("C: " + c);
    }
}