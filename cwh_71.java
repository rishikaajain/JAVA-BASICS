class mythreadrunnable implements Runnable{
    public void run(){
        System.out.println("creation of thread1 using runnable method");
        System.out.println("creation of thread1 using runnable method");
        System.out.println("creation of thread1 using runnable method");
        System.out.println("creation of thread1 using runnable method");
        System.out.println("creation of thread1 using runnable method");
        System.out.println("creation of thread1 using runnable method");
        System.out.println("creation of thread1 using runnable method");
    }
}
class mythreadrunnable1 implements Runnable{
    public void run(){
        System.out.println("creation of thread2 using runnable method");
        System.out.println("creation of thread2 using runnable method");
        System.out.println("creation of thread2 using runnable method");
        System.out.println("creation of thread2 using runnable method");
        System.out.println("creation of thread2 using runnable method");
        System.out.println("creation of thread2 using runnable method");
        System.out.println("creation of thread2 using runnable method");
    }
}
public class cwh_71 {
    public static void main(String[] args) {
        mythreadrunnable bullet1=new mythreadrunnable();
        Thread gun1=new Thread(bullet1);
        mythreadrunnable1 bullet2=new mythreadrunnable1();
        Thread gun2=new Thread(bullet2);
        
        gun1.start();
        gun2.start();
    }
}
