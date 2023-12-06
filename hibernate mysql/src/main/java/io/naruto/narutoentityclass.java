package io.naruto;

import javax.persistence.*;

@Entity 

public class narutoentityclass {
	
	@Id
	private String name;
	@Column
	private String teacherName;
	@Column(nullable=false)
	private String Post;
	@Column
	private String speciality;
	@Column(nullable=false)
	private int teamNo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getPost() {
		return Post;
	}
	public void setPost(String post) {
		Post = post;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	
	
	
}
