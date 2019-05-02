import java.util.Stack;

public class VMIQueue <AnyType>{

	private Stack<AnyType> s1;
	private Stack<AnyType> s2;

	public VMIQueue(){
		s1 = new Stack<>();
		s2 = new Stack<>();
	}

	//returns the number of elements in the queue
	public int size(){

		return s1.size();
	}

	//returns the element at the front of the queue without removing it
	public AnyType peek(){
		return s2.peek();
	}

	//add an element to the queue
	public void enqueue(AnyType item){ //add
		s1.push(item);

	}

	//remove an element from the queue
	public AnyType dequeue() { //pop
		if(s2.isEmpty()){
			for(int i=s1.size();i>0;i--){
				s2.push(s1.get(i-1));
			}
		}

		return s2.pop();

	}


	public static void main(String[] args){
		VMIQueue queue = new VMIQueue();

		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);

		System.out.println(queue.dequeue());
		System.out.println(queue.peek());



	}
}
