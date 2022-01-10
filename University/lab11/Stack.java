import java.lang.reflect.*;
import java.util.Arrays;

class StackOverflowException extends Exception{
    StackOverflowException(String string){
        super(string);
    }
}

class StackUnderflowException extends Exception{
    StackUnderflowException(String string){
        super(string);
    }
}

public class Stack<T>
{
    private final T[] stack;
    private int size = 0;
    private int maxSize = 0;

    Stack(int max, Class<T[]> classT){
        this.maxSize=max;
        stack = classT.cast(Array.newInstance(classT.getComponentType(), max));
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == maxSize;
    }

    public void push(T x) throws StackOverflowException{
        if(!(isFull())){
            stack[size] = x;
            size++;
        }
        else
            throw new StackOverflowException("Stack is full!");

    }

    public T pop() throws StackUnderflowException{
        if(!isEmpty()){
            T tmp;
            size--;
            stack[size] = null;
            tmp = stack[size];
            return tmp;
        }
        else{
            throw new StackUnderflowException("Stack is empty!");
        }
    }

    public int getCurrentSize(){
        return size;
    }

    public int getMaxSize(){
        return maxSize;
    }

    public T getElement(int index){
        return stack[index];
    }

    public void setElement(int index, T x){
        stack[index] = x;
    }

    public String toString(){
        String string = "[";
        for(int i = 0; i<size; i++){
            string += stack[i] + ", ";
        }
        return string + "]";
    }

    public final boolean equals(Stack obj){
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (!obj.getClass().equals(this.getClass()))
            return false;
        Stack stack1 = (Stack) obj;
        if (this.size == stack1.getCurrentSize() && this.maxSize == stack1.getMaxSize() && Arrays.equals(this.stack, stack1.stack))
            return true;
        else
            return false;
    }
}