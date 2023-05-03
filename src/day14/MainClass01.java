package day14;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * wrapper class
 *  ; 일반 8대 기본 자료형을 클래스 타입으로 변경한 것
 *  ; int, char, double ...
 *   => Integer, Character, Double ...
 */

class A01<T>{
		// => 객체 생성 시 자료형을 부여하겠다 
	public void sumFunc(T n1, T n2) {
		System.out.println(n1+","+n2);
	}
	/*
	public void sumFunc(String n1, String n2) {
		System.out.println(n1+","+n2);
	} 
	오버라이딩 ; 매개변수가 다르기 때문에 다른 메소드로 인식
	*/
	public void test(int k, String b) {}	
}


public class MainClass01 {
	public static void main(String[] args) {
		A01<Integer> a = new A01();
		// t에 들어가는 값이 int이다.
		a.sumFunc(10, 20);
		
		A01<String> a1 = new A01();
		a1.sumFunc("aa", "bb");
	}
}
