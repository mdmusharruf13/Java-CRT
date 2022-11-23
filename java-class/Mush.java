import java.util.*;
class Mush{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String val="";
		System.out.println("Enter first value :");
		String first = sc.nextLine();
		System.out.println("Enter second value :");
		char second = sc.next().charAt(0);
		int m=0;
		int len=first.length();
		if(second==first.charAt(len-1)){
			int tmp=Integer.valueOf(first);
			System.out.println(--tmp);
			m=1;
		}
		else if(second!=first.charAt(len-1)){
			for(int i=0; i<len; i++){
				if(first.charAt(i)==second){
					for(int j=i+1;j<len;j++){
						val=val.concat(String.valueOf(first.charAt(j)));
					}
					int real=Integer.valueOf(val);	
					int num=Integer.valueOf(first);
					int res=num-real;
					res=res-1;
					System.out.println(res);
					m=1;
				}
			}
		}
		if(m==0){
			System.out.println(first);
		}
	}
}