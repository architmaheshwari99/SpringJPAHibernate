package com.mahesh.archit.LearnJPAHibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJDBCCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJDBCRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS", "in28mins"));
        repository.insert(new Course(2, "Learn Spring", "GFG"));

        repository.delete(1);
        Course course = repository.select(2);
        System.out.println(course);
    }
}
