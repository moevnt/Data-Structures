import java.util.LinkedList;

public class ll <AnyType extends Comparable>{

	private LinkedList<AnyType> linkedList;

	public ll(){
		linkedList = new LinkedList();
	}

	public void add(AnyType input){

		linkedList.addFirst(input);
	}

	public AnyType takeFront(){
		return linkedList.removeFirst();
	}

	public AnyType takeBack(){
		return linkedList.removeLast();
	}

	public void show(){
		for(int i=0;i<linkedList.size();i++){
			System.out.print(linkedList.get(i)+" ");
		}
	}

	public static void main(String[] args){
		ll l =new ll();

		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);

		l.show();
		System.out.println();
		l.takeFront();
		l.show();
		l.takeBack();
		System.out.println();
		l.show();
	}

}
