package chap02;

public class Greeter {
	
	private String format;

	public String greet(String guest) {
		return String.format(format, guest); //String�� ���ڿ� ������ �̿��� ���ο� ���ڿ� ����
	}
	public void setFormat(String format) {
		this.format = format; // greet() �޼��忡�� ����� ���ڿ� ������ ���� ������
	}
	
}
