public class StaticBlock {
    static int num;
    static String str;

   static 
    {
        System.out.println("Static Block");
        num = 10;
        str = "Hello";
    }
       public static void main(String[] args) {
        System.out.println("Main Method");
        System.out.println(num);
        System.out.println(str);
    }
}
