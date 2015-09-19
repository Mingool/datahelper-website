package edu.hebut.dh.utils;

import java.util.Random;

public class StringUtils {
	
	/**
	 * 生成Token
	 * @param length
	 * @return
	 */
	public static String getRandomString(int length) {
	    String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";   
	    Random random = new Random();   
	    StringBuffer sb = new StringBuffer();   
	    for (int i = 0; i < length; i++) {   
	        int number = random.nextInt(base.length());   
	        sb.append(base.charAt(number));   
	    }   
	    return sb.toString();   
	 }  
}
