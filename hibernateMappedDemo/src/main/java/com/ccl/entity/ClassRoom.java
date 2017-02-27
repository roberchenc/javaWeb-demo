package com.ccl.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "tb_classroom")
public class ClassRoom {
	
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "classname_tbc")
	private String className;
	
	/*OneToMany指定了一对多的关系，mappedBy="room"指定了由多的那一方来维护关联关系，mappedBy指的是多的一方对1的这一方的依赖的属性，
	 * (注意：如果没有指定由谁来维护关联关系，则系统会给我们创建一张中间表)
	 * LazyCollection属性设置成EXTRA指定了当如果查询数据的个数时候，只会发出一条 count(*)的语句，提高性能
	 */
	@OneToMany(mappedBy="room")     
	@LazyCollection(LazyCollectionOption.EXTRA)
	private Set<Student> students;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public ClassRoom(int id, String className, Set<Student> students) {
		super();
		this.id = id;
		this.className = className;
		this.students = students;
	}

	public ClassRoom(String className, Set<Student> students) {
		super();
		this.className = className;
		this.students = students;
	}

	@Override
	public String toString() {
		return "ClassRoom [id=" + id + ", className=" + className + ", students=" + students + "]";
	}
	
	

}
