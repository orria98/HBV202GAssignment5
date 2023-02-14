package is.hi.hbv202g.ass5;

public class IntStackMain {
    public static void main(String[] args) {
        IntStack myStack = new IntStack();
        System.out.println(myStack.getCapacity());
        for(int i = 0; i < myStack.getCapacity(); i++){
            myStack.push(i);
        }
        System.out.println(myStack.isFull());

        myStack.pop();
    }
}
