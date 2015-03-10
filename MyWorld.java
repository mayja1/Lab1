import java.util.Stack;


/**
 * TODO This class prints "Hello, world" 300 times.
 *
 * @author mayja1. Austin May
 *         Created Sep 5, 2013.
 */
public class MyWorld {

	/**
	 * This method prints Hello, world 300 times
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		String word= "abcd";
		Stack<String> stack= new Stack<String>();

		for(int i=1; i<=word.length(); i++){
		stack.push(word.substring(i-1,i));
			}

		System.out.println(stack.peek());
		for(String s: stack){
		System.out.print(s + " ");
		}


	}

}
