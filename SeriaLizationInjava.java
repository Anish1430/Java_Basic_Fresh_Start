import java.io.*;

public class SeriaLizationInjava {
    public static void main(String[] args) throws IOException {

        Employee e=new Employee();
        e.setId(10);
        e.setName("Anish Kumar Sharma");
        //Location Where you can Create the Serializable File
        FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\hp\\Desktop\\Java basic\\CoderFile.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(e);

    }
}
