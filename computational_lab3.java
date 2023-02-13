 import java.util.*;
 class computational_lab3
{
 public static void main(String args[])
 {
    Scanner in =new Scanner (System.in);
    int i,p=1;
    double x,iar,a,g,f;
    System.out.println("Enter initial approximated root");
    iar=in.nextDouble();
    x=iar;
    System.out.println("Enter number of iterations");
    i=in.nextInt();
    for(int j=0;j<i;j++)
    {
        f=(x*x*x)-x-1;
        g=3*x*x-1;
        a=x-(f/g);
        System.out.println("x"+ p++ +"  "+a);
        x=a;
        a=0;
    }
 }   
}
