package com.util;

/**
 * Node
 * 
 * @version 1.0 14 June 2020
 * @author William Murray
 *
 * @param <T> 
 */
public class Node<T> {
	private T nodeData;
	private Node<T> previousNode;
	private Node<T> nextNode;
	
	/**
	 * The basic constructor. Stores a data point to referenced later.
	 * 
	 * @param data A data point to be stored in the list.
	 */
	public Node(T data) {
		this.nodeData = data;
		this.previousNode = null;
		this.nextNode = null; 
	}
	
	/**
	 * The data stored in the Node.
	 * 
	 * @return The stored data.
	 */
	public T getData() {
		 return this.nodeData;
	 }
	
	/**
	 * The previous node in the list.
	 * 
	 * @return The previous node.
	 */
	public Node<T> getPreviousNode() {
		return this.previousNode;
	}
	
	/**
	 * The next node in the list.
	 * 
	 * @return The next node.
	 */
	public Node<T> getNextNode() {
		return this.nextNode;
	}
	
	/**
	 * Set a new data point in the node.
	 * 
	 * @param data
	 */
	public void setData(T data) {
		this.nodeData = data;
	}
	
	/**
	 * Set the previous node in the list.
	 * 
	 * @param previous
	 */
	public void setPreviousNode(Node<T> previous) {
		this.previousNode = previous;
	}
	
	/**
	 * Set the next node in the list.
	 * 
	 * @param next
	 */
	public void setNextNode(Node<T> next) {
		this.nextNode = next;
	}
}