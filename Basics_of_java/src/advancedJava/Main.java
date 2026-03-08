package advancedJava;

public class Main {

	public static void main(String[] args) {

		Box<String> box=new Box();
		box.set("Hello");
		
		String s= box.get();
	}
}
class Box<T>{
	T value;
	
	void set(T value) {
		this.value=value;
	}
	
	T get() {
		return value;
	}
}

//T - type, N - Number, K - Key, V - Value
// - E - Element
