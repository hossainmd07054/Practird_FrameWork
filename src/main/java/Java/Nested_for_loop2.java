package Java;
public class Nested_for_loop2 {
public static void main(String[] args) {
			 
		// print 1 2 3 4
		//		 5 6 7
		// 		 8 9
		// 		 10
		
		int k=1;
		for (int i=1;i<=4; i++) {			  
		for (int j=0;j<=4-i;j++) { 
		System.out.print(k); 
		System.out.print("  "); 
		//System.out.print("\t");//Space
		k++; }
		System.out.println(""); }		
	}
	}