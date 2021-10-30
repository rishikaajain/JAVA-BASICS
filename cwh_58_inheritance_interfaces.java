interface parentsample{
    void meth1();
    void meth2();
}
interface childsample extends parentsample{
    void meth3();
    void meth4();
}
//class cannot inhertied interface but one interface can inherited other interface
//class childsample extends parentsample{}//will thrw error
 
class mysampleclass implements childsample{
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    } 
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }   

}

public class cwh_58_inheritance_interfaces {
    public static void main(String[] args) {
        mysampleclass msc=new mysampleclass();
        msc.meth1();
        msc.meth2();
        msc.meth3();
        msc.meth4();
    }
}
