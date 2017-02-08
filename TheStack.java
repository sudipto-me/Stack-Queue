import java.util.Arrays;

public class TheStack {
	
	private String[] stackArray;
	
	private int stackSize;
	
	private int topOfStack = -1;
	
	TheStack(int size){
		
		stackSize = size;
		
		stackArray = new String[size];
		
		Arrays.fill(stackArray,"-1");
	}
	
	public void push(String input){
		
		if(topOfStack + 1 < stackSize){
			
			topOfStack++;
			
			stackArray[topOfStack] = input;
		}
		else System.out.println("Sorry but Stack is full");
		
		displayTheStack();
		 
		System.out.println("PUSH " + input + " was added to the Stack");
	}
	
	public String pop(){
		
		if(topOfStack >=0){
			
			displayTheStack();
			
			System.out.println("POP " +  stackArray[topOfStack] + " Was removed");
			
			stackArray[topOfStack]="-1";
			
			return stackArray[topOfStack--];
		}else{
			
			displayTheStack();
			
			System.out.println("The Stack is empty");
			
			return "-1";
			
		}
	}
	
	public String peek(){
		
		displayTheStack();
		
		System.out.println("PEEK "+  stackArray[topOfStack] + " IS at the peek \n");
		
		return stackArray[topOfStack];
	}
	
	public void pushMany(String multipleValues){
		
		String[] tempString =  multipleValues.split(" ");
		
		for(int i=0; i<tempString.length;i++){
			
			push(tempString[i]);
		}
	}
	
	public void popAll(){
		
		for(int i = topOfStack;i>=0;i--){
			pop();
		}
	}
	
	public void popDisplayall(){
		
		String theReverse = " ";
		
		for(int i=topOfStack;i>=0;i--){
			
			theReverse += stackArray[i];
		}
		
		System.out.println("The reverse: "+theReverse);
		
		popAll();
	}
	 

	public  void displayTheStack() {
		// TODO Auto-generated method stub
		
		for(int n = 0; n < 61; n++)
			
			System.out.print("-");
		
		System.out.println();
		
		for(int n = 0; n < stackSize; n++){
			
			System.out.format("| %2s "+ " ", n);
			
		}
		
		System.out.println("|");
		
		for(int n = 0; n < 61; n++)System.out.print("-");
		
		System.out.println();
		
		for(int n = 0; n < stackSize; n++){
			
			
			
			if(stackArray[n].equals("-1")) System.out.print("|     ");
			
			else System.out.print(String.format("| %2s "+ " ", stackArray[n]));
			
		}
		
		System.out.println("|");
		
		for(int n = 0; n < 61; n++)System.out.print("-");
		
		System.out.println();
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TheStack thestack = new TheStack(10);
		
		thestack.push("10");
		
		thestack.push("15");
		
		thestack.push("20");
		
		thestack.push("25");
		
		thestack.peek();
		
		thestack.pop();
		
		thestack.displayTheStack();
		
		thestack.pushMany("16 18 19 22");
		
		thestack.displayTheStack();
		
		thestack.popDisplayall();
		
		//thestack.popAll();
		
		thestack.displayTheStack();
		
		
		
		 

	}

}
