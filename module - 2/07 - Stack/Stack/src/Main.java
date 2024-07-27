import usr.collections.StackADT;

public class Main {
    public static void main(String[] args) {
        StackADT<Integer> stack = new StackADT<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.display();
        stack.pop();
        stack.display();
        stack.reverse();
        stack.sort();
        stack.display();
        System.out.println(stack.contains(4));
        System.out.println("Stack top: " + stack.getTop());

        StackADT<String> stack2 = new StackADT<>();
        stack2.push("Hello");
        stack2.push("World");
        stack2.push("Shabari");
        stack2.push("Subasri");
        stack2.display();
        stack2.reverse();
        stack2.display();
        stack2.sort();
        stack2.display();
        System.out.println("Stack top: " + stack2.getTop());
        System.out.println(stack2.search("Shabari"));
        System.out.println(stack2.contains("suba"));
    }
}