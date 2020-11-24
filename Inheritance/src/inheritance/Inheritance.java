package inheritance;
class A{
    int j,k;
    void displayA()
    {
        System.out.println(j+" "+k);
    }
}
class B extends A{
    int m;
    void displayB()
    {
       
        System.out.println(j+" "+k+" "+m);
    }
}
class C extends B{
    void displayC()   
    {
        System.out.println(j+" "+k+" "+m);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        C ob = new C();
        ob.j=10;
        ob.k=20;
        ob.m=30;
        ob.displayC();
        ob.displayB();
        ob.displayA();
    }
    
}
