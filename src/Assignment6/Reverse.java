package Assignment6;

public class Reverse {

	public Reverse(){
	}

	public static String reverse(String str){
		char[] arr = str.toCharArray();

		String resurt="";

		return reverse(arr,resurt,arr.length-1);
	}

	private static String reverse(char[] arr,String str,int index){

		str+=""+arr[index];

		if(index==0)
			return str;


		return reverse(arr, str,index-1);
	}

	public static void main(String[] args){
		String resurt = reverse("racecar");

		System.out.println(resurt);
	}
}
