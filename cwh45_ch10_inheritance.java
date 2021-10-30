
class Base // base / parent / super (class)  --> Access Modifier of class will be default
{
    int x;

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    public void printMe(){
        System.out.println("I am a Constructor");
    }
}

class Derived extends Base // Derived / child / sub (class)
{
    int y;

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

}

public class cwh45_ch10_inheritance {
    public static void main(String[] args) {
        // Creating an object of base class
        Base b = new Base();
        b.setX(45);
        System.out.println(b.getX());

        // Creating an object of derived class
        Derived d = new Derived();
        d.setX(51);
        System.out.println(d.getX());
    }
}
