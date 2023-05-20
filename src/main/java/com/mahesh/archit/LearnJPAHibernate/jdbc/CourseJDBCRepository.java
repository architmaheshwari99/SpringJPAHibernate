package com.mahesh.archit.LearnJPAHibernate.jdbc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY=
            """
              insert into course (id, name, author) values (1, 'aa', 'aa' );
            """;

    public void insert(){
        springJdbcTemplate.update(INSERT_QUERY);
    }

}
