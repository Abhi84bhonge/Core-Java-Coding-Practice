package com.StudentService;

import java.util.List;

import com.Dao.StudentDao;
import com.Entity.Student;

public class StudentService {

    private final StudentDao sdao = new StudentDao();  // Create once

    public String doRegisterStudent(Student stud) {

        if (sdao.doRegister(stud)) {
            return "Inserted successfully";
        } else {
            return "Not inserted";
        }
    }

    public List<Student> fetchdata() {
        return sdao.fetchdata();
    }

}
