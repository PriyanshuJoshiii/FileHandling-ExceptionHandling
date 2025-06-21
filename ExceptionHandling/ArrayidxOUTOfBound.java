import java.util.*;
public class ArrayidxOUTOfBound {
    public static void main (String h[]){
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size=sc.nextInt();
        int arr[]= new int [size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int v;
        System.out.println("Enter the index to access the array");
        v=sc.nextInt();
        try{
            System.out.println(arr[v]);
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Executed.......");
        }
        sc.close();
    }
}
