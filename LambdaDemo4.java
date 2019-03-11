import java.util.Arrays;
import java.util.List;

public class LambdaDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			public void run() {
				System.out.println("Before Java8 , too much code for too little to do");
			}
		}).start();
		
		//Java 8 way:
		new Thread( () -> System.out.println("In java 8, Lambda expression rocks !!")).start();
		System.out.println("------------*************************-------------------------");
		
		//Iterating over list using Lamda expressions
		
		List features = Arrays.asList("Lambdas", "Default", "Stream API", "Date and Time API");
		features.forEach(n-> System.out.println(n));
		System.out.println("--------------************************-------------------------");
		
		//Even better use Method Refrence Feature oj java 8
		//Method reference is denoted by :: (double colon) operator
		//Looks similar to scope resolution operator of C++
		
	//	features.forEach(System.out::println);
	}

}
