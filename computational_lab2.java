 class computational_lab2
 {
   public static void main(String args[])
   {
    double F=100,Rf=0.5,Rw=0.33,a=2.16,b,c,d,e,W;
    b=(1-Rw)/(1-Rf);
    c=(Rf*b)/Rw;
    d=1/(a-1);
    e=(d*Math.log(c))+ Math.log(b);
    W=F/Math.exp(e);
    System.out.println(W);
   } 
}
