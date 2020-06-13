package com.util.logic;

/**
 * Logic
 * 
 * @version 1.0 7 June 2020
 * @author William Murray
 */
public class Logic {
	
	/**
	 * Perform a boolean AND on a variable number of arguments.
	 * 
	 * @param arg0 A boolean expression.
	 * @param args A variable number of boolean expressions.
	 * @return The result of performing a boolean AND on all arguments.
	 */
	public static boolean and(boolean arg0, boolean ... args) {
		boolean result = arg0;
		
		if (result == false) {
			return result;
		}
		
		for (boolean arg : args) {
			result = result && arg;
			
			if (result == false) {
				return result;
			}
		}
		
		return result;
	}
	
	/**
	 * Perform a boolean OR on a variable number of arguments.
	 * 
	 * @param arg0 A boolean expression.
	 * @param args A variable number of boolean expressions.
	 * @return The result of performing a boolean OR on all arguments.
	 */
	public static boolean or(boolean arg0, boolean ... args) {
		boolean result = arg0;
		
		if (result == true) {
			return result;
		}
		
		for (boolean arg : args) {
			result = result || arg;
			
			if (result == true) {
				return result;
			}
		}
		
		return result;
	}
	
	/**
	 * Perform a boolean XOR.
	 * 
	 * @param arg0 A boolean expression.
	 * @param arg1 A boolean expression.
	 * @return The result of performing a boolean XOR.
	 */
	public static boolean xor(boolean arg0, boolean arg1) {
		return or(and(arg0, !arg1), and(!arg0, arg1));
	}
}