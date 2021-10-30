class Base1{
    Base1(){
        System.out.println("I am a Constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with x as: "+x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        // Very useful "Super" Keyword to call other than default parent class constructors or custom constructors
         super();
        // super(5);

        System.out.println("I am a derived class constructor");
    }
    
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived with y as: "+y);
    }
}

class childOfDerived extends Derived1{
    childOfDerived(){
        System.out.println("I am a child of derived Constructor");
    }
    childOfDerived(int x,int y,int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of childOfDerived with y as: "+z);
        
    }
}

public class cwh_46_constructors_in_inheritance {

    public static void main(String[] args) {
        //  Base1 b = new Base1(0);
        // Derived1 d = new Derived1();
        //  Derived1 d1 = new Derived1(5,2);
        // childOfDerived cd = new childOfDerived();
        childOfDerived cd = new childOfDerived(42,23,12);
    }
}
