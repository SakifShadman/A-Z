package Java.Core;

public class ConcatTest{ //7
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i=0; i<10000; i++){
            sb.append("Tpoint");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i=0; i<10000; i++){
            sb2.append("Tpoint");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}

//public class ConcatTest{
//    public static String concatWithString()    {
//        String t = "Java";
//        for (int i=0; i<10000; i++){
//            t = t + "Tpoint";
//        }
//        return t;
//    }
//    public static String concatWithStringBuffer(){
//        StringBuffer sb = new StringBuffer("Java");
//        for (int i=0; i<10000; i++){
//            sb.append("Tpoint");
//        }
//        return sb.toString();
//    }
//    public static void main(String[] args){
//        long startTime = System.currentTimeMillis();
//        concatWithString();
//        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");
//        startTime = System.currentTimeMillis();
//        concatWithStringBuffer();
//        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");
//    }
//}