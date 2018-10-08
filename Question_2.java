
public class Question_2 {

	public static void main(String[] args) {
		int i=5;
		i=i+5;
	}
	public static int sum_for(int n) {
		int i=0,sum=0;
		for (i=0;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	public static int sum_while(int n) {
		int i=0,sum=0;
		while(i<=n) {
			sum+=1;
			i++;
		}
		return sum;
	}
	public static int fact (int n) {
		if (n==0) {
			return 1;
		}else {
				return n*fact(n-1);
		}
	}
	public static int fib (int n) {
		if(n==0||n==1) {
			return 1;
		}else {
			return fib(n-1)+fib(n-2);
		}
	}

}


