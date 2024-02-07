package ex3;
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
class Box<T>{  //사과, 오렌지 담은 상자
	private T obj;
	void setObj(T obj) {
		this.obj = obj;
	}
	T getObj() {
		return obj;
	}
}

public class Exam1 {

	public static void main(String[] args) {
		
		Box<Apple> abox = new Box<Apple>();
		Box<Orange> bbox = new Box<Orange>();
		
		abox.setObj(new Apple());  //사과 담음
		bbox.setObj(new Orange());  //오렌지 담음
		
		Apple ap = abox.getObj();
		Orange op = bbox.getObj();
		
		System.out.println(ap);
		System.out.println(op);
		
		Box<Integer> cbox = new Box();
		cbox.setObj(100);
		
	}

}
