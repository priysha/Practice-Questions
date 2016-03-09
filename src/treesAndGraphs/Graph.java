package treesAndGraphs;

import java.util.*;

public class Graph<T>{

	private Map<T,Node<T>> adjList = new HashMap<>();
	
	public boolean addVertex(T vertex){
		if (adjList.containsKey(vertex)) return false;
		adjList.put(vertex, new Node<T>(vertex));
		return true;
	}
	public boolean addEdge(T vertex1, T vertex2){
		return addEdge(vertex1, vertex2, 0);
	}
	public boolean addEdge(T vertex1, T vertex2,int weight){
		if (!containsVertex(vertex1) || !containsVertex(vertex2)){
			throw new RuntimeException ("Vertex doesnt exist");
			}
		Node<T> node1 = new Node<T>(vertex1);
		Node<T> node2 = new Node<T>(vertex2);
		return node1.addEdge(node2, weight);
		}
	
	public boolean removeEdge(T vertex1, T vertex2){
		if (!containsVertex(vertex1) || !containsVertex(vertex2)){
			return false;
		}
		return getNode(vertex1).removeEdge(getNode(vertex2));
	}
	public boolean removeVertex (T vertex){
		if (!containsVertex(vertex)){
			return false;
		}
		final Node<T> toRemove = getNode(vertex);
		adjList.values().forEach(node -> node.removeEdge(toRemove));
		adjList.remove(vertex);
		return true;
	}
	public int edgeCount(){
		return adjList.values().stream().mapToInt(Node::getEdgeCount).sum();
	}
	
	public boolean containsVertex(T vertex){
		return adjList.containsKey(vertex);
	}
	public boolean containsEdge(T vertex1, T vertex2){
		if (!containsVertex(vertex1) || !containsVertex(vertex2)){
			return false;
		}
		return getNode(vertex1).hasEdge(getNode(vertex1));
	}
	public Node<T> getNode(T vertex){
		return adjList.get(vertex);
		
	}
	
}
