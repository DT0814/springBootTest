package com.xawl.springBootTest.service;

import com.xawl.springBootTest.controller.Student;
import com.xawl.springBootTest.respository.StudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
    @Autowired
    private StudentRespository respository;

    @Transactional
    public void adds() {
        Student s1 = new Student();
        s1.setSno("2511150101");
        s1.setName("sg");
        s1.setAge(15);
        respository.save(s1);

        Student s2 = new Student();
        s2.setSno("2511150102");
        s2.setName("hd");
        s2.setAge(16);
        respository.save(s2);
    }
}
