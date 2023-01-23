package study_230123;

class Point implements Cloneable{ // clone메소드의 호출 허용
	private int xPos;
	private int yPos;
	
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}
	@Override
	public Object clone() throws CloneNotSupportedException{//접근범위 확장
		return super.clone();
	}
}

public class InstanceCloning {
	public static void main(String[] args) {
		Point org = new Point(3,5);
		Point cpy;
		
		try {
			cpy = (Point)org.clone();
			org.showPosition();
			cpy.showPosition();
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	}
}
 