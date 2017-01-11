import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.*;
public class Lockette {

	public static void main(String[] args) {
		Options();
		}
	static void Options() {
		System.out.println("Type 1 to Login or 2 To Register a new user");
		Scanner Choice = new Scanner(System.in);
		int ChoiceC = Choice.nextInt();
		if(ChoiceC == 1) {
			Login();
		}else{
			UserReg();
		}
	}
	static void UserReg() {
		System.out.println("Please Enter Your info And Remeber them :) ");
		Scanner RG_User = new Scanner(System.in);
		System.out.println("Enter your New Username");
		String RUser = RG_User.nextLine();
		Scanner RG_Password = new Scanner(System.in);
		System.out.println("Enter your Password");
		String RPassword = RG_Password.nextLine();
		// Gets User Inputs ~~
		String dB = "db.txt";
		try {
			FileWriter fileWriter = 
					new FileWriter(dB);
			//IDK why but people tell me To wrap the FileWriter in BufferedWiter
			BufferedWriter bufferedWriter =
					new BufferedWriter(fileWriter);
			bufferedWriter.write(RUser);
			bufferedWriter.write(RPassword);
			bufferedWriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	static void Login() {
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
			System.out.println("Wrong Password, please type it again .. restarting");
			boolean Token = false;
			Login();
		}
	}
}
