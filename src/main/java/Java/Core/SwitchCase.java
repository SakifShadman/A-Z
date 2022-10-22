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
    }
}