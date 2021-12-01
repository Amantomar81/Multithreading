/*
Create three threads- with different priorities – MAX, MIN, NORM- and start the threads at the same time.
Observe the completion of the threads. (Thread priorities concept)
 */
public class Priorities extends Thread
{
    public void run()
    {
        System.out.println("Thread Priority:"+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Priorities t = new Priorities();
        Priorities s = new Priorities();
        Priorities d = new Priorities();
        t.setPriority(MIN_PRIORITY);
        s.setPriority(MIN_PRIORITY);
        d.setPriority(NORM_PRIORITY);
        t.start();
        s.start();
        d.start();
    }

}
