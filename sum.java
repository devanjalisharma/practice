import java.util.*;
class Solution
 {
    public static void main(String args[]) 
    {
        Scanner in =new Scanner(System.in);
        int l,target=0;
        System.out.println("total number of digits in array are");
        l=in.nextInt();
        System.out.println("enter target");
        target=in.nextInt();
        int nums[]=new int[target];
        System.out.println("Enter digits in array");
        for(int m=0;m<l;m++)
        nums[m]=in.nextInt();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if((nums[i]+nums[j])==target)
                System.out.println(i+","+j);
                
            }
        }
    }
 }