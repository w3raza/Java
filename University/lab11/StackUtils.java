public class StackUtils{

    public static <T> String toString(Stack<T> stack){
        return stack.toString();
    }

    public static <T> boolean compare(Stack<T> stack1, Stack<T> stack2){
        if(stack1.equals(stack2))
            return true;
        else
            return false;
    }

    public static <T> void swap(Stack<T> stack, int index1, int index2){
        T tmp, temp;
        tmp = stack.getElement(index1);
        temp = stack.getElement(index2);
        stack.setElement(index2, tmp);
        stack.setElement(index1, temp);
    }
}