package chapter05;

public class SmartCarMain {
	public static void main(String[] args) {
		
		SmartCar car = new SmartCar();
		//은닉하고 싶은 변수에 private를 선언하여
		//외부에서 다이렉트로 접근이 불가능하게 막음!
		//car.speed = 300;
		
		//개발을 위해서는 정상적인방법으로는
		//은닉한 변수에 접근이 가능하게 만들어야 함
		//= Getter() & Setter()
		//setter()을 통해값을 초기화
		car.setSpeed(60);
		//getter()을 통해값을출력
		System.out.println(car.getSpeed());
		//car.drive();
		
		
	}//main
}//class
