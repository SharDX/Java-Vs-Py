import java.util.Scanner;

public class Lockette {

	public static void main(String[] args) {
		System.out.print("Wellcome to Lockette.Java");
		System.out.print("   ,  Version 0.1");
		String DPassword = "123";
		String DUser = "User";
		Scanner User = new Scanner(System.in);
		System.out.println("Type Your UserName : ");
		String UserC = User.nextLine();
		Scanner Login = new Scanner(System.in);
		System.out.print("Type Your Password : ");
		String LoginC = Login.nextLine();
		if(DPassword.equals(LoginC) && DUser.equals(UserC)){
			System.out.println("Correct Password , Pass : " + LoginC);
			boolean Token = true;
		}else{
			System.out.println("Wrong Password");
			boolean Token = false;
		}
		
	}

}
