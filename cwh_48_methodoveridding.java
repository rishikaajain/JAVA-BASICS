
class A{
    
    public int a;
    public int kishan(){
        return 24;
    }

    public void meth2(){
        System.out.println("I am a method of class A");
    }
}

class B extends A{
        // public void meth2(){
        //     System.out.println("I am a method of class B");
        // }
        
        // Override Notation is a notation that shows you have overriden a method
        @Override
        public void meth2(){
            System.out.println("I am a method of class B");
        }

        public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class cwh_48_methodoveridding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
        // b.meth3();
    
        
    }
}
