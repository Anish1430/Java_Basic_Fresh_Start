import java.io.*;

public class SeriaLizationInjava {
    public static void main(String[] args) throws Exception {

        Employee e=new Employee();
        e.setId(10);
        e.setName("Anish Kumar Sharma");

        //Serializable

        //Location Where you can Create the Serializable File

        FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\hp\\Desktop\\Java basic\\CoderFile.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(e);


        //Deserializable
    //Location Where you can Create the Serializable File
        FileInputStream fileInputStream=new FileInputStream("C:\\Users\\hp\\Desktop\\Java basic\\CoderFile.txt");
        ObjectInputStream  inputStream=new ObjectInputStream(fileInputStream);
        Employee reCreateObj= (Employee) inputStream.readObject();
        System.out.println(reCreateObj.getId());
        System.out.println(reCreateObj.getName());
    }
}
