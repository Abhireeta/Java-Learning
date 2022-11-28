import java.util.Scanner;

public class PatternJavaProgram{
    public static void main(String args[])  {
        System.out.println("Enter a number of rows");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        System.out.println("Enter a number of columns");
       int column=sc.nextInt();
    System.out.println("rectangle Pattern"); 
       // rectangle pattern
        for(int i=0;i<rows;i++){ 
            for(int j=1;j<=column;j++){
                System.out.print("*");
                }
                System.out.println();
        }
    // hallow pattern
    System.out.println("hollow Pattern"); 
        for(int i=1;i<=rows;i++){ //rows outerloop
            for(int j=1;j<=rows;j++){
            if(i==1 || i==rows||j==1||j==rows)
                   System.out.print("*");// column inser loop
            else
                 System.out.print(" ");
                }
            System.out.println(" ");
        }
    // half pyramide pattern
    System.out.println("half pyramide  Pattern"); 
        for(int i=0;i<=rows;i++){ //rows outerloop
            for(int j=0;j<=i;j++){
                System.out.print("*");// column inser loop
                }
            System.out.println();
        }
        // half pyramide pattern (ulta)
    System.out.println("inverted half pyramide  Pattern"); 
        for(int i=rows;i>=0;i--){ //rows outerloop
            for(int j=0;j<=i;j++){
                System.out.print("*");// column inner loop
                }
            System.out.println(); 
        }
    System.out.println("Right-side- half pyramide  Pattern"); 
        for(int i=1;i<=rows;i++){ //rows outerloop
                    for(int j=1;j<=rows-i;j++){
                        System.out.print(" ");// column inser loop
                    }
                    for(int j=1;j<=i;j++){
                     System.out.print("*");// column inser loop
                }
            System.out.println();
        }
        // half pyramid a using numbers
        System.out.println("Rhalf pyramid a using numbers Pattern");
        for(int i=1;i<=rows;i++){ //rows outerloop
            for(int j=1;j<=i;j++){
                System.out.print(j);// column inser loop
                }
            System.out.println();
        } 
       
    }
 }       