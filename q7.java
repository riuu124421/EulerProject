package projecteuler;

public class q7 {
public static boolean isPrime(long n) {
	boolean ans = true;
	for(long i=21;i*i<=n;i++) {
		if(n%i==0)
			ans=false;
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
long c=0;
long ans=0;
for(long i=2; ;i++) {
	if(isPrime(i))c++;
	if(c==10001) {
		ans =i;
		break;
	}
}
System.out.println(ans);
	}

}
