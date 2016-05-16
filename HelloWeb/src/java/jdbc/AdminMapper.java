/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Kevin
 */
public class AdminMapper implements RowMapper<Admin>{

    @Override
    public Admin mapRow(ResultSet rs, int i) throws SQLException {
        Admin admin = new Admin();
        admin.setAccount(rs.getString("account"));
        admin.setPassword(rs.getString("password"));
        return admin;
    }
    
}
