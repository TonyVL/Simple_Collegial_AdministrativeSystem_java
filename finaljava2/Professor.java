/*
 *
 * 
 * 
 */
package collegialadminsystemdemo;

/**
 *
 * @author tony
 */
public class Professor extends PersonSuper implements Teaching {                        
	private String courseTitle;
	private String status;
        
       
	public Professor(String name, int age, String courseTitle, String status) {
		super(name, age);
		this.courseTitle = courseTitle;
		this.status = status;
	}

	@Override
	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}

