import java.util.ArrayDeque;

public class SimpleStack {
    private ArrayDeque<Integer> stack;

    public SimpleStack() {
        stack = new ArrayDeque<>();
    }

   
    public void push(int value) {
        stack.push(value);
        System.out.println(value + " pushed to stack.");
    }

    
    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Nothing to pop.");
        } else {
            int poppedValue = stack.pop();
            System.out.println(poppedValue + " popped from stack.");
        }
    }

    
    public void peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
        } else {
            int topValue = stack.peek();
            System.out.println("Top element is: " + topValue);
        }
    }

    
    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack();

        
        stack.push(10); 
        stack.push(20); 
        stack.push(30); 

        stack.peek();  

        stack.pop();  
        stack.pop();   

        stack.peek();   
    }
}
