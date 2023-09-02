package BasicsOfJava;
class A{
    public static void run(){
        System.out.println("A is RUNNING");
    }
    public void stop(){
        System.out.println("A is stopping");
    }
}
class B extends A{
    public static void running(){
        System.out.println("B is RUNNING");
    }
    public void stop(){
        super.stop();
        System.out.println("B is stopping");
    }
}


public class DynamicmethodDispatch {
    public static void main(String args[]){
        A obj= new B();
        obj .stop();
        A obj1= new A();
        obj1.run();

    }
}
