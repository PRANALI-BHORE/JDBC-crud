package StudentManager;

import java.util.Scanner;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class StartApp {
	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to Student Management App....");
		
		Scanner s=new Scanner(System.in);
		
		while(true) {
			System.out.println("Press 1 to add student details");
			System.out.println("Press 2 to delete student details");
			System.out.println("Press 3 to display student's details");
			System.out.println("Press 4 to exit ");
			int number=s.nextInt();
			
			if(number==1) {
				//add
				System.out.println("Enter student Id: ");
				int id=s.nextInt();
				System.out.println("Enter student Name: ");
				String name=s.next();
				System.out.println("Enter student City: ");
				String city=s.next();
				System.out.println("Enter student Country: ");
				String country=s.next();
				System.out.println("Enter student pincode: ");
				String pincode=s.next();
				
				Student std=new Student(id, name, city, country, pincode);
				boolean answer=StudentDao.insertStudentToDB(std);
				if(answer) {
					System.out.println("Student details added successfully!!!");
				}else {
					System.out.println("Something went wrong!!!");
					System.out.println("Try again!!");
				}
				System.out.println(std);
			}else if(number==2) {
				//delete
				System.out.println("Enter student id to delete.");
				int userId=s.nextInt();
				boolean f=StudentDao.deleteStudent(userId);
				if(f) {
					System.out.println("Deleted!!!");
					System.out.println(" ");
					
				}else {
					System.out.println("Something went wrong!!!");
				}
			}else if(number==3) {
				//display
				StudentDao.showStudentDetails();
				
			}else if(number==4) {
				//exit
				break;
			}else {
				
			}
		}
		System.out.println("Thank you for visiting our App..");
	}
}
