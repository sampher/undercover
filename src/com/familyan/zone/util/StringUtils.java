package com.familyan.zone.util;

public class StringUtils {
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static String nullToBlank(String str){
		if(str == null){
			return "";
		}
		
		return str;
	}
	
	
}
