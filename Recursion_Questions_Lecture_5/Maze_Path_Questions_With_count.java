package Recursion_Questions_Lecture_5;
public class Maze_Path_Questions_With_count {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=4;  //row
	        int m=5;  // column
	        System.out.println("\n"+printpath(0,0,n-1,m-1,""));
		}
		// cc=current col,cr=current row,er=end row,ec=end col
		public static int printpath(int cc,int cr,int er,int ec,String ans) {
			if(cr==er&&cc==ec) {
				System.out.println(ans);
				return 1;
			}
			if(cr>er||cc>ec) {
				return 0;
			}
			int a1=printpath(cc+1,cr,er,ec,ans+"H");
			int a2=printpath(cc,cr+1,er,ec,ans+"V");
			return a1+a2;
	}
}
