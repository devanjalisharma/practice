import java.util.*;
class lab1
{
    public static void main(String args[])
    {
        double v1,v2,t2,t1,k300=0.07,V=5,Vo=10,E=8500,Co=2,a,b,x,c,CAo,k350,R=8.314,FAo=0,s,i;
        Scanner in=new Scanner(System.in);
        System.out.println("enter volume of 2 tanks");
        v1=in.nextDouble();
        v2=in.nextDouble();
        System.out.println("enter temperature");
        t1=in.nextDouble();
        t2=in.nextDouble();
        FAo=Co*V;
        CAo=FAo/Vo;
        System.out.println(CAo);
        a=(E/R)*((1/t1)-(1/t2));
        k350=k300*Math.exp(a);
        System.out.println(k350);
        b=(FAo/(k350*CAo*CAo*V))+2;
        x=b-Math.sqrt(b*b-4);
        System.out.println("for cstr"+x/2);
        i=(k300*v1/10);
        s=i/(1+i);
        System.out.println("for pfr"+s);
        if(x/2>s)
        System.out.println("CSTR is more efficient");
        else
        System.out.println("PFR is more efficient");
    }
}