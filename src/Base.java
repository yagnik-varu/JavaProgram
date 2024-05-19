public class Base {
    static int i = 10;
    static {
        m1();
        System.out.println("First Static Method");
    }
    public static void main(String[] args) {
        m1();
        System.out.println("Main Method");

    }
    public static void m1() {
        System.out.println(j);
    }
     static {
        System.out.println("Second Static Method");
     }
     static int j = 20;
    
}

/*
 * IF All are static then followed this step of execution 
 * 1. First identification to all varibale from top to bottom (Means all varibable assign with its default value)
 * 2. Initialization of all varibale from top to bottom 
 * 3. Run all static block from top to bottom
 * 4. last main method is called
 */
