package Assignment6;
/*
	Evan Monteith
	Homework #6
	Question 7.38a
 */
public class BionomialCoefficient {

	//private int n;
	//private int k;

	public BionomialCoefficient(){

	}

	public static int C(int n,int k){
		if(k==0 || n==k)
			return 1;

		return (C(n-1,k)+C(n-1,k-1));

	}

	public static void main(String[] args){
		System.out.println(C(25,5));
	}

}
