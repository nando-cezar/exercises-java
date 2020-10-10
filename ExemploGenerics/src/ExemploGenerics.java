
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows
 */
public class ExemploGenerics {

	public static void print(List<? extends Number> list) {
            list.forEach(n -> {
                System.out.print(n + " ");
            });
		System.out.println();
	}

	public static void main(String[] args) {
            
		List<Number> li = Arrays.asList(3, 4, 6, 8, 11, 15, 28, 32);
                
		ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(3, 4, 6, 8, 10, 11, 15, 28, 32));
                
		Collection<Integer> al2 = new ArrayList<>();
                
		print(li);
		print(al1);
		// print(al2); // erro de compilação
	}

}
