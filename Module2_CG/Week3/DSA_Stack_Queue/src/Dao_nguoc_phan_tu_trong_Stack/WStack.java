package Dao_nguoc_phan_tu_trong_Stack;

import java.util.LinkedList;

public class WStack {
    public static void main(String[] args) {
        LinkedList<String> wStack = new LinkedList();
        wStack.push("ten");
        wStack.push("nine");
        wStack.push("eight");
        wStack.push("seven");
        wStack.push("six");
        wStack.push("fiv");
        wStack.push("four");
        wStack.push("three");
        wStack.push("two");
        wStack.push("one");


        LinkedList<String> newStack =new LinkedList();
        LinkedList<String> newStack2 =new LinkedList();

        int a = wStack.size();

        for (int i = 0; i < a; i++) {
            newStack.push(wStack.pop());
        }

        for (int i = 0; i < a; i++) {
            newStack2.push(newStack.pop());
        }

        for (int i = 0; i < a; i++) {
            wStack.push(newStack2.pop());
        }

        System.out.println("1.2 Pop element from stack: " );
        while (!wStack.isEmpty()){
            System.out.println("\n"+wStack.pop());
        }
    }
}
