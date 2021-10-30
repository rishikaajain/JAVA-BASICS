
class mythread extends Thread{
    @Override
    public void run(){
        int i=1;
        while(i<=3){
          System.out.println("My thread is Running");
          System.out.println("using extending method");
          i++;
        }
    }
}
class mythread1 extends Thread{
    @Override
    public void run(){
        int i=1;
      while(i<=3){
          System.out.println("My thread 1 is Running");
          System.out.println("using same method");
      i++;
        }
    }
}
public class cwh_70 {
    public static void main(String[] args) {
        mythread t1=new mythread();
        mythread1 t2=new mythread1();
        t1.start();
        t2.start();
    }
}
