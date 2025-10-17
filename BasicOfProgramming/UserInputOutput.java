package BasicOfProgramming;

import java.util.Scanner;
/**
 * Complete the function printNumber which takes an integer input from the user and prints it on the screen.
 * Use:-
 * for C++ : cout << variable_name;
 * for Java : System.out.print();
 * for Python : print()
 * for Javascript : console.log()
 *
 * Examples:
 * Input(user gives value): 7
 * Output: 7
 *
 * Input(user gives value): -5
 * Output: -5
**/

public class UserInputOutput {
    public void printNumber(Scanner sc){
        System.out.println("Enter The Input :- ");
        int num = sc.nextInt();
        System.out.println(num);
    }

    public static void main(String[] args) {
        UserInputOutput inputOutput = new UserInputOutput();
        Scanner sc = new Scanner(System.in);
        inputOutput.printNumber(sc);
    }
}
