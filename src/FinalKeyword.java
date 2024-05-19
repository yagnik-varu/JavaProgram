public class FinalKeyword {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
    }   
}

class Bike {
    final int a = 10;
    final int b ; // Uninitialized final varibale ( Blank Final Variable )

    Bike() {
        // a = 150;  // You can't change Final variable
        b = 10; 
    }
    void run() {
        System.out.println("Running...");
    }
}
