
public class Question_6 {

	public static void main(String[] args) {
	System.out.println(gcd(9,564));
	System.out.println(gcd(10,2));
	System.out.println(gcd(37947031,23083462));
	}
	public static int gcd(int m, int n){
		if (m == n ){
		return n;
		}
		else if(m > n){
		return gcd(m-n,n);
		}
		else{
		return gcd(m, n-m);
		}
	}

}
