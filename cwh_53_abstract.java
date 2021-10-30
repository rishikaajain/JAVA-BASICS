//if a class having  atleast one   abstract method then the class is known as abstract class
abstract class parent{
    public parent(){
        System.out.println("I am a parent constructor!");
    }
    public void sayhello(){
        System.out.println("Hello!");
    }
    abstract public void greet();
}
class child extends parent{ //concerte class
    @Override
    public void greet(){
    System.out.println("Good Morning Rishika.");
    System.out.println("Have a nice day !");
}
}
 abstract class child2 extends parent{
    public void sayBye(){
        System.out.println("Bye bye Rishika!");
    }
}
public class cwh_53_abstract {
    public static void main(String[] args) {
       // parent p=new parent();//will throw error
       //abstract clss ka obj ni bn skta 
       child c=new child();
       c.greet();
       c.sayhello();
    //    child2 c1=new child2();//wil throw error
    //child 2 and parent class are abstract class!

    }
}
