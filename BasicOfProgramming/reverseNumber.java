package BasicOfProgramming;

public class reverseNumber {
    public static int reverseNumberNative(int n) {
        int ans = 0;
        while (n!=0){
            int last =  n%10;
            ans = (ans *  10) + last;
            n = n/10;
        }
        return ans;
    }
    public int reverseOptimze(int x) {
        int ans = 0;
        while (x != 0) {
            int last = x % 10;

            // Overflow check before multiplying by 10
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && last > 7)) return 0;
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && last < -8)) return 0;

            ans = ans * 10 + last;
            x /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n =25;
        System.out.println(reverseNumberNative(n));
    }
}
