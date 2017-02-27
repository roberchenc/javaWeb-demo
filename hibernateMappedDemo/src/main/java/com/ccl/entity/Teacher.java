package com.ccl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "tb_teacher")
public class Teacher {

	@Id
	@GeneratedValue(generator = "tid")
	@GenericGenerator(name = "tid", strategy = "assigned")
	@Column(length = 4)
	String tid;

	@Column(name = "name_tt")
	String tname;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + "]";
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

}
