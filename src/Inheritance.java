class Inheritance extends B {
    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        System.out.println("Child class Main method");
        obj.display();
    }
}
class B {
    void display() {
        System.out.println("Parent Class");
    }
}