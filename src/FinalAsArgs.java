public class FinalAsArgs {
    void m1(final int m) {
        // m = m * 2; error: final parameter m may not be assigned
        System.out.println(m);
    }
    public static void main(String[] args) {
        FinalAsArgs obj = new FinalAsArgs();
        obj.m1(10);
    }
}
