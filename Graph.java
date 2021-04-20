import java.util.*;
public class Graph {
	private LinkedList<Integer> adj[];
	
	@SuppressWarnings("unchecked")
	public Graph(int v) {
		adj=new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList<Integer>();
		}
	}
	public void addEdge(int source,int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
		}
public int bfs(int source, int destination) {
		
		boolean vis[] = new boolean[adj.length];
		int parent[] = new int[adj.length];
		Queue<Integer> q = new LinkedList<>();
		
		q.add(source);
		parent[source] = -1;
		vis[source] = true;
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			if(cur == destination) break;
			
			for(int neighbor: adj[cur]) {
				if(!vis[neighbor]) {
					vis[neighbor] = true;
					q.add(neighbor);
					parent[neighbor] = cur;
				}
			}
		}
		
		int cur = destination;
		int distance = 0;
		
		
		while(parent[cur] != -1) {
			System.out.print(cur+" -> ");
			cur = parent[cur];
			distance++;
		}
		
		return distance;
	}
	
	private boolean dfsUtil(int source, int destination, boolean vis[]) {
		if(source == destination) return true;
		
		for(int neighbor: adj[source]) {
			if(!vis[neighbor]) {
				vis[neighbor] = true;
				boolean isConnected = dfsUtil(neighbor, destination, vis);
				if(isConnected) return true;
			}
		}
		
		return false;
	}
	
	public boolean dfsStack(int source, int destination) {
		boolean vis[] = new boolean[adj.length];
		vis[source] = true;
		Stack<Integer> stack = new Stack<>();
		
		stack.push(source);
		
		while(!stack.isEmpty()) {
			int cur = stack.pop();
			
			if(cur == destination) return true;
			
			for(int neighbor: adj[cur]) {
				if(!vis[neighbor]) {
					vis[neighbor] = true;
					stack.push(neighbor);
				}
			}
		}
		
		return false;
	}
	
	public boolean dfs(int source, int destination) {
		boolean vis[] = new boolean[adj.length];
		vis[source] = true;
		
		return dfsUtil(source, destination, vis);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of vertices & edges:");
		int v=sc.nextInt();
		int e=sc.nextInt();
		Graph g=new Graph(v);
		System.out.println("Enter edges:");
		int s;
		int d;
		for(int i=0;i<e;i++) {
			s=sc.nextInt();
			d=sc.nextInt();
			g.addEdge(s,d);
		}
System.out.println("Enter source and destination");
		
		int source = sc.nextInt();
		int destination = sc.nextInt();
		System.out.println("possible " + g.dfsStack(source, destination));
		sc.close();
		

	}

}
