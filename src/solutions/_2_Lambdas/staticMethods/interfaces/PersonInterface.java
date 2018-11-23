package solutions._2_Lambdas.staticMethods.interfaces;

import solutions._2_Lambdas.staticMethods.model.Person;

public interface PersonInterface {
	
	String getName();
	void setName(String name);
	int getAge();
	void setAge(int age);
	
	static String getPersonInfo(Person p) {
		return p.getName() + " (" + p.getAge() + ")";
	}
}
