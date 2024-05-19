public class UseSuper extends Parent {
    int a = 150;
    void display() {
        System.out.println(a);
        System.out.println(super.a); //Super is used to refer immediate parent class instance
    }
    public static void main(String[] args) {
        UseSuper obj = new UseSuper();
        obj.display();
    }
}
class Parent {
    int a = 100;
}