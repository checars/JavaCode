package com.neu.checars;

import java.util.regex.Pattern;
import java.util.Scanner;

public class BigIntegerSub { 
	
 public static void main(String[] args) { 
	 // TODO Auto-generated method stub
	 Scanner scan = new Scanner(System.in); 
	 while(scan.hasNext())
	 {
	 	String str = scan.nextLine();
	 	String[] strArr  = str.split(" ");
	 	System.out.println(solve(strArr[0] , strArr[1]  )); 
	 }
	 scan.close();	 
}
 
 public static String solve(String st1, String st2) {  
	 
     Pattern pattern = Pattern.compile("[0-9]+?");  
     
     if (!pattern.matcher(st1).matches() || !pattern.matcher(st2).matches()) {  
         return "";  
         
     } else if (st1.equals(st2)) {  
         return "0";  
     } else {  
         StringBuilder sb = new StringBuilder();  
         int length0 = st1.length();  
         int length1 = st2.length();  
         String s_temp=st1;  
         String t_temp=st2;  
         st1 = new StringBuilder(st1).reverse().toString();  
         st2 = new StringBuilder(st2).reverse().toString();  
         int min;  
         if (length0 > length1 || (length0 == length1 && f(s_temp, t_temp))) {  
             min = length1;  
             int temp = 0;  
             for (int i = 0; i < min; i++) {  
                 char x = st1.charAt(i);  
                 char y = st2.charAt(i);  
                 int result = x - y + temp;  
                 if (result < 0) {  
                     result += 10;  
                     temp = -1;  
                 }else {  
                     temp = 0;  
                 }  
                int r1 = result % 10;  
                 sb.append(r1);  
             }  
             while (temp != 0 && min < length0) {  
                 int result = st1.charAt(min) - '0' + temp;  
                 if (result < 0) {  
                     result += 10;  
                     temp = -1;  
                 } else {  
                     temp = 0;  
                 }  
                 int r1 = result % 10;  
                 sb.append(r1);  
                 min++;  
             }  
             if (min < length0) {  
                 String str = st1.substring(min, length0);  
                 sb.append(str);  
             }  
             String result = sb.reverse().toString();  
             while (result.indexOf("0") == 0) {  
                 result = result.substring(1, result.length());  
             }  
             return result;  
         } else {  
             sb.append(solve(new StringBuilder(st2).reverse().toString(),  
                     new StringBuilder(st1).reverse().toString()));  
             return "-" + sb.toString();  
         }  
     }  
 } 
 
 public static boolean f(String st1,String st2){ 
	 if(st1.length()<st2.length()){ 
		 
		 return false; 
		 
	 }else if(st1.length()==st2.length()){
		 
			 for(int i=0;i<st1.length();i++){
				 
				 if(st1.charAt(i)==st2.charAt(i)) 
					 continue; 
				 else if((st1.charAt(i)-st2.charAt(i))>0) 
					 break; 
				else if((st1.charAt(i)-st2.charAt(i))<0) 
					 return false; 
				} 
			} 
	 return true; 
	 }

 
 
}