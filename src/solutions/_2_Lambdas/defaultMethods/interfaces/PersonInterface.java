package solutions._2_Lambdas.defaultMethods.interfaces;

public interface PersonInterface {
	
	String getName();
	void setName(String name);
	int getAge();
	void setAge(int age);

	default String getPersonInfo() {
		return getName() + " (" + getAge() + ")";
	}
	
}
