import java.io.*;

public class WriteFile {
    public static void main(String args[]){
        try{
             FileWriter Fw=new FileWriter("C:\\Users\\ADMIN\\OneDrive\\Desktop//write.txt");
             try{
                Fw.write("My name Is Priyanshu Joshi");
             }
             finally{
                Fw.close();
             }
             System.out.println("Succesfully Writted On File");
        }
        catch(Exception e){
            System.out.println("Error");
            }
    }
    
}
