package example_2;

@FunctionalInterface
interface MyFunctionalInterface {
	
	//A method with single parameter
	public int incrementByFive (int a);
}

public class Java_Lambda_Expression_with_single_parameter {

	public static void main(String[] args) {
		// Lambda expression with single parameter num
		// Will increase the input number by 5
		MyFunctionalInterface f = (num) -> num+5;
		System.out.println(f.incrementByFive(22));
	}

}
