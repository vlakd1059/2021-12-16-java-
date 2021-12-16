package Exam02;

public class GeonHa extends Person {
	// 추상 메소드가 있느 추살 클래스를 상속 받는다면
	// 반드시 추상 메소드를 구현 해줘야함.

	// 구현 틀 구성
	@Override
	public void breath() {
		System.out.println("숨쉬다");

	}

	@Override
	public void think() {
		System.out.println("점심을 뭐 먹을지 생각하다.");

	}

	@Override
	public void eat() {
		System.out.println("짜장면 곱빼기를 먹다");

	}

}
