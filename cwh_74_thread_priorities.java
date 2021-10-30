/* three types of priorities are available :-
1 min priority:-1
2 norm priority:-5
3 max priority:-10
*/
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 34;
       while(i<=30){
        System.out.println("Hello"+this.getName());
       }
    }
}
public class cwh_74_thread_priorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Rishika (most important)");
        MyThr1 t2 = new MyThr1("Kishan");
        MyThr1 t3 = new MyThr1("Aman");
        MyThr1 t4 = new MyThr1("Stuti");
        MyThr1 t5 = new MyThr1("John");
        t1.setPriority(Thread.MAX_PRIORITY);
        // t2.setPriority(Thread.NORM_PRIORITY);
        // t3.setPriority(Thread.MIN_PRIORITY);
        // t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
