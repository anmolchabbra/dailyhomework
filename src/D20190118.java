import java.util.Scanner;
public class D20190118 {
    public static void main(String[] args) {
        int x,y;
        boolean print = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for variables to compare");
        x=sc.nextInt();
        y=sc.nextInt();

         if(print == true) {
             if(x>y) {
                 System.out.println("x is bigger");
             }
             else{
                 System.out.println("smaller");
                 }
             }
         }

    }

