public class P1_LoopFactorial {
    
    static int factorial(int num) {
        num = (num > 0) ? num : -num;
        int fact = 1;
        for (int i = 2; i <= num; fact *= i++);
        return fact;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(factorial(i));
        }
    }
}
