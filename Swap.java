public class Swap

{
   public static void main(String[] args)
{
    int a=10;
    int b=20;

   System.out.println("before swap");
   System.out.println("a: "+a);
   System.out.println("b: "+b);

    int temp=b;
    b=a;
    a=temp;

    System.out.println("after swap");
    System.out.println("a: "+a);
    System.out.println("b: "+b);
}
}