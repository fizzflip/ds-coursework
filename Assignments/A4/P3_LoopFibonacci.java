public class P3_LoopFibonacci {
    static void fibonacci(int n) {
        if (n <= 1) return;
        System.out.println("0\n1");
        int sum, a = 1, b = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            System.out.println(sum);
            b = a;
            a = sum;
        }
    }
    
    public static void main(String[] args) {
        fibonacci(10);
    }
}