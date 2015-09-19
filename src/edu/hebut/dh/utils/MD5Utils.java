package edu.hebut.dh.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class MD5Utils {
	
	/**
	 * �����������ַ�������md5���ܺ�BASE64����Ȼ�󷵻�
	 * @param str
	 * @return
	 */
	public static String encode(String str){
		java.security.MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("md5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		byte[] print = md.digest(str.getBytes());
		return new BASE64Encoder().encode(print);
	}
}
