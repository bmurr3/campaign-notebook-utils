/**
 * Logic
 * 
 * @version 1.0 7 June 2020
 * @author William Murray
 */
package com.util.logic;

public class Logic {
	
	/**
	 * 
	 * @param arg0
	 * @param args
	 * @return
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
	
	public static boolean xor(boolean arg0, boolean arg1) {
		return or(and(arg0, !arg1), and(!arg0, arg1));
	}
}
