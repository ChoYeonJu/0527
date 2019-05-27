package streamandparallel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntStream intStream = Arrays.stream(new int[] {5,3,2,1,4});
		intStream.sorted().forEach(n -> System.out.println(n +","));
		System.out.println();
		
		//°´Ã¼¿ä¼Ò
		
		List<Student> studentList = Arrays.asList(new Student("È«±æµ¿",42),new Student("È«±æ±æ",36),new Student("È«°¥°¥",90));
		
		studentList.stream().sorted().forEach(s -> System.out.print(s.getScore()+","));
		System.out.println();
		
		studentList.stream().sorted().forEach(s->System.out.print(s.getScore()));
	}

}
