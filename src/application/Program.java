package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		/*
		 * Stream
		 */

		List<Integer> list = Arrays.asList(1,4,5,10,7) ;
		// converte para stream
		Stream<Integer> st1 = list.stream();
		//imprime uma stream
		System.out.println(Arrays.toString(st1.toArray()));

		//multiplicar por 10
		Stream<Integer> st0 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st0.toArray()));
		
		// stream.of inclui diretamente na stream
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		// funcao de interacao - usa o limit para parar, senao seria infinita
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		

	}

}
