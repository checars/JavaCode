package examnation.qihu360;

import java.util.Random;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	int range = 0;
	int A = 0;
	int B = 0;
	Random rand = new Random();
	Scanner cin = new Scanner(System.in);
	
		range = cin.nextInt();
		A = cin.nextInt();
	
	cin.close();
	
	int randNum = rand.nextInt(range) + 1;
	System.out.println("randNum "+randNum);
	int abs = Math.abs(range-A);
	if(A-randNum==0)B=randNum;
	else if(A-randNum>0 && randNum-abs>=0)B=randNum-abs+1;
	else if(A-randNum>0 && randNum-abs<=0)B=1;
	else if(A-randNum<0)B=A+1;
	System.out.println(B);
}
}
