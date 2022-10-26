package Java.Core;

public class JavaThreads { //9
    public static void main(String[] args) {

        //Multithreading in Java is a process of executing multiple threads simultaneously.

        //Advantages of Java Multithreading
        //1) It doesn't block the user because threads are independent, and you can perform multiple operations at the same time.
        //2) You can perform many operations together, so it saves time.
        //3) Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.

        //What is Thread in java?
        //A thread is a lightweight subprocess, the smallest unit of processing. It is a separate path of execution.
        //Threads are independent. If there occurs exception in one thread, it doesn't affect other threads. It uses a shared memory area.

        //The java thread states (life cycle) are as follows:
        //New
        //Runnable
        //Running
        //Blocked/Waiting
        //Stop (Terminated)


        //Thread Scheduler in Java
        //A component of Java that decides which thread to run or execute and which thread to wait is called a thread scheduler in Java. In Java, a thread is only chosen by a thread scheduler if it is in the runnable state. However, if there is more than one thread in the runnable state, it is up to the thread scheduler to pick one of the threads and ignore the other ones. There are some criteria that decide which thread will execute first. There are two factors for scheduling a thread i.e. Priority and Time of arrival.
        //Priority: Priority of each thread lies between 1 to 10. If a thread has a higher priority, it means that thread has got a better chance of getting picked up by the thread scheduler.
        //Time of Arrival: Suppose two threads of the same priority enter the runnable state, then priority cannot be the factor to pick a thread from these two threads. In such a case, arrival time of thread is considered by the thread scheduler. A thread that arrived first gets the preference over the other threads.


        //The Java Thread class provides the two variant of the sleep() method. First one accepts only an arguments, whereas the other variant accepts two arguments. The method sleep() is being used to halt the working of a thread for a given amount of time. The time up to which the thread remains in the sleeping state is known as the sleeping time of the thread. After the sleeping time is over, the thread starts its execution from where it has left.

        //3 constants defined in Thread class:
        //public static int MIN_PRIORITY
        //public static int NORM_PRIORITY
        //public static int MAX_PRIORITY
        //Default priority of a thread is 5 (NORM_PRIORITY). The value of MIN_PRIORITY is 1 and the value of MAX_PRIORITY is 10.

        //Java Runtime class
        //Java Runtime class is used to interact with java runtime environment. Java Runtime class provides methods to execute a process, invoke GC, get total and free memory etc. There is only one instance of java.lang.Runtime class is available for one java application.
        //The Runtime.getRuntime() method returns the singleton instance of Runtime class.
    }
}
