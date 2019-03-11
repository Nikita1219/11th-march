import java.util.HashMap;
import java.util.Map;

public class LambdaDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Map<String, String> books = new HashMap <> ();
			books.put("Let Us C", "Nikita Jayaswal");
			books.put("oops", "Neeti Malhotra");
			books.put("Java","Kanika Bhutani");
			
			books.forEach((key, value) -> System.out.println("Book Name:- "+ key +", Author:- " + value));
			
			System.out.println();
			
			books.forEach((key, value) -> {
				System.out.println("Book Name:- " + key  +", Author:- "+ value);
			});
			System.out.println();
	}

}
