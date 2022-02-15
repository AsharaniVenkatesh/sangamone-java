package JavaProgramming;

import java.security.MessageDigest;

public class MD5Example {
	
public static String md5Java(String employee_useless) {
	
	
		
		String digest = null; 
		try
		{ 
			MessageDigest md = MessageDigest.getInstance("MD5"); 
			byte[] hash = md.digest(employee_useless.getBytes("UTF-8")); 
			//converting byte array to Hexadecimal String 
			StringBuilder sb = new StringBuilder(2*hash.length); 
			for(byte b : hash)
			{ 
				sb.append(String.format("%02x", b&0xff));
			}
			digest = sb.toString();
			
		} 
		catch(Exception e)
		{
			e.printStackTrace();	
		}
		return digest;
		
	}

public static void main(String[] args) {
	
	MD5Example md5ex=new MD5Example();
	String password=MD5Example.md5Java("asha@12");
	System.out.println(password);
	
	String password1="e3f21a3e5c78ac2206be7e7a95b2706a";
	
	if(password1.equals(MD5Example.md5Java("asha@123"))) {
		System.out.println("password present");
		
	}else {
		System.out.println("password not present");
	}
		
		
	}
}
