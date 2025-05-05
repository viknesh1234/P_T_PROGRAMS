import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Student{
	int studentId;
	String studentName;
	static String college = "Nandha";
	HashMap<String, Integer> sem = new HashMap<String, Integer>();
	public Student(int studentId, String studentName, HashMap<String, Integer> sem) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.sem = sem;
	}
	
	public void printStudentInfo() {
		System.out.println("-----------Student Info-----------");
		System.out.println("Student Id : "+ studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("College Name : " + college);
		System.out.println("Subject  |  Marks ");
		for(Map.Entry<String, Integer> sub : sem.entrySet()) {
			System.out.println( sub.getKey() +" : " + sub.getValue());
		}
	}
	public void checkStudentPassOrFail() {
		int passMark = 50;
		boolean passOrFail = true;
		for(Map.Entry<String, Integer> sub : sem.entrySet()) {
			if(sub.getValue() < passMark) {
				passOrFail = false;
			}
		}
		
		if(passOrFail) {
			System.out.println(studentName +" : Pass");
		}
		else {
			System.out.println(studentName +" : Fail");
		}
	}
	public void getPercentage() {
		float totalMarks = 0;
		for(Map.Entry<String, Integer> sub : sem.entrySet()) {
			totalMarks += sub.getValue();
		}
		float percentage = totalMarks / (sem.size() * 100) * 100;
		System.out.println( studentName+" Percentage : " +percentage);
	}
}

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		System.out.println("Enter the Id : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Name : ");
		String nextLine = sc.nextLine();
		System.out.println("Enter How Many Subjects You Want : ");
		int subCount = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<subCount; i++) {
			System.out.println("Enter the Subject : ");
			String sub = sc.nextLine();
			System.out.println("Enter the Marks : ");
			int marks = sc.nextInt();
			sc.nextLine();
			map.put(sub, marks);
		}
		
		Student student = new Student(id, nextLine, map);
		student.printStudentInfo();
		System.out.println("--------------------------");
		student.checkStudentPassOrFail();
		System.out.println("--------------------------");
		student.getPercentage();
		
		
		
	}
}