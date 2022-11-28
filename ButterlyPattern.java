public class ButterlyPattern { 
    public static void main(String args[]) 
    { 
        int n=5;
        // butterfly first half
        for (int i=1;i<=n;i++) {
           for(int j=1;j<=i;j++){
              System.out.print("*");
           }
           // space
           int space=2*(n-i);
           for(int j=1;j<=space;j++){
            System.out.print(" ");
           }
           // 2nd part
           for(int j=1;j<=i;j++){
            System.out.print("*");
         }
           System.out.println();
        }
        // butterfly last half
        for (int i=n;i>=1;i--) {
            for(int j=1;j<=i;j++){
               System.out.print("*");
            }
            // space
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
             System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
             System.out.print("*");
          }
            System.out.println();
         }
           //  Diamond Pattern
           System.out.println("Diamond Pattern");
          
        for(int i=1;i<=n; i++){
         // spaces
         for(int j=1;j<=n-i;j++){
            System.out.print(" ");
         }
         // first half
         for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
         }
         System.out.println( );
        }
        for(int i=n;i>=1; i--){
            // spaces
            for(int j=1;j<=n-i;j++){
               System.out.print(" ");
            }
            // first half
            for(int j=1;j<=2*i-1;j++){
               System.out.print("*");
            }
            System.out.println( );
           }
    }
   
}