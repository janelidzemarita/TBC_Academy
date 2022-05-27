package Rectangle;

public class Rectangle {
	private int length;
	private int hight;
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getHigth() {
		return hight;
	}
	
	public void setHigth(int higth) {
		this.hight = higth;
	}
	
	public int perimeter () {
		return  this.length *2 + this.hight * 2;
	}
	
	public int area() {
		return this.length * this.hight;
	}
}
