public class ConstructorSuper extends Parent {
    ConstructorSuper() {
        System.out.println("Child Class Constructor");
    }
    ConstructorSuper(int a) {
        super("Hello");
        System.out.println("Child Class Constructor: " + a);
    }
    public static void main(String[] args) {
        ConstructorSuper obj = new ConstructorSuper();
        ConstructorSuper obj1 = new ConstructorSuper(10);
    }
}
class Parent {
    Parent() {
        System.out.println("Parent Class Constructor");
    }
    Parent(String s) {
        System.out.println("Parent Class Constructor With args: " +  s);
    }
}
