package com.javaex.ex06;

public class MyBase extends Base {

	// 메소드
	public void service(String state) {
		
		/* Base의 메소드
		if (state.equals("낮")) { 
			day();
		} else if (state.equals("밤")) {
			night();
		} 
		*/
		
		if (state.equals("오후")) {
			afternoon();
		} else {
			super.service(state);
		}
	}

	public void day() { // 오버라이딩
		System.out.println("낮에는 열심히 수업듣자");
	}

	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
	}

}
