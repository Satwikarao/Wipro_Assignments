package mymainfiles;

import mydaofiles.StudentDAO;

public class StudentCRUDMain {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        dao.saveStudent("Satwik", 95); // you can change name and marks
    }
}

