package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentsInfo {
	Scanner scan = new Scanner(System.in);
	StudentsDTO dto = new StudentsDTO();
	
	ArrayList<StudentsDTO> list = new ArrayList<>();
	
	String name, grade;
	int stuNum, kor, eng, math;
	
	public void regName() {
		System.out.println("이름 입력 : ");
		name = scan.next(); 
		dto.setName(name);
	}
	
	public void regStuNum() {
		System.out.println("학번 이름 : ");
		stuNum = scan.nextInt();
		dto.setStuNum(stuNum);
	}
	
	public void regKor() {
		System.out.println("국어 점수 입력 : ");
		kor = scan.nextInt(); 
		dto.setKor(kor);
	}
	
	public void regEng() {
		System.out.println("영어 점수 입력 : ");
		eng = scan.nextInt();
		dto.setEng(eng);
	}
	
	public void regMath() {
		System.out.println("수학 점수 입력 : ");
		math = scan.nextInt();
		dto.setMath(math);
	}
	
	public void calGrade() {
		int avg = (dto.getKor() + dto.getEng() + dto.getMath())/3;
		if(avg>=80) {
			if(avg>=90) {
				dto.setGrade("A");
				list.add(dto);
			} else {
				dto.setGrade("B");
				list.add(dto);
			}
		}else {
			dto.setGrade("C");
			list.add(dto);
		}
	}
	
	public void search() {
		System.out.println("검색할 학생의 학번을 입력하세요.");
		int inputNum = scan.nextInt();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getStuNum()==(inputNum)) {
				System.out.println("이름 : " + list.get(i).getName());
				System.out.println("학번 : " + list.get(i).getStuNum());
				System.out.println("국어 점수 : " + list.get(i).getKor());
				System.out.println("영어 점수 : " + list.get(i).getEng());
				System.out.println("수학 점수 : " + list.get(i).getMath());
				System.out.println("등급 : " + list.get(i).getGrade());
			}
		}
	}
	
	public void viewInfo() {
		for (StudentsDTO s : list) {
			System.out.println("이름 : " + s.getName());
			System.out.println("학번 : " + s.getStuNum());
			System.out.println("국어 점수 : " + s.getKor());
			System.out.println("영어 점수 : " + s.getEng());
			System.out.println("수학 점수 : " + s.getMath());
			System.out.println("등급 : " + s.getGrade());
		}
	}
}
