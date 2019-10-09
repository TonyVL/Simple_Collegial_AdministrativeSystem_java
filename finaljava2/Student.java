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
public class Student extends PersonSuper implements Studying {                      //Super person subclass implements Studying

	private String grade;                                                       // PRivATE grade and ID variables (not accessible)
	private String id;
        
        public void Student(){                                                          // returning nothing
        
        }

	public Student(String name, int age, String grade, String id) {                 //public method Student 
		super(name, age);
		this.grade = grade;
		this.id = id;
	}

	public String getGrade() {                                                      // Getting grade method Returning  Grade
		return grade;
	}

	public String getId() {                                                         // Getting ID method returning ID
		return id;
	}

	public void setGrade(String grade) {                                            // Setting Grade method  VOID method
		this.grade = grade;
	}

	public void setId(String id) {                                                  // Setting ID method Retuning VOID
		this.id = id;
	}

	public String studyFor() {                                                     // Returning Studying for "JAVA"
		return "JAVA";
	}
}

