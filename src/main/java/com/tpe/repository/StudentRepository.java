package com.tpe.repository;

import com.tpe.domain.Student;
import java.util.List;
import java.util.Optional;

public interface StudentRepository {

    List<Student> getAll();      //Tüm ogrencılerı getıren method

    //Optinal olarak cagırıldıgında NullPoınt Ex. almayalım dıye Optıonal yaparız
    Optional<Student> findById(Long id);   // id degeri girilen student ı getır

    void save(Student student);    // verılen studentı kaydedecek

    void update(Student student);   //verilen studentı update eder

    void delete(Long id);



}
