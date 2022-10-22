package Java.Collections.Mixed;

public class EnumSetAndMap { //1
    public static void main(String[] args) {

        //Java EnumSet class is the specialized Set implementation for use with enum types. It inherits AbstractSet class and implements the Set interface.
        /*
        enum days {
            SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
        }
        public class EnumSetExample {
            public static void main(String[] args) {
                Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);
                // Traversing elements
                Iterator<days> iter = set.iterator();
                while (iter.hasNext())
                    System.out.println(iter.next());
            }
        }
         */


        //Java EnumMap class is the specialized Map implementation for enum keys. It inherits Enum and AbstractMap classes.
        /*
        public class EnumMapExample {
            // create an enum
            public enum Days {
                Monday, Tuesday, Wednesday, Thursday
            };
            public static void main(String[] args) {
                //create and populate enum map
                EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);
                map.put(Days.Monday, "1");
                map.put(Days.Tuesday, "2");
                map.put(Days.Wednesday, "3");
                map.put(Days.Thursday, "4");
                // print the map
                for(Map.Entry m:map.entrySet()){
                    System.out.println(m.getKey()+" "+m.getValue());
                }
            }
        }
         */
    }
}
