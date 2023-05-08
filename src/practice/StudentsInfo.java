package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentsInfo {
	Scanner scan = new Scanner(System.in);
	StudentsDTO dto = null;
	
	ArrayList<StudentsDTO> list = new ArrayList<>();
	
	String name, grade;
	int stuNum, kor, eng, math;
	
	public void reg() {
		StudentsDTO dto = new StudentsDTO();
		
		System.out.println("이름 입력 : ");
		name = scan.next(); 
		dto.setName(name);

		System.out.println("학번 이름 : ");
		stuNum = scan.nextInt();
		dto.setStuNum(stuNum);
	
		System.out.println("국어 점수 입력 : ");
		kor = scan.nextInt(); 
		dto.setKor(kor);

		System.out.println("영어 점수 입력 : ");
		eng = scan.nextInt();
		dto.setEng(eng);
		
		System.out.println("수학 점수 입력 : ");
		math = scan.nextInt();
		dto.setMath(math);
		
		int avg = (dto.getKor() + dto.getEng() + dto.getMath())/3;
		if(avg>=80) {
			if(avg>=90) {
				dto.setGrade("A");
			} else {
				dto.setGrade("B");
			}
		}else {
			dto.setGrade("C");
		}
		list.add(dto);
	}	
	
	public int search() {
		System.out.println("검색할 학생의 학번을 입력하세요.");
		int inputNum = scan.nextInt();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getStuNum()==(inputNum)) {
				return i;
			}
		}
		return -1;
	}
	
	public void searchPrint(int result) {
		if (result == -1) {
			System.out.println("찾는 학번이 존재하지 않습니다.");
		}else {
			System.out.println("이름 : " + list.get(result).getName());
			System.out.println("학번 : " + list.get(result).getStuNum());
			System.out.println("국어 점수 : " + list.get(result).getKor());
			System.out.println("영어 점수 : " + list.get(result).getEng());
			System.out.println("수학 점수 : " + list.get(result).getMath());
			System.out.println("등급 : " + list.get(result).getGrade());
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
			System.out.println();
		}
	}
}
