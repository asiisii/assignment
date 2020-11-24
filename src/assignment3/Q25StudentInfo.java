package assignment3;

import java.util.Scanner;

public class Q25StudentInfo {
	public static void main(String[] args) {
		//get number of students, their name, and score 
		//display the student info with the highest score 
		String nameStudent ="";
		String nameStudent1 ="";
		double scoreStudent =0;
		double scoreStudent1 =0;

		
		Scanner student = new Scanner(System.in);
		
		System.out.print("Enter the number of students in Java class: ");
		int numOfStudents = student.nextInt();
		student.nextLine();
		
		System.out.print("Enter the name of the student: ");
		nameStudent = student.nextLine();
		
		System.out.print("Enter the score they got: ");
		scoreStudent = student.nextDouble();
		
		
		for(int s =1; s<numOfStudents; s++) {
			student.nextLine();
			System.out.print("Enter the name of the student: ");
			nameStudent1 = student.nextLine();

			System.out.print("Enter the score they got: ");
			scoreStudent1 = student.nextDouble();
			
			
			if(scoreStudent1>scoreStudent) {
				scoreStudent = scoreStudent1;
				nameStudent = nameStudent1;
			}
		}
		
		System.out.println("Name\tHighest Score");
		System.out.println(nameStudent+"\t"+scoreStudent);
		
		
	
		student.close();
	}
}
