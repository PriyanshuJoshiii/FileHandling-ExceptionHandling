import java.io.*;
public class FunctionsInFile{
    public static void main(String []  args){
            File f=new File("C:\\Users\\ADMIN\\OneDrive\\Desktop\\abc.txt");
            if(f.exists()){
                System.out.println("File exists");
                System.out.println("Can Write "+f.canWrite());
                System.out.println("Can Read "+f.canRead());
                System.out.println("Can Execute "+f.canExecute());
                System.out.println("Size:"+f.length());
                System.out.println("File PAth"+f.getAbsolutePath());
                f.delete();
            }
            else{
                System.out.println("File does not exist");
            }
    }
}
