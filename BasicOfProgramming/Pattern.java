package BasicOfProgramming;

public class Pattern {
    public static void squarePattern(){
        /*
                *  *  *  *  *  *
                *  *  *  *  *  *
                *  *  *  *  *  *
                *  *  *  *  *  *
                *  *  *  *  *  *
         */
        for(int i=0;i<4;i++){
            System.out.println();
            for (int j=0;j<=4;j++){
                System.out.print(" * ");
            }
        }
    }
    public static void starPattern1(){
        System.out.println();
        /*
         *
         *  *
         *  *  *
         *  *  *  *
         *  *  *  *  *
         */
        for(int i=0;i<=4;i++){
            System.out.println();
            for (int j=0;j<=i;j++){
                System.out.print(" * ");
            }
        }
    }
    public static void numberPattern1(){
        System.out.println();
        /*
            1
            1  2
            1  2  3
            1  2  3  4
            1  2  3  4  5
         */
        for(int i=0;i<=5;i++){
            System.out.println();
            for (int j=1;j<=i;j++){
                System.out.print(" "+j+" ");
            }
        }
    }
    public static void numberPattern2(){
        System.out.println();
        /*
            1
            2  2
            3  3  3
            4  4  4  4
            5  5  5  5  5
         */
        for(int i=0;i<=5;i++){
            System.out.println();
            for (int j=1;j<=i;j++){
                System.out.print(" "+i+" ");
            }
        }
    }
    public static void starPattern2(){
        System.out.println();
        /*
         *  *  *  *  *
         *  *  *  *
         *  *  *
         *  *
         *
         */
        for(int i=4;i>=0;i--){
            System.out.println();
            for (int j=0;j<=i;j++){
                System.out.print(" * ");
            }
        }
    }
    public static void numberPattern3(){
        System.out.println();
        /*
         1  2  3  4  5
         1  2  3  4
         1  2  3
         1  2
         1
         */
        for(int i=5;i>=0;i--){
            System.out.println();
            for (int j=1;j<=i;j++){
                System.out.print(" "+j+" ");
            }
        }
    }
    public static void starPattern4(){
        System.out.println();
        /*
                                    *
                                *  *  *
                            *  *  *  *  *
                        *  *  *  *  *  *  *
                    *  *  *  *  *  *  *  *  *
         */
        for(int i=0;i<5;i++){
            for (int s=0;s<5-i-1;s++){
                System.out.print("    ");
            }
            for (int j=0;j< 2 * i + 1;j++){
                System.out.print("*   ");
            }
            for (int s = 0; s < 5 - i - 1; s++) {
                System.out.print("   ");
            }
            System.out.println();
        }
    }
    public static void starPattern5(){
            System.out.println();
        /*
                   *  *  *  *  *  *  *  *  *  *
                      *  *  *  *  *  *  *  *
                          *   *  *  *  *
                               *  *  *
                                  *
         */
            for(int i=4;i>=0;i--){
                for (int s=0;s<5-i-1;s++){
                    System.out.print("    ");
                }
                for (int j=0;j< 2 * i + 1;j++){
                    System.out.print("  * ");
                }
                for (int s = 0; s < 5 - i - 1; s++) {
                    System.out.print("   ");
                }
                System.out.println();
            }
    }
    public static void comdinePattern4_5(){
        /*
                         *
                     *  *  *
                 *  *  *  *  *
             *  *  *  *  *  *  *
         *  *  *  *  *  *  *  *  *
      *  *  *  *  *  *  *  *  *  *  *
           *  *  *  *  *  *  *  *
               *   *  *  *  *
                    *  *  *
                       *
        */

        for(int i=0;i<6;i++){
            for (int s=0;s<6-i-1;s++){
                System.out.print("    ");
            }
            for (int j=0;j< 2 * i + 1;j++){
                System.out.print("*   ");
            }
            for (int s = 0; s < 6 - i - 1; s++) {
                System.out.print("   ");
            }
            System.out.println();
        }
        for(int i=6-2;i>=0;i--){
            for (int s=0;s<6-i-1;s++){
                System.out.print("   ");
            }
            for (int j=0;j< 2 * i + 1;j++){
                System.out.print("  * ");
            }
            for (int s = 0; s < 6 - i - 1; s++) {
                System.out.print("    ");
            }
            System.out.println();
        }
    }
    public static void starPattern6(){
        /*
             *
             *  *
             *  *  *
             *  *  *  *
             *  *  *  *  *
             *  *  *  *  *  *
             *  *  *  *  *
             *  *  *  *
             *  *  *
             *  *
             *
         */
        for (int i=0;i<5;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        for (int i=5;i>=0;i--){
            for (int j=0;j<=i;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    public static void starPattern7(){
        /*
                1
                0  1
                1  0  1
                0  1  0  1
                1  0  1  0  1
         */
        int strart ;
        for (int i=0;i<5;i++){
            if (i%2==0){
                strart = 1;
            }else {
                strart = 0;
            }
            for (int j=0;j<=i;j++){
                System.out.print(strart);
                strart = 1 - strart;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        squarePattern();
        starPattern1();
        numberPattern1();
        numberPattern2();
        starPattern2();
        numberPattern3();
        starPattern4();
        starPattern5();
        comdinePattern4_5();
        starPattern6();
        starPattern7();
    }
}
