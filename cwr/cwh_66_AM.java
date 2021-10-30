 //Modifire          class          Package          Subclass          World 

// Public               Y                   Y                        Y                      Y

// protected          Y                   Y                        Y                      N   

// Default (no)       Y                   Y                        N                      N 

// Private              Y                   N                       N                   N

package cwr;
import Rishi.cwh_66_parent;
// import Rishi.*;



class C1{
    public int x = 5;
    protected int y =45;
    int z = 6;
    private int a = 78;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

class Using extends cwh_66_parent{
    public void meth5(){
        System.out.println(a);
        System.out.println(b);
        // System.out.println(c); // throws error
        // System.out.println(d); // throws error
    }
} 
public class cwh_66_AM {
    public static void main(String[] args) {
        C1 c = new C1();
        // c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a);

        cwh_66_parent obj = new cwh_66_parent();
        System.out.println(obj.a);
        obj.methNew();
        // System.out.println(obj.b); // throws error
        // System.out.println(obj.c); // throws error
        // System.out.println(obj.d); // throws error

        Using us = new Using();
        us.meth5();
        us.methNew();
    }
}

