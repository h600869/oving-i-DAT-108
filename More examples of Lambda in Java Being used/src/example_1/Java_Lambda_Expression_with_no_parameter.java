package example_1;

@FunctionalInterface
interface MyFunctionalInterface {
	
	//A method with no parameter
	public String sayHello();
}

public class Java_Lambda_Expression_with_no_parameter {

	public static void main(String[] args) {
		// lambda expression
		MyFunctionalInterface msg = () -> {
			return "Hello";
		};
		System.out.println(msg.sayHello());
	}

}
