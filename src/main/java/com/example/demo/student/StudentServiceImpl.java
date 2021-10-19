package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends GenericServiceImpl<Student, Long> implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public CrudRepository<Student, Long> getDao() {
        return studentRepository;
    }
}
