public class CustomStack {
    int[] stack;
    int top = -1;
    int capacity;

    public CustomStack(int capacity){
        this.capacity = capacity;
        this.stack = new int[capacity];
    }

    public boolean isEmpty(){
        return this.top == -1;
    }

    public void push(int data){
        if(this.stack.length != capacity -1){
            this.stack[++top] = data;
        }else{
            System.out.println("Stack is out of bond.");
        }
    }

    public void pop(){
        if(top != -1){
            this.stack[top--] = 0;
        }else{
            System.out.println("Stack is empty.");
        }
    }

    public void printStack(){
        for (int entity: this.stack) {
            System.out.println(entity);
        }
    }

}