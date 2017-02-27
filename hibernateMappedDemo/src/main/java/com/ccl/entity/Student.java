package com.ccl.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_student")
public class Student {
	@Id
	@GeneratedValue
	private int sid;
	
	@Column(name = "name_stu")
	private String name;
	
	@Column(name = "age_stu")
	private int age;
	
	@ManyToMany
	@JoinTable(
			name = "teachers_students",
			joinColumns = {@JoinColumn(name = "sid")},
			inverseJoinColumns = {@JoinColumn(name = "tid")}
			
	)
	private Set<Teacher> teachers;
	
	
	@ManyToOne
	@JoinColumn(name = "id_room")
	private ClassRoom room;
	

	public String getName() {
		return name;
	}
	
	

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age + ", teachers=" + teachers + ", room=" + room
				+ "]";
	}



	public Student(int sid, String name, int age, Set<Teacher> teachers, ClassRoom room) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.teachers = teachers;
		this.room = room;
	}



	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}



	public ClassRoom getRoom() {
		return room;
	}



	public void setRoom(ClassRoom room) {
		this.room = room;
	}
	
	
	
	
	

}
