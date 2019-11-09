package collectios;

public class AmbiguousMethod {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.display(new Integer(4));
		System.out.println(d);
	}

}

class Demo {
	void display(String var) {
		System.out.println("String : "+ var);
	}
	void display(Object var) {
		System.out.println("Object : "+ var);
	}
	void display(int var) {
		System.out.println("int : "+ var);
	}
}

