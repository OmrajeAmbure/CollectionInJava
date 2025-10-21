package BasicOfProgramming;

public class GCD {
        public static int GCD(int n1, int n2) {
               // find max of n1 and n2
                int max = Math.max(n1,n2);
                for(int i=2;i<max;i++){
                    if (n1%i==0 && n2%i==0){
                        return  i;
                    }
                }
                return 1;
        }
    public static int GCDByUsingEuclideanalgorithm(int n1, int n2) {
        while (n2!=0){
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
        public static void main(String[] args) {
            /*
                it means example:-  6 star and 4 moon --> 2 is comman divisor
                6 chocalate and 4 candi distribute ---> in 3 person
             */
                System.out.println(GCD(12,18));
                System.out.println(GCDByUsingEuclideanalgorithm(12,18));
        }
}
