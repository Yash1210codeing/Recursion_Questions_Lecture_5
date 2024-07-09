package Recursion_Questions_Lecture_5;
import java.util.*;
public class Mobile_Key_Pad_Questions_Useing_Recursion_Leetcode_Question_17 {
	static String[]code= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String ques="23";
       List<String>ll=new ArrayList<>();
       printanswer(ques,"",ll);
       System.out.println(ll);
	}
	public static void printanswer(String ques,String ans,List<String>ll) {
		if(ques.length()==0) {
			//System.out.println(ans+" ");
			ll.add(ans);
			return;
		}
		char ch=ques.charAt(0); //2
		String press=code[ch-48];//abc
		for(int i=0;i<press.length();i++) {
			printanswer(ques.substring(1),ans+press.charAt(i),ll);			
		}
	}
}
