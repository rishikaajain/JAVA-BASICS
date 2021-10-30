abstract class pen{
    abstract  public void write();
    abstract  public void refill();
}
class foundationpen extends pen{
    public void changenib(){
        System.out.println("Changing the pen nib...");
    }
   public void write(){
        System.out.println("Writing the notes....");
    }
   public  void refill() {
        System.out.println("Refilling the pen....");
    } 
}
//,,,,,,,,,,,,,,,,,,,
interface basicanimals{
    void eat();
    void sleep();
}
class monkey{
    public void jump(){
        System.out.println("Jumping...");
    }
    public void bite(){
        System.out.println("Biting...");
    }
}
class human extends monkey implements basicanimals{
    public void speak(){
        System.out.println("Hello Sir , Hello Mam");
    } 
    @Override
    public void eat(){
       System.out.println("Eating...");
     }
     @Override
     public void sleep(){
       System.out.println("Sleeping...");
     }
}
//...............
abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class sphone extends telephone{
    void play(){
        System.out.println("playing.....");
    }
    void ring(){
        System.out.println("Ringing.....");
    }
    void lift(){
        System.out.println("Lifting.....");
    }
    void disconnect(){
        System.out.println("Disconnect!");
    }
}
public class cwh_60 {
    public static void main(String[] args) {
        foundationpen pen=new foundationpen();
        pen.changenib();
        human h=new human();
        h.bite();
        h.eat();
        h.sleep();
        h.jump();
        h.speak();
        //polymorphism
        monkey m1=new human();
        m1.bite();
        m1.jump();
     //   m1.sleep();//will throw error
       //polymorphism
       telephone t=new sphone();
       t.ring();
       t.disconnect();
      // t.play();//will throw error
    }
}
