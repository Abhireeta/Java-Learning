import java.util.Scanner;

// A Java program to print "Hello World" 
public class FirstProgram { 
    public static void main(String args[]) 
    { 
        // print 2 ka table
        for(int i=1;i<11;i++){
            int a=2;
            int mul=2*i;
            System.out.println(a+"*"+i+"="+mul); 
        }
        System.out.println( "please enter a number");
        Scanner sC=new Scanner(System.in);
        int a=sC.nextInt();
        System.out.println( "number enter by user:"+a);
        int sum=0;
         // print * pattern
         for(int i=1;i<=a;i++){
          sum=sum+i;
        }
        System.out.println("Sum of numbers:"+sum); 
    } 
}