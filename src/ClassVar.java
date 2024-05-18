public class ClassVar {
    int id;
    String name;
    static String college = "LJIET";
    ClassVar(int id, String name) {
        this.id = id;
        this.name = name;
}
    void display() {
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(college);
    }
    public static void main(String[] args) {
        ClassVar obj1 = new ClassVar(1, "Rahul");
        obj1.display();
    }
}
