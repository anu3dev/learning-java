package com.sb.dataJDBCH2.jdbc;

public class CourseModel {
	private Integer id;
	private String name;
	
	public CourseModel() {
		super();
	}
	public CourseModel(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "CourseModel [id=" + id + ", name=" + name + "]";
	}
}
