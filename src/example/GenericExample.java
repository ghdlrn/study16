package example;

public class GenericExample {

	public static void main(String[] args) {
		Box<String> appleBox = new Box<>();
		appleBox.content = "apple";
		System.out.println(appleBox.content);
		
		Box<Integer> boxCount = new Box<>();
		boxCount.content = 10;
		System.out.println(boxCount.content);
	}

}
