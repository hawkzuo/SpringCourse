package edu.tamu.amos.spring.componentscan.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Amos on 2018/2/7.
 */
@Component
public class PersonDao {

    private JdbcConnection jdbcConnection;

    @Autowired
    public PersonDao(JdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    public JdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }
}
