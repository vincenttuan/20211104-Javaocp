package oo.extend1;

public class Student extends Person {
	
	private int grade;

	public Student() {
		
	}

	public Student(int grade) {
		this.grade = grade;
	}
	
	public Student(String name, int age, int grade) {
		setName(name);
		setAge(age);
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", name=" + getName() + ", age=" + getAge() + "]";
	}

	
	
	
}
