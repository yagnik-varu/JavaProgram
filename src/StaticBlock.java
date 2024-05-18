public class StaticBlock {
    static int num;
    static String str;
    {
        System.out.println("Static Block");
    }
    StaticBlock() {System.out.println("HEllo");}
       public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        StaticBlock obj1 = new StaticBlock();
        StaticBlock obj2  = new StaticBlock();
    }
}
