package com.mahesh.archit.LearnJPAHibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJDBCRepository repository;

    @Autowired
    private CourseJPARepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS", "in28mins"));
        repository.insert(new Course(2, "Learn Spring", "GFG"));

        repository.delete(1);
        Course course = repository.findById(2);
        System.out.println(course);
    }
}
