package Trien_khai_stack_SD_lop_LinkedList;

public class GenericStackClient {
    public GenericStackClient(){}

    public static void stackOfString(){
        MyGenericStack<String> stack =new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " +stack.size());
        System.out.println("1.2 Pop element from stack: " );
        while (!stack.isEmpty()){
            System.out.println("\n"+stack.pop());
        }
        System.out.println("\n 1.3 Size of stack after pop operations : "+stack.size());
    }


    public static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 Size of stack after push operations: " +stack.size());
        System.out.println("2.2 Pop element from stack: " );
        while (!stack.isEmpty()){
            System.out.println("\n"+stack.pop());
        }
        System.out.println("\n 3.3 Size of stack after pop operations : "+stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfString();
    }
}
