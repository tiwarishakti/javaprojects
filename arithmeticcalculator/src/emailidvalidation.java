import java.util.ArrayList;
import java.util.Scanner;

public class emailidvalidation {
	public static void main(String[] args) {
		ArrayList<String> emailID = new ArrayList<String>();
		emailID.add("abc@xyz.com");
		emailID.add("def@xyz.com");
		emailID.add("ghi@xyz.com");
		emailID.add("jhl@xyz.com");
		emailID.add("mno@xyz.com");
		emailID.add("pqr@xyz.com");
		emailID.add("stu@xyz.com");
		emailID.add("vwx@xyz.com");
		emailID.add("yza@xyz.com");
		emailID.add("bcd@xyz.com");
		String r = null;
		System.out.println("Enter the email to search");
		Scanner sc = new Scanner(System.in);
		r = sc.nextLine();
		if (r == null) {
			System.out.println("You haven't entered an email");
		}
		for (int i = 0; i < emailID.size(); i++) {
			if (emailID.contains(r)) {
				System.out.println("email ID " + r + " found");
				break;
			}
		}
	}
}
