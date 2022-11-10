package Java.Core;

public class GCConcept { //10
    public static void main(String[] args) {

        //In java, garbage means unreferenced objects.
        //Garbage Collection is process of reclaiming the runtime unused memory automatically. In other words, it is a way to destroy the unused objects.

        //Advantage of Garbage Collection:
        //It makes java memory efficient because garbage collector removes the unreferenced objects from heap memory.
        //It is automatically done by the garbage collector(a part of JVM) so we don't need to make extra efforts.

        //How can an object be unreferenced?
        //By nulling the reference:
        GCConcept e = new GCConcept();
        e = null;
        //By assigning a reference to another
        GCConcept e1 = new GCConcept();
        GCConcept e2 = new GCConcept();
        e1 = e2;//now the first object referred by e1 is available for garbage collection
        //By anonymous object etc.
        new GCConcept();

        //finalize() method: The finalize() method is invoked each time before the object is garbage collected. This method can be used to perform cleanup processing
        //The Garbage collector of JVM collects only those objects that are created by new keyword. So if you have created any object without new, you can use finalize method to perform cleanup processing (destroying remaining objects).

        //gc() method: The gc() method is used to invoke the garbage collector to perform cleanup processing. The gc() is found in System and Runtime classes.

        //Neither finalization nor garbage collection is guaranteed.
    }
}
