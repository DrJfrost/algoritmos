
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static ArrayList<Integer> vector;
	
	public static void main(String[] args) {
		
		vector = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a limit ");			
		String limite = scan.nextLine();
		fill(Integer.parseInt(limite));
		scan.close();
		
		long startTime = System.nanoTime();
		vector=selectionAlgorythm(vector);
		long endTime = System.nanoTime();

		long duration = (endTime - startTime);
		
		for (int i=0; i<vector.size(); i++) {
			System.out.println(vector.get(i));
		}
		System.out.println(duration/1000000 + " milliseconds vector size:" + vector.size());
	}
	
	public static void fill (int limite) { 
		for (int i = 0; i<limite; i++) {
			vector.add((int)(Math.random() * 1001));
		}
	}
	
	public static ArrayList<Integer> selectionAlgorythm(ArrayList<Integer> array){
			for (int i = 0; i < array.size(); i++) {
				for (int j = i + 1; j< array.size(); j++) {
					if(array.get(i)>array.get(j)) {
						int temp = array.get(i);
						array.set(i, array.get(j));
						array.set(j, temp);
					}
				}
			}
		return array;
		
	}
	
	public static ArrayList<Integer> selectionAlgorythm2(ArrayList<Integer> array){
		for (int i = 0; i < array.size(); i++) {
			for (int j = i + 1; j< array.size(); j++) {
				if(array.get(i)<array.get(j)) {
					int temp = array.get(i);
					array.set(i, array.get(j));
					array.set(j, temp);
				}
			}
		}
	return array;
	
	}

	public static ArrayList<Integer> insertionAlgorythm(ArrayList<Integer> array){
		for (int i = 1; i < array.size(); i++) {
			int temp = array.get(i);
			int j = i-1;
			while((j>=0) && (temp < array.get(j))) {
				array.set(j + 1, array.get(j));
				j--;
			}
			array.set(j + 1, temp);
		}
	return array;
	
	}
}
