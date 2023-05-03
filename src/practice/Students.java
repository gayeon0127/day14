package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Students{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		StudentsInfo stu = new StudentsInfo();
		
		while (true) {
			System.out.println("================");
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 검색");
			System.out.println("3. 모든 학생 보기");
			System.out.println("4. 종료");
			System.out.println("================");
			num = scan.nextInt();
			
			switch(num) {
			case 1 :
				System.out.println("학생을 등록합니다.");
				stu.regName();
				stu.regStuNum();
				stu.regKor();
				stu.regMath();
				stu.regEng();
				stu.calGrade();
				System.out.println("등록되었습니다.");
				break;
			case 2 :
				System.out.println("학생을 검색합니다.");
				stu.search();
				break;
			case 3 :
				System.out.println("모든 학생을 확인합니다.");
				stu.viewInfo();
				break;
			case 4 :
				System.exit(0);
				break;
			}
			
		}
		
	}
}
