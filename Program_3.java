package TANDEMLOOP_1;

import java.util.Scanner;

public class Program_3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int num=1;
		for(int i=1;i<=n;i++)
		{
			System.out.println(num);
			num +=2;
			if(i!=n)
			{
				System.out.println("------");
			}
		}
	}
}
