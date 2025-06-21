
import java.util.*;
public class UserDefinedException {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Hey ,This Is The Window To Apply For Driving License :-) ");
        String name;
        System.out.println("Enter Your Name-> ");
        name=sc.nextLine();
        int age;
        System.out.println("Enter Your Age->");
        try{
            age=sc.nextInt();
            if(age<18){
                throw new Exception("Sorry " + name +" ,You Are Not Eligible For Driving License As You Are Below 18 Years");
            }
            else{
                System.out.println("Hey " + name + " ,Your Driving License Is Approved");
            }
        }catch(Exception e){
            System.out.println("Unfortunately :-( "+e.getMessage());
        }
        finally{
            System.out.println("Thank You For Coming To RTO "+name);
            sc.close();
        }
    }  
}
