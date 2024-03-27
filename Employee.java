import java.io.Serializable;

public  class Employee implements Serializable {

     private int id;


     // If you can Use transient in the code it will gives You a null value because
     // static and transient will completely ignored by JVM ........

     //1= private transient String name;

     //2=  private static String name;

     private String name;

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

}
