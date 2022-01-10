public class Main{
    public static void main(String[] args){

        Stack<Integer> integerStack = new Stack<Integer>(3, Integer[].class );
        Stack<Integer> integerStack2 = new Stack<Integer>(3, Integer[].class );
        Stack<String> stringStack = new Stack<String>(3, String[].class );
        
        try{

            //INTEGER
            integerStack.push(10);
            integerStack.push(0);
            integerStack.push(1);
            //integerStack.push(4);
            System.out.println(StackUtils.toString(integerStack));
            integerStack.pop();
            System.out.println(StackUtils.toString(integerStack));
            integerStack.pop();
            integerStack.pop();
            //integerStack.pop();
            System.out.println(StackUtils.toString(integerStack));

            //STRING
            stringStack.push("Me");
            System.out.println(StackUtils.toString(stringStack));
            stringStack.pop();
            System.out.println(StackUtils.toString(stringStack));

            //COMPARE
            System.out.println(StackUtils.compare(integerStack, integerStack)); //true
            System.out.println(StackUtils.compare(integerStack, integerStack2)); //true
            integerStack.push(10);
            System.out.println(StackUtils.compare(integerStack, integerStack2)); //false

            //SWAP
            stringStack.push("Me");
            stringStack.push("You");
            System.out.println(StackUtils.toString(stringStack));
            StackUtils.swap(stringStack,0,1);
            System.out.println(StackUtils.toString(stringStack));

        }catch(StackOverflowException e){
            System.out.println(e);
        }catch(StackUnderflowException e){
            System.out.println(e);
        }
    }
}