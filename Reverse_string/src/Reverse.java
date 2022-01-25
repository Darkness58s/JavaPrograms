import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		System.out.println("Write the string that you want to reverse");
		String input;
		Scanner scan=new Scanner(System.in);
		input=scan.next();
		GetString myStringObject=new GetString(input);//constructor
		System.out.println("Reverse of" + input + "is" + myStringObject.ReverseIt());
				

			

		}

}
	


