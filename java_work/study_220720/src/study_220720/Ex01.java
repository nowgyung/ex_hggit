package study_220720;

class Point { 
    int xPos, yPos;

    public Point(int x, int y) {
        xPos = x;
        xPos = y;
    }

    public void showPointInfo() { 
        System.out.println("[" + xPos + ", " + yPos + "]"); 
    }
}

class Circle{
	int rad;
	Point xy;
	
	public Circle(int x, int y, int r) {
		xy = new Point(x,y);
		rad = r;
	}
	public void showCircleInfo() {
		System.out.println("rad: "+ rad);
		xy.showPointInfo();
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		Circle c = new Circle(2, 2, 4);
		c.showCircleInfo();
	}

}
