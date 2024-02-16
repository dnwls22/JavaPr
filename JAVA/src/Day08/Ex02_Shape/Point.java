package Day08.Ex02_Shape;





public class Point {
	
// 정수형 멤버변수 선언
	int x;
	int y;
	
// 기본 생성자 정의
	public Point() {
	}
	
// 매개변수 생성자 정의
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
// toString() 메소드 정의
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	;
}
