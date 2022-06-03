package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		 List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		 
		 BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		 
		 Integer total1 = nums.stream().reduce(soma).get();
		 System.out.println(total1 );
	
		 Integer total2 = nums.stream().reduce(100, soma);	//Com algum valor, não precisa do Get	
		 System.out.println(total2 );	//145
		 
		 Integer total3 = nums.parallelStream().reduce(100, soma);	//parallelStream acrescenta 100 cada vez		
		 System.out.println(total3 );	//945
	
	}
}
