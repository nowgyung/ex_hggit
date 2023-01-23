package study_230123;

class Pointt implements Cloneable{
	private int xPos;
	private int yPos;
	
	public Pointt(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public void showPosition(){
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}
	public void changePos(int x, int y) {
		xPos = x;
		yPos = y;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

class Rectangle implements Cloneable{
	private Pointt upperLeft;
	private Pointt lowerRight;
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Pointt(x1, y1);
		lowerRight = new Pointt(x2, y2);
	}
	public void changePos(int x1, int y1, int x2, int y2) {
		upperLeft.changePos(x1, y1);
		lowerRight.changePos(x2, y2);
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		Rectangle copy = (Rectangle)super.clone();
		copy.upperLeft = (Pointt)upperLeft.clone(); // 직접 호출하며 복사
		copy.lowerRight = (Pointt)lowerRight.clone();
		return copy;
	}
	public void showPosition() {
		System.out.println("좌측 상단: ");
		upperLeft.showPosition();
		
		System.out.println("우측 하단: ");
		lowerRight.showPosition();
		System.out.println();
	}
}

public class ShallowCopy {
	public static void main(String[] args) {
		Rectangle org = new Rectangle(1,1,9,9);
		Rectangle cpy;
		
		try {
			cpy = (Rectangle)org.clone();
			org.changePos(2,2, 7,7);
			org.showPosition();
			cpy.showPosition();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
