package attribute;

public class StuSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Student stul = new Student();
	        
	        stul.name = "菅原";
	        stul.setScore(90, 80);
	        
	        stul.display();
	        System.out.println("平均" + stul.getAvg() + "点"); 
	    }
	}