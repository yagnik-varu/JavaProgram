public class ThisKeyword {
    
    int id;
    String name;
    void show() {
        System.out.println(this);
    }
    ThisKeyword(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    } 
    ThisKeyword() { System.out.println("In Simple Constructor");}
    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(1, "Vraj");
        System.out.println(obj);
        obj.show();
    }
}
