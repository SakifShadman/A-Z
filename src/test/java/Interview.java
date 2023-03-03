public class Interview {

    public static void main(String[] args) {

        int[] num = {1,4,3,5,2,6};

        for (int i = 0; i<num.length; i++) {
            for (int j=i+1; j<num.length; j++) {
                if (num[i] + num[j] == 6) {
                    System.out.println(num[i] + " and " + num[j] + " returns equals of 6");
                }
            }
        }
    }
}
