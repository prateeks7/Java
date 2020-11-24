package program;

public class Program {
    public static void main(String[] args) {
       int a=4,b=8,c=9,d,e;
       
       double x=3.0,y=6.5,z,k;
       
       d=c/a;
       System.out.println("d ="+d);
       k=a+y;
       System.out.println("k ="+k);
       e=a+(int)y;
       System.out.println("e ="+e);
       z = (double)c/a;/* IF WE REMOVE (DOUBLE) the answer will be integer by integer ie 2 and then 2 will convert to double.*/
       System.out.println("z ="+z);
       
       
    }
    
}
