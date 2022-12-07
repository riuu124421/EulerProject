package projecteuler;
 
public class q3 {
	public static boolean isPrime(long n) {
		boolean ans = true;
		for(long i=21;i*i<n;i++) {
			if (n%i==0)
				ans=false;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
long n = 600851475143;
long ans =01;
for(long i =(long)Math.sqrt(n);i>=0;i--) {
	if(isPrime(i)&& n%i==0) {
		ans =i;
		break;
	}
}
System.out.println(ans);
	}
 
}
