import java.util.*;
class Contains_num{
	public static void main(String [] args){
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter two input : ");
		String num = sc.next();
		String val = sc.next();
		for(int i= Integer.parseInt(num);i>=0;i--){
			if(String.valueOf(i).contains(val)){}
			else{
				System.out.println("the value is "+i);
				break;
			}
		}
	
	}

}