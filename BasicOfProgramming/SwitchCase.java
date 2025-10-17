package BasicOfProgramming;

/**
 * Given the integer day denoting the day number, print on the screen which day of the week it is. Week starts from Monday and for values greater than 7 or less than 1, print Invalid.
 * Ensure only the 1st letter of the answer is capitalised.
 * For printing use:-
 * for C++ : cout << variable_name;
 * for Java : System.out.print();
 * for Python : print()
 * for Javascript : console.log()
 *
 * Examples:
 * Input: day = 3
 * Output: Wednesday
 *
 * Input: day = 8
 * Output: Invalid
**/
public class SwitchCase {
    public static void whichWeekDay(int day) {
        if (day == 0){
            return;
        }
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            case 8 -> System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        whichWeekDay(3);
        whichWeekDay(8);
    }
}
