package ACMLABJAVA;

public class NewThread extends Thread implements Runnable{
    Thread t;

    NewThread(String name)
    {
        t= new Thread(this,name);
        t.start();
       // super(name);
        // start();


    }

//    NewThread()
//    {
//        t=new Thread(this,"ok");
//        System.out.println(t.getName());
//        t.start();
//    }
//    public void run()
//    {
//        try{
//            for(int i=5;i>0;i--) {
//                System.out.println(i);
//                Thread.sleep(1000);
//            }
//        }catch (InterruptedException e)
//        {
//            System.out.println(e);
//        }
//    }
public void run()
{
    try{
        for(int i=5;i>0;i--) {
            System.out.println(Thread.currentThread());
            System.out.println(i);
            Thread.sleep(5000);
        }
    }catch (InterruptedException e)
    {
        System.out.println(e);
    }
}

}

class DemoThread
{

    public static void main(String[] args) {
//        Thread t = Thread.currentThread();
//        System.out.println(t.getName());
//        t.setName("Shafi");
//        System.out.println(t);
//        new NewThread("Abid");
//        new NewThread("Rahman");
//        new NewThread("Rahman");



        // System.out.println(t.isAlive());


        NewThread t1 = new NewThread("Abid");
        NewThread t2 =    new NewThread("Rahman");
        NewThread t3= new NewThread("Rahman");

        t1.start();
        t2.start();
        t3.start();

        //Thread.MAX_PRIORITY();

       // t2.run();

        try{
            t1.t.join();
            t2.t.join();
            t3.t.join();
        }catch (InterruptedException e)
        {
            System.out.println(e);
        }

    }
}