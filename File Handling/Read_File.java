import java.io.*;

public class Read_File {
    public static void main(String args[]){
        try{
            FileReader F= new FileReader("C:\\Users\\ADMIN\\OneDrive\\Desktop\\File1.txt.txt");
            try{
                int i;
                while((i=F.read())!=-1){
                    System.out.print((char)i);
            }
        }
            finally{
            F.close();
            }
        }
        catch(IOException e){
                System.out.println(e.getMessage());
            }
    }
}