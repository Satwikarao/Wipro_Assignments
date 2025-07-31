package assignment;

import java.io.*;

// ✅ Simple class for Student
class StudentData implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    int rollNo;

    public StudentData(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}
 
public class Q39 {
    public static void main(String[] args) {
        String filename = "studentdata.ser";

        // Object to serialize
        StudentData s1 = new StudentData("Bhavana", 101);

        // ✅ Serialize the object
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            fos.close();
            System.out.println("Student object has been serialized.");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        // ✅ Deserialize the object
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            StudentData s2 = (StudentData) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("\nDeserialized Student Object:");
            System.out.println("Name: " + s2.name);
            System.out.println("Roll No: " + s2.rollNo);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}
