package ex2;
/*
 * 이 코드의 문제점
 * 1. 이 박스에는 사과, 오렌지만 담고싶은데 다른 것이 담겨도 제거 불가
 * 2. get할 때 형변환 해야한다(다운 캐스팅)
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

class Box{  //사과, 오렌지 담은 상자
	private Object obj;
	
	void setObj(Object obj) {
		this.obj = obj;
	}
	
	Object getObj() {
		return obj;
	}
}

public class FruitBoxEx2 {

	public static void main(String[] args) {
		
		Box abox = new Box();
		Box bbox = new Box();
		
		abox.setObj(new Apple());  //사과 담음
		bbox.setObj(new Orange());  //오렌지 담음
		
		Apple ap = (Apple)abox.getObj();
		Orange op = (Orange)bbox.getObj();
		
		System.out.println(ap);
		System.out.println(op);
		
		abox.setObj(10);
		abox.setObj(1.2);
		abox.setObj("String");
	}

}
