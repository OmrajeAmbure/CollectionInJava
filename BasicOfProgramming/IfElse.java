package BasicOfProgramming;

import java.util.Scanner;

/**
 * Given marks of a student, print on the screen:
 *
 * Grade A if marks >= 90
 * Grade B if marks >= 70
 * Grade C if marks >= 50
 * Grade D if marks >= 35
 * Fail, otherwise.
 *
 * For printing use:-
 *
 * for C++ : cout << variable_name;
 * for Java : System.out.print();
 * for Python : print()
 * for Javascript : console.log()
 * for C# : Console.WriteLine();
 * for Go : fmt.Println()
 *
 * Examples:
 * Input: marks = 95
 * Output: Grade A
 *
 * Explanation: marks are greater than or equal to 90.
 *
 * Input: marks = 14
 * Output: Fail
 *
 * Explanation: marks are less than 35.
**/

public class IfElse {
    public static void studentGrade(int marks) {
            if (marks == 0){
                return;
            }
            if (marks>=90 && marks<=100){
                System.out.println("Grade A");
            }else if (marks>=70 && marks<=90){
                System.out.println("Grade B");
            } else if (marks>=50 && marks<=70) {
                System.out.println("Grade C");
            } else if (marks>=35 && marks<=50) {
                System.out.println("Grade D");
            }else {
                System.out.println("Fail");
            }
    }

    public static void main(String[] args) {
        System.out.println("Enter Your Marks For Checking :- ");
        Scanner sc = new Scanner(System.in);
        short marks = sc.nextShort();
        studentGrade(marks);
    }
}
