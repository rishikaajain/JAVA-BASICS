class circle1{
    public int radius;

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    circle1(int radius)
    { 
        System.out.println("I am a circle paramaterized constructor!");
        this.radius=radius;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder1 extends circle1{
    public int height ;
     cylinder1(int radius,int height){
         super(radius);
         System.out.println("I am cylinder paramatrized constructor");
         this.height=height;
     }

    public double volm(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class cwh_52 {
    public static void main(String[] args) {
    circle1 c= new circle1(4);
    cylinder1 c1=new cylinder1(4, 5);
    System.out.println(c.area());
    System.out.println(c1.volm());
    }
}

