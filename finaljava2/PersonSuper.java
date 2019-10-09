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
public class PersonSuper implements Person {
	private String name;
	private int age;
        
        public void PersonSuper(){
        
        }

	public PersonSuper(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {
		return age;
	}
        
}
