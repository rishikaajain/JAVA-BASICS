class Employee {
    int salary;
    String name;
    
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
class cellphone{
    public void ringing(){
       System.out.println("Ringing...."); 
    }
    public void vibrating(){
        System.out.println("Vibrating....");
    }
}
class square{
    int side;
    public int area(){
        System.out.println("Area of square is:-");
      return side*side;
    }
    public int perimeter(){
        System.out.println("perimeter Of Square is:-");
        return 4*side;
      }
}
class rectangle{
    int length;
    int breadth;
    public int area(){
        System.out.println("Area of rectangle is:-");
      return length*breadth;
    }
    public int perimeter(){
        System.out.println("perimeter Of rectangle is:-");
        return 2*(length+breadth);
      }
}
class circle{
    float radius;
    float pi=3.14f;
    public float area(){
        System.out.println("Area of circle is:-");
      return 3.14f*radius*radius;
    }
    public float perimeter(){
        System.out.println("perimeter Of circle is:-");
        return 2*3.14f*radius;
      }
 }
 class tomyvercity{
     public void hit(){
         System.out.println("Hiting........");
     }
     public void run(){
        System.out.println("Running........");
    }
    public void Fire(){
        System.out.println("firing........");
    }
 }
public class challenges7 {
    public static void main(String[] args) {
        //problem 1;
        Employee a=new Employee();
        a.setName("Rishika");
        a.salary=245;
        System.out.println(a.getName());
        System.out.println(a.getSalary());
        //--------------------------------
        cellphone c=new cellphone();
        c.ringing();
        c.vibrating();
        //-------------------------------
        square s=new square();
        s.side =2;
        System.out.println(s.area());
        System.out.println(s.perimeter());
        //--------------------------------
        rectangle r=new rectangle();
        r.length=2;
        r.breadth=4;
        System.out.println(r.area());
        System.out.println(r.perimeter());
        //--------------------------------
        circle c1=new circle();
        c1.radius=2.0f;
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        //---------------------------------
        tomyvercity t=new tomyvercity();
        t.Fire();
        t.run();
        t.hit();
    }
}
