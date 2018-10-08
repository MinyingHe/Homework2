
public class Question_5 {

	public static void main(String[] args) {
		int[]test= {2,5,23,45,65,190,403,506,1};
		mergeSort(test);
		for(int i=0;i<test.length;i++) {
			System.out.print(test[i]+" ");
		}

	}
	public static void mergeSort(int[]a) {
		rMS(a,0,a.length-1);
	}
	public static void rMS(int[] a, int low, int high) {
		if(low<high) {
			int mid=(high+low)/2;
			rMS(a,low,mid);
			rMS(a,mid+1,high);
			merge(a,low,mid,high);
		}
	}
	public static void merge(int []a,int low, int mid,int high) {
		int n1=mid-low+1;
		int n2=high-mid;
	
		int[]b= new int[n1];//creates 2 sub-arrays
		int[]c= new int[n2];
		for(int i=0;i<n1;++i) {//copies the content of the main arrays into the sub-arrays
			b[i]=a[i+low];
			System.out.print("b["+i+"]:"+b[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n2;++i) {
			c[i]=a[mid+i+1];
			System.out.print("c["+i+"]:"+c[i]+" ");
		}
		System.out.println();
		int b1=0,c1=0;//counter for the newly created arrays
		int a1=low;//counter for the main array
		while(b1<b.length&&c1<c.length) {//puts them in order
			if(b[b1]<=c[c1]) {
				a[a1]=b[b1];
				b1++;
			}else {
				a[a1]=c[c1];
				c1++;
			}	
			a1++;
		
		}
		while(b1<b.length) {//put remainder into the array
			a[a1]=b[b1];
			b1++;
			a1++;
		}
		while(c1<c.length) {
			a[a1]=c[c1];
			c1++;
			a1++;
		}
	}

}
