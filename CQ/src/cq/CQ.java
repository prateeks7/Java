package cq;
import java.util.Scanner;
class Person
{
  Person(){}
}
class Actor extends Person
{
  int e1,l1;
  String n1,c1;
  Actor(String n,String c,int e,int l)
  {
      n1=n;
      c1=c;
      e1=e;
      l1=l;
  }
  public String toString()
  {
    return "The person "+n1+" is an Actor. He is " +c1+ " in color, has "+e1+ " eyes and debut in " +l1;
  }
  
}
class Actress extends Person
{
  int e1,l1;
  String n1,c1;
  Actress(String n,String c,int e,int l)
  {
     n1=n;
      c1=c;
      e1=e;
      l1=l;
  }
  public String toString()
  {
    return "The person "+n1+" is an Actress. He is " +c1+ " in color, has "+e1+ " eyes and debut in "+l1;
  }
}
public class CQ
{
 
 public static void main(String[] args) {
     
     String c,n;
    int e, l;
    Scanner s=new Scanner(System.in);
    n = s.nextLine();
    c = s.nextLine();
    e = Integer.parseInt(s.nextLine());
    l = Integer.parseInt(s.nextLine());
    Actor m = new Actor(n,c,e,l);
    n = s.nextLine();
    c = s.nextLine();
    e = Integer.parseInt(s.nextLine());
    l = Integer.parseInt(s.nextLine());
    Actress j = new Actress(n,c,e,l);
    System.out.println(m);
    System.out.println(j);
    }
}

/*public String toString(){
     return("The person "+n+" is an Actress. She is "+c+" in color, has "+e+" eyes and debut in "+d);*/