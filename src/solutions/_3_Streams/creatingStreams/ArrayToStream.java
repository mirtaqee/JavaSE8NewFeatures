package solutions._3_Streams.creatingStreams;

import java.util.Arrays;
import java.util.stream.Stream;

import solutions._3_Streams.creatingStreams.model.Person;


public class ArrayToStream {
	public static void main(String args[]){

		Person[] people = {
				new Person("Joe", 48), 
				new Person("Mary", 30),
				new Person("Mike", 73)};
//		for (int i = 0; i < people.length; i++) {
//			System.out.println(people[i].getInfo());
//		}

//		Stream<Person> stream = Stream.of(people);
		Stream<Person> stream = Arrays.stream(people);
		
		
		stream.forEach(p -> System.out.println(p.getInfo()));
		
	}

}