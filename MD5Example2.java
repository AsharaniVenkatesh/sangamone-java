package JavaProgramming;

import java.security.MessageDigest;

public class MD5Example2 {
	
	public static String md5Java(String emp_useless) {
		
		String digest=null;
		
		try {
			
			MessageDigest md=MessageDigest.getInstance("MD5");
			byte[] hash=md.digest(emp_useless.getBytes("UTF-8"));
			
			StringBuilder sb= new StringBuilder(2*hash.length);
			
			for(byte b : hash) {
				sb.append(String.format("%02x", b&0xff));
			}
			
			digest = sb.toString();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		return digest;
	}
public static void main(String args[]) {
	MD5Example2 md5ex=new MD5Example2();
	
	String opass=MD5Example2.md5Java("naukri1");
	System.out.println(opass);
}
}
