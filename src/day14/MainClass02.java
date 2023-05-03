package day14;

import java.util.ArrayList;

class Member{
	private String name, addr;

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public String getAddr() {return addr;}
	public void setAddr(String addr) {this.addr = addr;}
}

public class MainClass02 {
	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<>();
		// Member라는 타입만 list에 저장
		
		Member m1 = new Member();
		// 새로운 객체를 형성하여 원하는 값을 저장
		m1.setAddr("산속"); m1.setName("홍길동");
		list.add(m1);
		Member m01 = list.get(0);
		System.out.println(m01.getName());
		System.out.println(m01.getAddr());
		
		Member m2 = new Member();
		m2.setAddr("산속2"); m2.setName("홍길동2");
		list.add(m2);
		System.out.println();
		
		for(int i=0;i<list.size();i++) {
			Member m = list.get(i);
			System.out.println(m.getName());
			System.out.println(m.getAddr());
			System.out.println();
			/*
			 * 한줄로 쓰기 
			 * System.out.println(list.get(i).getName());
			 * System.out.println(list.get(i).getAddr());
			 */
		}
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aa"); arr.add("bb");
		for(String s : arr) {
			System.out.println(s);
		}
		System.out.println();
		
		for (Member mm : list) {
			// list의 자료형이 Member이기 때문에 member로 받음
			System.out.println(mm.getName());
			System.out.println(mm.getAddr());
			
		}
	}
}
