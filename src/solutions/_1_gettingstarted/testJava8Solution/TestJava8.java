package solutions._1_gettingstarted.testJava8Solution;

public class TestJava8 {

	public static void main(String[] args) {

		// An instance of a functional interface using a lambda expression
		TestInterface tester = () -> System.out.println("Java SE 8 is working!");
		tester.test();

	}

}
