package com.tpe.service;

import com.tpe.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;


@Service   //@Component i içine alır - sprıngın servıce area da oldugunu bılmesı lazım
public class StudentServiceImpl implements  StudentService{


    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student findStudentById(Long id) {
        return null;
    }

    @Override
    public void saveStudent(Student student) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void deleteStudent(Long id) {

    }
}
