package test;

import java.util.Scanner;

public class Factor {

public void show()
 {
System.out.println("Factors of: ");
Scanner sc = new Scanner(System.in);
int numFac = 0;
if(sc.hasNextInt())
{
numFac = sc.nextInt();
}

System.out.println("The Factors are:");

for(int i = 1; i <= numFac; i++)
{
if(numFac%i == 0)
{
System.out.print(i+" ");
}
}
 }

public static void main(String[] args)
{
	Factor f = new Factor();
	f.show();
}
}


