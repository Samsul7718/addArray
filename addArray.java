
import java.util.*;

public class addArray {

	public static void main(String[] args) {
 
		int size,item,i;
		
		Scanner r= new Scanner(System.in);
		System.out.print("Enter Array Size -:  ");
		size=r.nextInt();
		
		
		int arr[]=new int[size+1];
		System.out.print("Enter Array Element: ");
		
		for(i=0; i<size; i++) {
			arr[i]=r.nextInt();
		}	
		System.out.print("Enter New Array Element: ");
		item=r.nextInt();
		arr[size]=item;
		for(i=0; i<=size; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
