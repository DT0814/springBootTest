package com.xawl.springBootTest.controller;

import com.xawl.springBootTest.respository.StudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRespository respository;

    @GetMapping("/findAll")
    public List<Student> findAll() {
        return respository.findAll();
    }

    @GetMapping("/findById")
    public Student findById(@RequestParam(value = "sno", defaultValue = "0") String sno) {
        return respository.findOne(sno);
    }

    @PostMapping("/add")
    public Student add(@RequestParam(value = "sno", defaultValue = "0") String sno,
                       @RequestParam(value = "name", defaultValue = "0") String name,
                       @RequestParam(value = "age", defaultValue = "0") Integer age) {
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        student.setSno(sno);
        return respository.save(student);
    }

    @PutMapping("/update")
    public Student update(@RequestParam(value = "sno", defaultValue = "0") String sno,
                          @RequestParam(value = "name", defaultValue = "0") String name,
                          @RequestParam(value = "age", defaultValue = "0") Integer age) {
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        student.setSno(sno);
        return respository.save(student);
    }

    @DeleteMapping("/delete/{sno}")
    public void delete(@PathVariable("sno") String sno) {
        System.out.println(sno);
        respository.delete(sno);
    }

    @GetMapping("/findByAge/{age}")
    public List<Student> findByAge(@PathVariable("age") Integer age) {
        return respository.findByAge(age);
    }
}
