
class NestedClass {

    int a = 10;
    static int b = 20;

    void show() {
        System.out.println("Instance method!!");
    }

    static void display() {
        System.out.println("Static method!!");
    }

    class Inner {

        void msg() {
            System.out.println(a);
            System.out.println(b);
            show();
            display();
        }
    }
}

class Main {

    public static void main(String args[]) {
        NestedClass o = new NestedClass();
        NestedClass.Inner i = o.new Inner();
        i.msg();
        
    }
}
