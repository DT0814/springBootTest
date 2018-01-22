package com.xawl.springBootTest.respository;

import com.xawl.springBootTest.controller.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRespository extends JpaRepository<Student, String> {
    //条件查询
    public List<Student> findByAge(Integer age);
}
