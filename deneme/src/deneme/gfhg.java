package deneme;

public class gfhg {

	public static void main(String[] args) {
		
		int array[]= {32,27,64,18,95,14,90,70,60,17};
		

		int i=9;

		for (int counter=0;counter<array.length/2;counter++) {
			int temp;
			
			array[counter]=array[i];
			temp=array[i];
			i--;
	}
		
		for (int counter=0;counter<array.length;counter++) {
			
			System.out.printf("%5d%8d%n",counter,array[counter]);
	
	}
	
		
			
			
		

	}

}
