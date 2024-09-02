package com.springOrm.springOrm.dao;

import com.springOrm.springOrm.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class StudentDao {
    private HibernateTemplate hibernateTemplate;
    @Transactional
    public int insert(Student student){
        Integer a=(Integer) this.hibernateTemplate.save(student);
        return a;
    }

    //get Student
    public Student getStudent(int studentId){
        Student student=this.hibernateTemplate.get(Student.class,studentId);
        return student;
    }

    //get All Student
    public List<Student> getAllStudents(){
        List<Student> students=this.hibernateTemplate.loadAll(Student.class);
        return students;
    }


    //Delete
    @Transactional
    public void deleteStudent(int studentId){
        Student student=this.hibernateTemplate.get(Student.class,studentId);
        this.hibernateTemplate.delete(student);
    }

    //Update
    @Transactional
    public void updateStudent(Student student){
        this.hibernateTemplate.update(student);
    }

    public StudentDao() {
        super();
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
