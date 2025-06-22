
import java.io.*;
public class Create_File{
    public static void main(String args[]){
        File f=new File("C:\\Users\\ADMIN\\OneDrive\\Desktop\\abc.txt");
        try{
            if(f.createNewFile()){
                System.out.println("File created");
            }
            else{
                System.out.println("File already exists");
            }
        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
}
