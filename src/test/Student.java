package test;

public class Student {

	private String student;
	private String student_start_time;
	private String student_over_time;
	private String project;
	
	public String get_project() {
		return this.project;
	}

	public void set_project(String project) {
		this.project = project;
	}
	
	
	public String get_student() {
		return this.student;
	}

	public void set_student(String student) {
		this.student = student;
	}	

	public String get_student_st() {
		return this.student_start_time;
	}

	public void set_student_st(String student_start_time) {
		this.student_start_time = student_start_time;
	}
	
	public String get_student_ot() {
		return this.student_over_time;
	}

	public void set_student_ot(String student_over_time) {
		this.student_over_time = student_over_time;
	}
}
