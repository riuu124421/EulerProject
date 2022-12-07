package projecteuler;
import java.util.Scanner;
public class q10 {
public static  boolean isPrime(long i2) {
	 long MOD=1000000007;
	 long cnt=0;
	for(long i=2;i<=i2;i++) {
		if((i2%i)%MOD==0) {
			cnt++;
		}
	}
	if(cnt<=1) {
		return true;
	}
	else {
		return false;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 long MOD=1000000007;
long n;
System.out.print("Enter number:");
Scanner sc= new Scanner(System.in);
n=sc.nextInt(); 
 long sum =0;
for(long i=2;i<=n;i++) {
	boolean ans=isPrime(i);
	if(ans) {
		sum=sum+i;
	}
}
System.out.println(sum%MOD);

	}

}
