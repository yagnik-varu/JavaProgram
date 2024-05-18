public class ObjectAsArgument {
    int id;
    String name;

    ObjectAsArgument() {}

    ObjectAsArgument(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("In Simple Constructor");
    }
    
    ObjectAsArgument(ObjectAsArgument other) {
        this.id = other.id;
        this.name = other.name;
        System.out.println("In Constructor That Have Object As Argument.");
    }
    public static void main(String[] args) {
        ObjectAsArgument obj = new ObjectAsArgument(1, "John");
        ObjectAsArgument obj1 = new ObjectAsArgument(obj);
        System.out.println(obj1.name);
    }
}
