package Java.Core;

public class ContinueBreak { //2
    public static void main(String[] args) {

//        for (int i=1; i<=5; i++) {
//            for(int j=1; j<=5; j++) {
//                if (i==j) {
//                    continue;
//                }
//                System.out.println(i + " " + j);
//            }
//        }

//        aa:
//        for (int i=1; i<=3; i++) {
//            bb:
//            for(int j=1; j<=3; j++) {
//                if (i==2 && j==2) {
//                    continue bb;
//                }
//                System.out.println(i + " " + j);
//            }
//        }


        String txt = "testing";
        for (int i=0; i<txt.length(); i++) {
            if (txt.charAt(i) == 'i') {
                break;
            }
            System.out.print(txt.charAt(i));
        }
        System.out.println();


        for (int i=0; i<txt.length(); i++) {
            if (txt.charAt(i) == 'i') {
                continue;
            }
            System.out.print(txt.charAt(i));
        }

        System.out.println();

        for (int i=0; i<=10; i++) {
            if (i==5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
