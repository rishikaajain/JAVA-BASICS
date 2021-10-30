//in java only one public class is possible
class employee{ //creating custom class
    int id;//attributes
    String name;//attributes
        public void printdetails(){ //method
        System.out.println("My Id is:-"+id);
        System.out.println("My Name is:-"+name);
    }
}
public class oopsintro {

    public static void main(String[] args) {
        employee e1=new employee();//Instantiating a new employee obj
        employee e2=new employee();//Instantiating a new employee obj
       //setting attributes
        e1.id=101;
        e1.name="Rishika";
        e2.id=102;
        e2.name="Aman";
        //method calling
        e1.printdetails();
        e2.printdetails();
    }
    
}
