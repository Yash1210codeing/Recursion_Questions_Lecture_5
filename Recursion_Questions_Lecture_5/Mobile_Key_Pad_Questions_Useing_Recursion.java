package Recursion_Questions_Lecture_5;
public class Mobile_Key_Pad_Questions_Useing_Recursion {
	static String[]code= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String ques="23";
        printanswer(ques,"");
	}
	public static void printanswer(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans+" ");
			return;
		}
		char ch=ques.charAt(0); //2
		String press=code[ch-48];//abc
		for(int i=0;i<press.length();i++) {
			printanswer(ques.substring(1),ans+press.charAt(i));			
		}
	}
}
