import java.io.*;
public class Copy {
    public static void main(String[] args) throws IOException {
        FileInputStream r=new FileInputStream("C://Users//ADMIN//OneDrive//Desktop/write.txt");
        FileOutputStream w=new FileOutputStream("C:\\Users\\ADMIN\\OneDrive\\Desktop\\File2.txt");
        int i;
        while ((i = r.read()) != -1) {
            w.write(i);
    }
    r.close();
    w.close();
    System.out.println("File Copied SuccesFully");
}
}
