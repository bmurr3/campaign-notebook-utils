package com.util;

/**
 * The List interface will allow for the handling of an indeterminate number of
 * items of a type. This will enable the user to utilize the set of items
 * without needing to know the length of the list.
 *
 * @author William Murray III
 * @version 1.0 12 July 2020
 * @param <T> the generic type
 */
public interface List<T> {
	
	/**
	 * Adds the node to the list.
	 *
	 * @param arg0 The Node to insert
	 * @return true, if successful
	 */
	public boolean addNode(Node<T> arg0);

	/**
	 * Adds the item to the list as a Node of type T.
	 *
	 * @param arg0 The item to insert
	 * @return true, if successful
	 */
	public boolean addNode(T arg0);

	/**
	 * Clear the List.
	 */
	public void clearList();

	/**
	 * Export the List as an array of type T.
	 *
	 * @return The list as an array of type T.
	 */
	public T[] exportList();

	/**
	 * Find a Node based on a search key.
	 *
	 * @param key The search key
	 * @return The matching Node, is null is not found.
	 */
	public Node<T> findNode(T key);

	/**
	 * Import the List from an array.
	 *
	 * @param dataArray THe data array to import
	 * @return true, if successful
	 */
	public boolean importList(T[] dataArray);

	/**
	 * Checks if the List is empty.
	 *
	 * @return true, if the List is empty
	 */
	public boolean isEmpty();

	/**
	 * Removes the Node that matches the search key.
	 *
	 * @param key The search key
	 * @return true, if successful
	 */
	public boolean removeNode(Node<T> key);

	/**
	 * Removes the Node that matches the search key.
	 *
	 * @param key The search key
	 * @return true, if successful
	 */
	public boolean removeNode(T key);

	/**
	 * Size of the List.
	 *
	 * @return the number of items in the List
	 */
	public int sizeOf();
}