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
public class CollegialAdminSystemDemo {

	public static void main(String args[]) {
		System.out.println("BEGIN");                                        //Begin message

		Student s1 = new Student("Tony", 25, "University", "1234");         //Student 1 constructor with set values Name,Age, Schoolname, ID#
		System.out.println("s1 name: " + s1.getName()+"   Age: " +s1.getAge());                     //getting name (from person Super) and displaying
                System.out.println("=============================================");
                
                Student s2 = new Student("Niko", 15, "Highschool", "2569");         //Student 1 constructor with set values Name,Age, Schoolname, ID#
		System.out.println("s2 name: " + s2.getName()+"   Age: " +s2.getAge());                     //getting name (from person Super) and displaying
                System.out.println("=============================================");
                
                Person personS = new Student("Kyle", 23, "college", "4321");                    //Student 2 Name,Age, Schoolname, ID#
		System.out.println("personS name: " + personS.getName()+ "   Age: "+personS.getAge() );                       //Print Student 2 Name,Age, Schoolname, ID#
                System.out.println("=============================================");

		Professor p1 = new Professor("Nancy", 101, "Java Programming", "FullProf"); //Professor 1 constructor with set values
		System.out.println("p1 name: " + p1.getName());                             //getting name (from person Super) and displaying
		System.out.println("p1 courseTitle: " + p1.getCourseTitle());               //printing courseName from class Professor extends PersonSuper implements Teaching
                System.out.println("=============================================");

		Professor p2 = new Professor("John", 256, "Mental Health", "FullProf"); //Professor 1 constructor with set values
		System.out.println("p2 name: " + p2.getName());                             //getting name (from person Super) and displaying
		System.out.println("p2 courseTitle: " + p2.getCourseTitle());               //printing courseName from class Professor extends PersonSuper implements Teaching
                System.out.println("=============================================");
                
                
                
                
                
                
                Person personP1 = p1;                                                       //p1 becomes personP1
		System.out.println("personP1 name: " + personP1.getName());                 //print personP1
                

		Teaching teachingP1 = p1;                                                       // p1 becomes teachingP1
		System.out.println("teachingP1 courseTitle: " + teachingP1.getCourseTitle());      // print course taught
                System.out.println("=============================================");
		Person personS1 = s1;
		System.out.println("personS1 name: " + personS1.getName());                     //s1 becomes PersonS1 (student 1) +print name

		Studying studyingS1 = s1;                                                       //s1 becomes StudyingS1 + print course studied
		System.out.println("studyingS1 studyFor: " + studyingS1.studyFor());
                System.out.println("=============================================");
                
              
		
		
	}
     
        
}      


