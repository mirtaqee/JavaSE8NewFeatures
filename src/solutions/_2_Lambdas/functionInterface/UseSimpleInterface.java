package solutions._2_Lambdas.functionInterface;

import solutions._2_Lambdas.functionInterface.interfaces.SimpleInterface;

public class UseSimpleInterface {

	public static void main(String[] args) {

		SimpleInterface obj = () -> System.out.println("Say something");
		obj.doSomething();
		
	}

}
