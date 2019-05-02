import java.util.ArrayList;

public class arr <AnyType extends Comparable>{

	ArrayList<AnyType> list;

	public arr (){
		list = new ArrayList<>();
	}

	public void add(AnyType x){
		if(list.isEmpty())
			list.add(x);

		for(int i=0;i<list.size();i++){
			if(x.compareTo(list.get(i))==-1){
				list.add(x);
				break;
			}
		}
	}

	public void display(){
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
	}

	public static void main(String[] args){

		arr ar = new arr();

		ar.add(1);
		ar.add(2);
		ar.add(4);
		ar.add(3);


		ar.display();

	}
}
