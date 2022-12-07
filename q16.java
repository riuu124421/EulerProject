package projecteuler;
import java.math.BigInteger;
public class q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(new q16().run());
	}

	private String run() {
		// TODO Auto-generated method stub
		String temp = BigInteger.ONE.shiftLeft(1000).toString();
		int sum=0;
		for(int i=0;i<temp.length();i++)
			sum+=temp.charAt(i) -'0';
		return Integer.toString(sum);
	}
	

}
