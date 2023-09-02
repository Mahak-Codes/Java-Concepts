package BasicsOfJava;
class Function{
    final void s(int a){
        System.out.println("Value ="+a);
    }
}
class F2 extends Function{
    void s(int a,double b){
        System.out.println("Value ="+a);
        System.out.println("Value ="+b);
    }
}
public class finalkeyword {
    public static void main(String[] args) {
        Function obj=new Function();
        F2 obj1=new F2();
        final int  a=5;
        int b=6;
        obj.s(b);
        obj1.s(a,b);
//        System.out.println(a);
    }
}
