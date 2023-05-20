package com.mahesh.archit.LearnJPAHibernate.jdbc.springdatajpa;

import com.mahesh.archit.LearnJPAHibernate.jdbc.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpringDataJPARepository extends JpaRepository<Course, Long> {

    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);

}
