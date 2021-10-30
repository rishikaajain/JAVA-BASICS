package shape;

class square{
    public double area(int l){
       return l*l;
    }
}
class rec extends square{
    int l;
    int b;

    public int getL() {
        return this.l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double area(int l,int b){
      return l*b;
    }
}
class circle extends rec{
    public double area (int r){
      return 2*Math.PI*r;
    }
}


public class cwh_68 {
    public static void main(String[] args) {
        square s=new square();
        rec r=new rec();
        circle c=new circle();
        System.out.println( s.area(4)); 
        System.out.println( r.area(4,5)); 
        System.out.println( c.area(4)); 
    }
}

//javac cwh_68.java
//javac -d . *.java
//java shape.cwh_68
