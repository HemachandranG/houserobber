package count;
import java.util.Scanner;
public class robber {

	public static void main(String[] args) {
		Scanner H = new Scanner(System.in);
		int n = H.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=H.nextInt();
		}
		int sum=0;
		 for(int i =0;i<n;i=i+2) {
			 sum+=arr[i];
		 }
		 System.out.println(sum);

	}

}
