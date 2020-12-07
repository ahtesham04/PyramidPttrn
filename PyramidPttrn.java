import java.util.Scanner;

public class PyramidPttrn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int n = sc.nextInt();
		int count =0;
		for(int i=1; i<=n; i++) {
			for(int s=0; s<n-i; s++) {
				System.out.print(" "+" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print(j+" ");
				count=count+j;
			}
			System.out.println();
		}
		System.out.println(count);
	}

}
