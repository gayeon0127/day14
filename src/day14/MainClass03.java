package day14;

import java.util.ArrayList;
import java.util.Scanner;

class Member03{
	private String name;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
}

public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Member03> list = new ArrayList<>();
		String name;
		int num;
		
		while (true) {
			System.out.println("1. 등록");
			System.out.println("2. 모든 내용 출력");
			num = scan.nextInt();
			
			switch(num) {
			case 1 :
				System.out.println("이름 입력 : ");
				name = scan.next();
				Member03 n = new Member03();
				n.setName(name);
				list.add(n);
				break;
			case 2 :
				for(Member03 m : list) {
					System.out.println(m.getName());
				}
				break;
				default :
					System.out.println("종료합니다.");
					System.exit(0);
			}
		}
	}
}
