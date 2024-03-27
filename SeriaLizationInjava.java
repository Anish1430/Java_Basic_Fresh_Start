import java.io.*;

public class SeriaLizationInjava {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Externalization e=new Externalization();
        e.setId(10);
        e.setName("Anish Kumar Sharma");

        //Serializable

        //Location Where you can Create the Serializable File

        FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\hp\\Desktop\\Java basic\\CoderFile.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(e);


          //Deserializable
        //Location Where you can Create the  Deserializable File
        FileInputStream fileInputStream=new FileInputStream("C:\\Users\\hp\\Desktop\\Java basic\\CoderFile.txt");
        ObjectInputStream  inputStream=new ObjectInputStream(fileInputStream);
        Externalization reCreateObj= (Externalization) inputStream.readObject();
        System.out.println(reCreateObj.getId());
        System.out.println(reCreateObj.getName());
    }
}
