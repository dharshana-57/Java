package miraculousgod;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


/*
 * Scanner
 * BufferedReader
 * System.in.read()
 * */

public class UserInput {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		int input = System.in.read();          //   takes ascii value of entered int
		System.out.println((char)input);
		
		System.out.println("Enter :");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(n);
		br.close();
		
		String str;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  string & int:" );
		str = sc.nextLine();
		i = sc.nextInt();
		System.out.println("string is " + str );
		System.out.println("Integer is " + i);
		sc.close();
	}

}
