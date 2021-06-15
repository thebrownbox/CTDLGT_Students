package binaryFunction;
import java.util.function.BiFunction;
import java.util.function.Function;
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer,Character,String> bi = (x,z)->{
			if(Character.isUpperCase(z))
				return (x%2)==0?"EVEN":"ODD";
			return (x%2)==0?"even":"odd";
		};
		System.out.println(bi.apply(4, 'u'));
		
		Function<String,Double> bi2 = x->x.equalsIgnoreCase("even")?3.0:4.0;
		Double d = bi.andThen(bi2).apply(4, 'U');
		System.out.println(d);
		
	}

}
