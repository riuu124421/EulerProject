package projecteuler;
import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
System.out.print("Enter number:");
Scanner sc= new Scanner(System.in);
n=sc.nextInt(); 
int sume=0;
for(int i=1;i<=n;i++) {
	double a=Math.pow(i, 2);
	sume=(int) (sume+a);

}
int k = n*(n+1)/2;
double b=Math.pow(k,2);
int sumo= (int) b;
int ans=sumo-sume;

System.out.println(ans);

	}

}
