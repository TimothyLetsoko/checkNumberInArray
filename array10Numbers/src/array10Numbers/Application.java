package array10Numbers;
import java.util.Scanner;

public class Application {
	
	public static boolean checker(int[] x, int y) {
		boolean chekc=false;
		for(int i=0;i<x.length;i++) {
			if(y==x[i])
				chekc=true;
		}
		return chekc;
	}

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		int[] arr=new int[10];
		
		System.out.println("Enter Numbers to save in an array.");
		for(int i=0;i<arr.length;i++) {
			try {
				System.out.print("Enter number "+(i+1)+":");
				arr[i]=input.nextInt();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		//user enters another number to check in the array
		System.out.print("Enter another number to use as test:");
		int test=input.nextInt();
		
		input.close();
		
		//use method to check
		if(checker(arr,test)) {
			System.out.println("Number exists!");
		}else {
			System.out.println("It does not exist.");
		}
	}

}
