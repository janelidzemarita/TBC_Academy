package Rectangle;

public class Main {
	public static void main(String[] args){
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle();
		
//		rec1 = null;
//		System.out.println(rec1.getLength());
		System.out.println(rec2.getHigth());
		rec2.setHigth(12);
		rec2.setLength(18);
		System.out.println(rec2.area());
//		System.out.println(rec1.getHigth() == rec2.getHigth());
		/**
		rec1 = rec2;
		System.out.println(rec1.getHigth() == rec2.getHigth());
		
		rec1.setHigth(3);
		System.out.println(rec2.getHigth());
		 */
	
		rec1.setHigth(10);
		rec1.setLength(18);
		System.out.println(comparison(rec1, rec2));
		int x = 19;
		int y = 0;
		if(x == 0) {
			int n = 10;
			System.out.println("First time n: "+ n);
		}else {
			int j = 19;
		}
			int n = 16;
			System.out.println("First time n: "+ n);
    }
	public static int comparison (Rectangle rec1, Rectangle rec2) {
		if(rec1.area() > rec2.area()) {
			return 1;
		}else if (rec1.area() < rec2.area()) {
			return -1;
		}else
		return 0;
	}
}
