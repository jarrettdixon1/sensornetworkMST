import java.util.Comparator;



public class Edge implements Comparator<Edge>, Comparable<Edge>{
		int source;
		int dest;
		int weight;
		
		Edge(){
			source = 0;
			dest = 0;
			weight = 0;
		}
		Edge(int s, int d, int w){
			source = s;
			dest = d;
			weight = w;
			
		}
		@Override
		public int compareTo(Edge e) {
			// TODO Auto-generated method stub
			Integer i = new Integer(this.weight);
			return i.compareTo(e.weight);
		}
		@Override
		public int compare(Edge e1, Edge e2) {
			// TODO Auto-generated method stub
			return e1.weight - e2.weight;
		}
		
		
	}