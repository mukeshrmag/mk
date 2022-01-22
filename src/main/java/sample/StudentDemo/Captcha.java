package sample.StudentDemo;

import java.util.Random;

public class Captcha {
public String getcaptcha() {
char data[]= {'q','w','Q','W','E','T','Y','U','I','O','P','A','S',
		'D','F','G','H','J','K','L','Z','X','C','V','e','r','t','y','u','i','o','p',
		'a','s','d','f','g','h','j','k','l','z','x','1','2','3','5','6','9'};
char[] index =new char[4];
Random r =new Random();
for (int i = 0; i < index.length; i++) {
	int ren=r.nextInt(data.length);
	index[i]=data[ren];	
}
return new String(index); 
  
}
}
