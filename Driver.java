import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;



public class Driver {
	public static void main(String[] args){
		
		Random rnd = new Random();
		ArrayList<Edge> edges = new ArrayList<>();
		for(int i = 0; i<10; i++){
			
			Edge edge = new Edge(1,0, rnd.nextInt(100));
			
			edges.add(edge);
			
			
		}
		
		for(int i = 0; i< edges.size(); i++){
			System.out.println("Edge # " + i + " Edge weight: " + edges.get(i).weight);
			
		}
		Collections.sort(edges);
		System.out.println();
		for(int i = 0; i< edges.size(); i++){
			System.out.println("Edge # " + i + " Edge weight: " + edges.get(i).weight);
			
		}
		
		
	}

}
