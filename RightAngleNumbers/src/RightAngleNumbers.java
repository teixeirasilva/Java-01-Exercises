// A pattern like right angle triangle with number increased by 1

import java.util.Scanner;
public class RightAngleNumbers {

	public static void main(String args[]){
		int b=1;
		
		System.out.print("Enter The Row of Numbers: ");
		Scanner in=new Scanner(System.in);
		
		int a=in.nextInt();

		for(int x=1;x<=a;x++){
			for(int y=1;y<=x;y++)
			
			System.out.print(b++);
			System.out.println("");
			}
	}
}