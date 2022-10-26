package Java.Core;

public class StringConcept {
    public static void main(String[] args) { //6

        //String is an object that represents sequence of char values
        //The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.
        //The CharSequence interface is used to represent the sequence of characters.
        //String, StringBuffer and StringBuilder classes implement CharSequence.
        //It means, we can create strings in Java by using these three classes.
        //The Java String is immutable which means it cannot be changed.
        //Whenever we change any string, a new instance is created.
        //For mutable strings, you can use StringBuffer and StringBuilder classes.


        //There are two ways to create String object: By string keyword(literal) and By new keyword
        //By string keyword(literal)
        String s = "welcome"; //Each time you create a string literal, the JVM checks the "string constant pool" first. If the string already exists in the pool, a reference to the pooled instance is returned. If the string doesn't exist in the pool, a new string instance is created and placed in the pool.
        String s1 = "Welcome";
        String s2 = "Welcome"; //It doesn't create a new instance

        //String objects are stored in a special memory area known as the "string constant pool".

        //Why Java uses the concept of String literal?
        //To make Java more memory efficient (because no new objects are created if it exists already in the string constant pool).

        //By new keyword
        String ss = new String("Welcome"); //creates two objects and one reference variable
        //In such case, JVM will create a new string object in normal (non-pool) heap memory, and the literal "Welcome" will be placed in the string constant pool. The variables will refer to the object in a heap (non-pool).


        //Immutable String
        //Once String object is created its data or state can't be changed but a new String object is created.
        String st = "Sachin";
        st.concat(" Tendulkar"); //concat() method appends the string at the end
        System.out.println(st);

        //Why String objects are immutable in Java?
        //As Java uses the concept of String literal. Suppose there are 5 reference variables, all refer to one object "Welcome". If one reference variable changes the value of the object, it will be affected by all the reference variables. That is why String objects are immutable in Java.

        //Why String class is Final in Java?
        //The reason behind the String class being final because no one can override the methods of the String class. So that it can provide the same features to the new String objects as well as to the old ones.


        //There are three ways to compare String in Java:
        //By Using equals() Method: The String class equals() method compares the original content of the string. It compares values of string for equality

        //By Using == Operator: The == operator compares references not values.
        String ss1="Sachin";
        String ss2="Sachin";
        String ss3=new String("Sachin");
        System.out.println(ss1==ss2);//true (because both refer to same instance)
        System.out.println(ss1==ss3);//false(because ss3 refers to instance created in nonpool)

        //By compareTo() Method:
        //The String class compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.
        //Suppose s1 and s2 are two String objects. If:
        //s1 == s2 : The method returns 0.
        //s1 > s2 : The method returns a positive value.
        //s1 < s2 : The method returns a negative value.
        String r1="Nafis";
        String r2="Sakif";
        String r3="Shadman";
        System.out.println(r1.compareTo(r2));//0
        System.out.println(r1.compareTo(r3));//1(because s1>s3)
        System.out.println(r3.compareTo(r1));//-1(because s3 < s1 )


        //In Java, String concatenation forms a new String that is the combination of multiple strings. There are two ways to concatenate strings in Java:
        //By + (String concatenation) operator
        //By concat() method
        //In Java, String concatenation is implemented through the StringBuilder (or StringBuffer) class and it's append method.


        //Substring in Java
        //A part of String is called substring. In other words, substring is a subset of another String. In case of substring() method startIndex is inclusive and endIndex is exclusive.

        //split() method stored in an array of String objects sentences.
        //The Java String toUpperCase() method converts this String into uppercase letter and String toLowerCase() method into lowercase letter.
        //The String class trim() method eliminates white spaces before and after the String.
        //The method startsWith() checks whether the String starts with the letters passed as arguments and endsWith() method checks whether the String ends with the letters passed as arguments. It returns boolean.
        //The String class charAt() method returns a character at specified index.
        //The String class length() method returns length of the specified String.
        //The String class valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into String.
        //The String class replace() method replaces all occurrence of first sequence of character with second sequence of character.


        //Java StringBuffer class is used to create mutable (modifiable) String objects. The StringBuffer class in Java is the same as String class except it is mutable(it can be changed).
        //Java StringBuffer class is thread-safe so multiple threads cannot access it simultaneously. So it is safe and will result in an order.

        //What is a mutable String?
        //A String that can be modified or changed is known as mutable String. StringBuffer and StringBuilder classes are used for creating mutable strings

        //The append() method concatenates the given argument with this String.
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java");//now original string is changed
        System.out.println(sb);//prints Hello Java

        //The insert() method inserts the given String with this string at the given position.
        //The replace() method replaces the given String from the specified beginIndex and endIndex(excluded).
        //The delete() method of the StringBuffer class deletes the String from the specified beginIndex to endIndex(excluded).
        //The reverse() method of the StringBuilder class reverses the current String.
        sb.reverse();
        System.out.println(sb);


        //Java StringBuilder class is used to create mutable (modifiable) String. The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized. It is available since JDK 1.5.
        StringBuilder sb1 = new StringBuilder("Hello ");
        sb1.append("Java");//now original string is changed
        System.out.println(sb1);//prints Hello Java


        //String vs StringBuffer
        //The String class is immutable. String is slow and consumes more memory when we concatenate too many strings because every time it creates new instance. String class uses String constant pool.
        //The StringBuffer class is mutable. StringBuffer is fast and consumes less memory when we concatenate two strings. StringBuffer uses Heap memory


        //StringBuffer vs StringBuilder
        //StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously. StringBuffer is less efficient than StringBuilder.
        //StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously. StringBuilder is more efficient than StringBuffer.


        //Java toString() Method
        //If you want to represent any object as a string, toString() method comes into existence.
        //The toString() method returns the String representation of the object.
        //If you print any object, Java compiler internally invokes the toString() method on the object. So overriding the toString() method, returns the desired output
    }
}
