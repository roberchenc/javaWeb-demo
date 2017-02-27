package com.jdbcTest.jdbcTest;
import java.util.List;  
import javax.sql.DataSource;  
  
  
public interface StudentDao{  
  
    /**  
     * This is the method to be used to initialize 
     * database resources ie. connection. 
     */   
    public void setdatasource(DataSource ds);     
      
    public void addstudent(Student student);  
      
    public void delstudentbyID(String ID);  
      
    public void delstudentbyname(String name);  
      
    public void delallstudent();  
      
    public void updstudent(Student student);  
      
    public List<Student> allstudent();  
      
    public List<Student> querystudentbyID(String ID);  
      
    public List<Student> querystudentbyname(String name);  
      
    public List<Student> querystudentbyage(int age);  
      
      
}  