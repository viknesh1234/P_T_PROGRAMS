import java.util.*;
public class ADSA7 {
	static List<Integer> list1=new ArrayList<Integer>();
	static List<Integer> list2=null, ls=new ArrayList<Integer>();
	static List<List> lst=new ArrayList<List>();
	public static void main(String[] args) {
	int Elist[][]= {{0,1,1,1},
					{1,0,0,0},
					{1,0,0,1},
					{1,0,1,0}};
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println("Vertices:");
	System.out.println(list1);
	System.out.println("Edges:");
	list2=list1;
	//System.out.println(list2);
	CreateEdges(list1,list2, Elist);
	
	}

	 static void CreateEdges(List v1, List v2, int[][] lt) {
		 for(int i=0;i<v1.size();i++)
		 {		//System.out.println(v1);
			 //boolean v11=true;
			 //ls.add((Integer)v1.get(i));
			 for(int j=0;i<v2.size();i++)
			 {
				 
				 if(isEle((Integer)v1.get(i))==lt[i][j] && lt[i][j]==1)
				 {
					// System.out.println("Hello");
					//ls.add((Integer) v1.get(j));
					//lst.add(ls);
					 ls.add((Integer) v1.get(i));
					ls.add((Integer) v2.get(j));
					lst.add(ls);
					ls.removeAll(ls);
					ls.add((Integer) v2.get(j));
					ls.add((Integer) v1.get(i));
					//List newls=SwapList(ls);
					lst.add(ls);
					 System.out.println(lst);
				 }
			 
				//ls=null;
				
			 }
		 }
		 //System.out.println(lst);
	}

	  static List<Integer> SwapList(List<Integer> ls) {
		  int a=ls.get(0);
		  int b=ls.get(1);
		int temp=a;
		a=b;
		b=temp;
		return ls;
	}

	static int isEle(Integer integer) {
		// TODO Auto-generated method stub
		return 1;
	}
}