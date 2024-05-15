package Assignments;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class StreamAssignment {

	
	//print unique number for this array
	//sort the array   123579
	//After sorting give me the third index
	
	@Test
	public void StreamAssign() {
		
		List<Integer>values=Arrays.asList(3,2,2,7,5,1,9,7);
//		values.stream().distinct().forEach(s->System.out.println(s));
//		values.stream().sorted().forEach(s->System.out.println(s));
		List<Integer>set=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(set.get(3));

	}
}
