/*
Create two threads and assign names ‘Scooby’ and ‘Shaggy’ to the two threads. Display both thread names.
 */
 
public class TwoThreads {
    public static void main(String[] args) {
        Thread obj = new Thread("Scooby"){
            public void run(){
                System.out.println(Thread.currentThread().getName());
            }
        };
        Thread obj1 = new Thread("Shaggy"){
            public void run(){
                System.out.println(Thread.currentThread().getName());
            }
        };
        obj.start();
        obj1.start();
    }
}

//with lambda function
/*
public class TwoThreads{
public static void main(String args[]){
    Thread obj = new Thread( () -> {
        Thread.currentThread().setName("Scooby");
        System.out.println(Thread.currentThread().getName());
    });
    obj.start();

    Thread obj1 = new Thread(() -> {
        Thread.currentThread().setName("Shaggy");
        System.out.println(Thread.currentThread().getName());
    });

        obj1.start();
      }
 }
*/
