import java.util.*;
public class TRY {
    public static void main(String Args[]){
        int n=10;
        int b;
        Scanner sc=new Scanner(System.in);
        int x;
            x=sc.nextInt();
        try{
            b=n/x;
            System.out.println("n/x="+b);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Executed Sucessfully......");
        }
        sc.close();
    }
}
