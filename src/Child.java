public class Child extends Parent{
    public void marry() {
        System.out.println("Sunita");
    }
    public static void main(String[] args) {
        Parent p = new Parent();
        p.money();
        p.land();
        p.jewellery();
        p.marry();
        Child c = new Child();
        c.money();
        c.land();
        c.jewellery();
        c.marry();
        // Which marray method is called ??
        Parent p1 = new Child();
        p1.marry();
    }
}
class Parent {
    void money() {
        System.out.println("Money");
    }
    void land() {
        System.out.println("Land");
    } 
    void jewellery() {
        System.out.println("Jewellery");
    }
    // We can not override final and static method
    /* 
    final void marry() {
         System.out.println("Vinita");
    }
    */
    // Same method in both child and parent class but both are static then compile time polymorphisam not work
    // So Refrecence Based method are called
    protected void marry() {
        System.out.println("Vinita");
    }
}

/*
* Access Modifiers
* 1. Private 
* 2. Default
* 3. Protected
* 4. public
*/ 

