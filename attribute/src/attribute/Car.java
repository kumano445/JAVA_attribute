package attribute;

public class Car {
	String name;
	int no;
	int speed;
	
	void setNo(int n){
		no = n ;
	}
	void run(int s) {
		speed = s;
	}
	void stop(){
		speed = 0 ;
	}
	void display(){
		System.out.println("自動車のナンバー："+ no);
		System.out.println("自動車の速度："+ speed);
	}
}
