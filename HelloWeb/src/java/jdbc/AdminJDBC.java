/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import javax.sql.DataSource;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Kevin
 */
public class AdminJDBC implements AdminDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        this.jdbcTemplateObject = new JdbcTemplate(ds);
    }

    @Override
    public Admin getAdmin(String ac) {
        String SQL = "select * from admin where account = ?";
        try {
            Admin admin = jdbcTemplateObject.queryForObject(SQL,
                    new Object[]{ac}, new AdminMapper());
            return admin;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

}
