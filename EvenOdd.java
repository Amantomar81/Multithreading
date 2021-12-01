/*
Create two threads, one thread to display all even numbers between 1 & 20,
another to display odd numbers between 1 & 20.
Note: Display all even numbers followed by odd numbers
Hint: use join.     (use of join method and thread control mechanism)
 */
public class EvenOdd extends Thread
{
    public void run()
    {
        for (int i = 1; i <=20; i++)
        {
            if(i%2==0)
            {
                try {
                    System.out.println("even number:"+i);
                    Thread.sleep(1000);
                }
                catch (Exception d)
                {
                    d.printStackTrace();
                }
            }
        }
        System.out.println(".............");
    }
    public static void main(String[] args) throws InterruptedException {
        EvenOdd obj = new EvenOdd();
        obj.start();
        obj.join();

            for (int i = 1; i <=20 ; i++) {
                if (i%2!=0){
                    try {
                        System.out.println("odd numbers:"+i);
                        Thread.sleep(1000);
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }

    }
}
