package ex1;
/*
 * 이 코드의 문제점
 * 1. AppleBox, OrangBox 거의 비슷
 * 2. 한 박스에 사과, 오렌지를 담고 싶다.
 */
class Apple{  //사과
	public String toString() {
		return "I am an apple";
	}
}
class Orange{ //오렌지
	public String toString() {
		return "I am an Orange";
	}
}

class AppleBox{  //사과 상자
	private Apple ap;
	
	void setAp(Apple ap) {
		this.ap = ap;
	}
	
	Apple getAp() {
		return ap;
	}
}
class OrangeBox{  //오렌지 상자
	private Orange op;
	
	void setOp(Orange op) {
		this.op = op;
	}
	
	Orange getOp() {
		return op;
	}
}

public class FruitBoxEx1 {

	public static void main(String[] args) {

		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
		aBox.setAp(new Apple());
		oBox.setOp(new Orange());
		
		System.out.println(aBox.getAp());
		System.out.println(oBox.getOp());
	}

}
