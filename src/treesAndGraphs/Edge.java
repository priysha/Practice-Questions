package treesAndGraphs;

import java.util.*;

public class Edge<T> {
	
	private Node<T> node1;
	private Node<T> node2;
	private int weight;
	public Edge(Node<T> node1, Node<T> node2, int weight){
		this.node1 = node1;
		this.node2 = node2;
		this.setWeight(weight);
	}
	public Node<T> fromNode(){
		return this.node1;
	}
	public Node<T> toNode(){
		return this.node2;
	}
	public boolean isBetween(Node<T> node1, Node<T> node2){
		return (this.node1 == node1 && this.node2 == node2);
	}
	public int weight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
