package Javaprograme;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=123456;
        int reverse=0;
        while(n!=0){
        	int remainder=n%10;
        	reverse=reverse*10+remainder;
        	n=n/10;
        	
        }
        System.out.println(reverse);
	}

}
