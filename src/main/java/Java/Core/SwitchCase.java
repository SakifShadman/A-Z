package Java.Core;

public class SwitchCase { //3
    public static void main(String[] args) {

        String day = "Tuesday";

        switch (day) {
            case "Monday":
                System.out.println("Study Java");
                break;
            case "Tuesday":
                System.out.println("Study Selenium");
                break;
            case "Wednesday":
                System.out.println("Study Testng");
                break;
            case "Thursday":
                System.out.println("Study Cucumber");
                break;
            case "Friday":
                System.out.println("Study Basics");
                break;
            case "Saturday":
                System.out.println("Study Everything");
                break;
            case "Sunday":
                System.out.println("No study");
                break;
            default:
                System.out.println("invalid day");
        }

        //if-else conditional branches are great for variable conditions that result into Boolean. It is either if-statement will be executed, or else-statement is executed.
        //Switch statements are ideal for fixed data values. Switch case statement executes one case after another till a break statement appears or until the end of the switch statement is reached.

        //Choosing one over the other is not that straightforward. Here are some tips when choosing one over the other;

        //You can use if-else when:
        //The condition result is a boolean.
        //The conditions are complex. For example, you have conditions with multiple logical operators.

        //You can use a switch-case when:
        //There are multiple choices for an expression.
        //The condition is based on a predefined set of values such as enums, constants, known types. For example, error codes, statuses, states, object types, etc.
    }
}