import java.io.*;

public class SeriaLizationInjava {
    public static void main(String[] args) throws IOException {

        Employee e=new Employee();
        e.setId(10);
        e.setName("Anish Kumar Sharma");
        FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\hp\\Desktop\\Java basic\\CodeDecodeFile.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(e);
        objectOutputStream.close();
        fileOutputStream.close();

    }
}
