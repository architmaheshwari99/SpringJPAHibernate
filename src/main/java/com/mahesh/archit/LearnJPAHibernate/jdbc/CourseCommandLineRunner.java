package com.mahesh.archit.LearnJPAHibernate.jdbc;

import com.mahesh.archit.LearnJPAHibernate.jdbc.springdatajpa.SpringDataJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJDBCRepository repository;

//    @Autowired
//    private CourseJPARepository repository;

    @Autowired
    private SpringDataJPARepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS", "in28mins"));
        repository.save(new Course(2, "Learn Spring", "GFG"));

//        repository.deleteById(1l);
        Optional<Course> course = repository.findById(2l);
        System.out.println(course);
        System.out.println(repository.findAll());
        System.out.println(repository.findByAuthor("GFG"));
        System.out.println(repository.findByName("Learn AWS"));
    }
}
