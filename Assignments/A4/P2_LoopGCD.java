public class P2_LoopGCD {
    
    static int gcd(int a, int b) {
        a = (a > 0) ? a : -a;
        b = (b > 0) ? b : -b;

        while (a != b) {
            if (a > b) a -= b;
            else b -= a;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(9, 27));
    }
}
