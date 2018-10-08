
public class Question_4 {

	public static void main(String[] args) {
		for (int i=0;i<35;i++) {
			try {
				System.out.println("Power "+i+" : "+recPow(i));
			} catch (Exception e) {
				System.out.println("The power entered is too large.");
			}
		}
		try{
			System.out.println(recPow(-1));
		}catch (Exception e) {
			System.out.println("The power entered is too small.");
		}

	}
	public static int recPow(int n) throws Exception {
		if(n<=30&&n>=0) {
			if (n==0) {
				return 1;
			}else {
				return 2*recPow(n-1);
			}
		}if(n<=30) {
			throw new Exception("Number too large");
		}else {
			throw new Exception("Number too small");
		}
		
		
	}

}
