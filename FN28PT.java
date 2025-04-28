import java.util.*;
public class FN28PT {
    //Write a program to complete the function sum_pillar_elements() which receives a 2d array, total rows and total columns. The function should print the sum of each pillar elements in the matrix. pillar means column.

    public static void sum(int [][] arr, int R, int C) {
        for(int i=0; i<R; i++){
            int sum =0; 
            for(int j=0; j<C; j++){
                sum += arr[i][j];
            }
            System.out.print(sum + "");
        }
    }
    public static void main(String[] args) {
        Scanner sc3 = new Scanner(System.in);
        int R = sc3.nextInt();
        int C = sc3.nextInt();
        int [][] arr = new int [R][C];
        for(int i=0; i<R; i++){
            for(int j=0; j<C;j++){
                arr[i][j] = sc3.nextInt();
            }
            
           
            
        }
        
        sum(arr, R, C);

class Student{
	String studentName;
	int studentId;
	String studentCollegeName;
	String studentDepartment;
	HashMap<String, Integer> studentMarks = new HashMap<String, Integer>();

	public void studentInfo() {
		System.out.println("---------Student Details -------------");
		System.out.println("Name : "+studentName);
		System.out.println("Id : "+studentId);
		System.out.println("College Name : "+studentCollegeName);
		System.out.println("Department"+studentDepartment);
	}
	
	public void getStudentMarks() {
		System.out.println("------------- Student Marks -------------");
		System.out.println("Name : " + studentName);
		System.out.println("Subject | Marks ");
		for(Map.Entry<String, Integer> marks : studentMarks.entrySet()) {
			System.out.println(marks.getKey() +"  :  " + marks.getValue());
		}
	}
	
}

	 {
		Scanner sc = new Scanner(System.in);	
		Student s1 = new Student();
		System.out.print("Enter the Student Name : ");
		String name = sc.nextLine();
		System.out.print("Enter the Student Id : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the College Name : ");
		String clg = sc.nextLine();
		System.out.print("Enter the Department : ");
		String dpt = sc.nextLine();
		System.out.print("Enter How many Subjects you Want : ");
		int subjectCount = sc.nextInt();
		
		s1.studentName = name;
		s1.studentId = id;
		s1.studentCollegeName = clg;
		s1.studentDepartment = dpt;
		sc.nextLine();
		for(int  i=0; i<subjectCount; i++) {
			System.out.print("Enter the Subject Name : ");
			String subject = sc.nextLine();
			System.out.print("Enter the marks : ");
			int marks = sc.nextInt();
			sc.nextLine();
			s1.studentMarks.put(subject, marks);
		}
		
		s1.studentInfo();
		s1.getStudentMarks();


	}
}

    }

