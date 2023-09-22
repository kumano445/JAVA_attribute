package attribute;

public class DriveCar {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car c1 = new Car();
		
		c1.setNo(2525);
		
		c1.run(30);
		
		c1.display();
			System.out.println("ナンバー" + c1.no + "速度は"+ c1.speed+ "です");
		
		c1.run(0);
		
		c1.display();
			System.out.println("ナンバー" + c1.no + "速度は"+  c1.speed+ "です");
	}

}
