package com.jdbcTest.jdbcTest;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import org.springframework.jdbc.core.RowMapper;  
  
public class StudentMapper implements RowMapper<Student> {  
  
    public Student mapRow(ResultSet rs, int rownum) throws SQLException {  
        Student student = new Student();  
        student.setID(rs.getString("ID"));  
        student.setname(rs.getString("name"));  
        student.setage(rs.getInt("age"));  
        student.setFM(rs.getString("FM"));  
          
        return student;       
    }  
      
}  