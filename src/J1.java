public class J1 {
    static int k = 30;
    static {
        System.out.println("Before Main: "+ k);
    }

    public static void main(String[] args) {
        Parent p = new Parent();    
        Child c = new Child();    
    }
    static {
        System.out.println("After Main: " + k);
    }
}
class Child extends Parent {
     static int j = 20;
     static  {
        System.out.println("Child: "  + j);
        System.out.println("Child Static Block");
     }
    {
        System.out.println("Child Instance Block");
    }
    Child() {
        System.out.println("Child Cons");
    }
    static {
        System.out.println("Child Static Block 2");
    }


}
class Parent {
    static int i = 10;
    static {
        System.out.println("Parent :" + i);
        System.out.println("Parent Static Block 1");
    }   
    {
        System.out.println("Parent Instance Block");
    }
    Parent() {
        System.out.println("Parent Const");
    }
}
/* 
-- without Inheritance
 * Static Block 
 * Instance Block
 * Constructor
 */

// With Inheritance
/*
 * Static Block of parent
 * Static Block Of Child
 * Instance block of parent
 * Constructor of parent
 * Instance block of child
 * Constructor of child
 */