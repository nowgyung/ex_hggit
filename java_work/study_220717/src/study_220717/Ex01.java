package study_220717;
/*
 * 176p
 * 7-1
 */
class Triangle{
	double base;
	double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	public void setBase(double b) {
		base = b;
	}
	public void setHeight(double h) {
		height = h;
	}
	public double Mul() {
		return base * height / 2;
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Triangle tri = new Triangle(5 , 6);
		System.out.println("삼각형의 넓이: "+ tri.Mul());
	}
}
