package solutions._6_Miscellaneous.joiningStrings;

public class JoinerMethod {

	public static void main(String[] args) {

		String stooges = String.join(" and ", "Larry", "Curly", "Moe");
		System.out.println(stooges);
		
		String[] states = {"California", "Oregon", "Washington"};
		String statesList = String.join(",", states);
		System.out.println(statesList);
		
	}		
}
