package rotations;

import java.util.Stack;

public class Amazon {
	public static void main(String args[]) {
		int arr[] = { 1,2,5,10,35,89};
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}
		findMinValue(stack);
	}

	static void findMinValue(Stack<Integer> values) {
		int min=findValues(values);
		System.out.println(min);
	}

	static int findValues(Stack<Integer> stack) {
		if (stack.size() == 1)
			return 0;
		else {
			stack = sortstack(stack);
			Integer a = stack.pop();
			Integer b = stack.pop();
			Integer sum = a + b;
			stack.push(sum);
			return sum + findValues(stack);
		}

	}

	public static Stack<Integer> sortstack(Stack<Integer> input) {
		Stack<Integer> tmpStack = new Stack<Integer>();
		while (!input.isEmpty()) {

			int tmp = input.pop();

			while (!tmpStack.isEmpty() && tmpStack.peek() < tmp) {

				input.push(tmpStack.pop());
			}

			tmpStack.push(tmp);
		}
		return tmpStack;
	}

}
