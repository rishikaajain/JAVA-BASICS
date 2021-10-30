// "this" keyword is a reference
// we used "super" keyword for referencing the superclass
class k1{
    int a;
    
        k1(int a){
            this.a = a;
            // func(this) would be a valid statement for passing the 
            // reference of the current object to any function if required
        }

    public int getA() // (contains Parameter list)
    {
        return this.a;
    }   

}

class k2 extends k1{
    k2(int c){
        // super(); // will throw error
        super(c);
        System.out.println("I am a derived constructor");

    }
}


public class cwh_47_thisorsuper_keyword {

    public static void main(String[] args) {
        
          //    k1 k = new k1();   //will throw error as default constructor is not created
            k1 k = new k1(500); // k is a reference that is pointing/refering an object
          //  i.e. new k1(500) likewise "this" is also a keyword for the same
    
           //  k2 kk = new k2(54);
          //  System.out.println(k.getA());
         //  System.out.println(kk.getA());
    }
}
