package login;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Helper {
	
	@DataProvider(name = "LoginData")
	
	public Object[][] loginData(Method m){
		Object[][] obj = {new Object[1],new Object[2]};
		
	if(m.getName().contains("ValidData")) {
			obj = new Object[1][2];
			
			obj[0][0] = "gagapetrovic989@gmail.com";
			obj[0][1] = "galeb989";
    }
	
	if(m.getName().contains("InvalidData")) {
		obj = new Object[1][2];
		
		obj[0][0] = "gaga989@gmail.com";
		obj[0][1] = "123456";
	}
	
	if(m.getName().contains("ValidEmailInvalidPassword")) {
		obj = new Object[1][2];
		
		obj[0][0] = "gagapetrovic989@gmail.com";
		obj[0][1] = "123456";
	}
	
	if(m.getName().contains("InvalidEmailValidPassword")) {
		obj = new Object[1][2];
		
		obj[0][0] = "gaga989@gmail.com";
		obj[0][1] = "galeb989";
	}
	
	if(m.getName().contains("LongData")) {
		obj = new Object[1][2];
		
		obj[0][0] = "gagaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa989@gmail.com";
		obj[0][1] = "11111111111111111111111111111111111111111111111111111111111";
	}
	
	if(m.getName().contains("Blank")) {
		obj = new Object[1][2];
		
		obj[0][0] = "";
		obj[0][1] = "";
	}
	
	if(m.getName().contains("BlankEmail-ValidPassword")) {
		obj = new Object[1][2];
		
		obj[0][0] = "";
		obj[0][1] = "galeb989";
	}
	
	if(m.getName().contains("ValidEmail-BlankPassword")) {
		obj = new Object[1][2];
		
		obj[0][0] = "gagapetrovic989@gmail.com";
		obj[0][1] = "";
	}
	
	if(m.getName().contains("ValidEmail-ShortPassword")) {
		obj = new Object[1][2];
		
		obj[0][0] = "gagapetrovic989@gmail.com";
		obj[0][1] = "gaga";
	}
	
	if(m.getName().contains("InappropriateEmail-ValidPassword")) {
		obj = new Object[1][2];
		
		obj[0][0] = "gagapetrovic989";
		obj[0][1] = "galeb989";
	}
	
	if(m.getName().contains("SpecialCharactersInEmail-ValidPassword")) {
		obj = new Object[1][2];
		
		obj[0][0] = "#$%^^&&&***@gmail.com";
		obj[0][1] = "galeb989";
	}
	
	if(m.getName().contains("SpecialCharactersInEmail-ValidPassword")) {
		obj = new Object[1][2];
		
		obj[0][0] = "#$%^^&&&***@gmail.com";
		obj[0][1] = "galeb989";
	}
	
	if(m.getName().contains("CapitalLettersInValidEmail-ValidPassword")) {
		obj = new Object[1][2];
		
		obj[0][0] = "DRAGANAPETROVIC989@gmail.com";
		obj[0][1] = "galeb989";
	}
    
	return obj;
    
    }
    }