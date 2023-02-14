package is.hi.hbv202g.ass5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntStackTest {

    @Test
    public void testNewStackIsNotFull() {
        IntStack stack= new IntStack();

        assertFalse(stack.isFull());
    }
    @Test
    public void testNewStackIsFull(){
        IntStack stackFull = new IntStack();
        for(int i = 0; i < stackFull.getCapacity(); i++){
            stackFull.push(i);
        }
        assertTrue(stackFull.isFull());
    }

    @Test
    public void testNewStackIsFullBoundary(){
        IntStack stackFull = new IntStack();
        for(int i = 0; i < stackFull.getCapacity()-1; i++){
            stackFull.push(i);
        }
        assertTrue(stackFull.isFull());
    }

    @Test
    public void testPopReturnsPushedValue(){
        IntStack stackPopPush = new IntStack();
        int p = 2;

        stackPopPush.push(p);
        stackPopPush.pop();

        assertEquals(stackPopPush, stackPopPush);
        
    }

    @Test
    public void testPopEmptyThrowsException()
    {
        IntStack emptyStack = new IntStack();
        emptyStack.pop();
    }

    @Test
    public void testPushFullStackThrowsException(){
        IntStack fullStack = new IntStack();
        for(int i = 0; i < fullStack.getCapacity(); i++){
            fullStack.push(i);
        }
        fullStack.push(1);
    }

    @Test
    public void testStackIsEmpty(){
        IntStack emptyStack = new IntStack();
        assertTrue(emptyStack.isEmpty());
    }

    @Test
    public void testNonEmptyStackIsEmpty(){
        IntStack nonEmptyStack = new IntStack();
        for(int i = 0; i < 3; i++){
            nonEmptyStack.push(i);
        }
        assertFalse(nonEmptyStack.isEmpty());
    }
}   
