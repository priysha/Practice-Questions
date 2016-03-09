package treesAndGraphs;

import java.util.*;

public class Node<T> {
	
	private T vertex;
	private List<Edge<T>> edges;
	private Node<T> parent;
	private boolean isVisited;
	
	public T vertex(){
		return vertex;
	}
	
	public Node(T vertex){
		this.vertex = vertex;
	}
	
	public boolean addEdge(Node<T> node, int weight){
		if (hasEdge(node)){
			return false;
		}
		Edge<T> newEdge = new Edge<T>(this,node,weight);
		return edges.add(newEdge);
	}
	
	public boolean removeEdge(Node<T> node){
		Optional<Edge<T>> optional = findEdge(node); 
		if (optional.isPresent()){
			return edges.remove(optional.get());
		}
		return false;
	}
	
	public boolean hasEdge(Node<T> node){
		return findEdge(node).isPresent();
	}
	
	public Optional<Edge<T>> findEdge(Node<T> node){
		return edges.stream().filter(edge -> edge.isBetween(this, node)).findFirst();
		}
	
	public List<Edge<T>> edges(){
		return edges;
	}
	
	public int getEdgeCount(){
		return edges.size();
	}
	public Node<T> parent(){
		return this.parent;
	}
	public void setParent(Node<T> node){
		this.parent = node;
	}
	public boolean isVisited(){
		return this.isVisited;
	}
	public void setVisited(boolean isVisited){
		this.isVisited = isVisited;
	}
}
