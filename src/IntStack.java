import java.util.EmptyStackException;

public class IntStack {

    public class MyStack {

        private int[] stackArr;
        private int stackSize;
        private int stackPointer = 0;

        public MyStack(int stackSize) {
            this.stackSize = stackSize;
            this.stackArr = new int[this.stackSize];
        }

        public void showStatus(String workMsg) {

            System.out.print(workMsg + " 후 스택 상태: [ ");
            for (int stackValue : this.stackArr) {
                System.out.print(stackValue + " ");
            }
            System.out.println("]");

        }

        public void push(int value) {
            // 가장 위에 데이터 추가

            if (this.stackArr.length <= stackPointer){
                throw new ArrayIndexOutOfBoundsException();
            }

            this.stackArr[this.stackPointer++] = value;
            showStatus("push");
        }

        public int peek() {
            // 가장 위의 항목을 반환

            if (this.stackPointer == 0){
                throw new EmptyStackException();
            }

            int peekValue = this.stackArr[this.stackPointer - 1];
            showStatus("peek");
            return peekValue;
        }

        public void pop() {
            // 가장 위의 항목을 제거

            if (this.stackPointer == 0){
                throw new EmptyStackException();
            }

            this.stackArr[this.stackPointer-- - 1] = 0;
            showStatus("pop");
        }


    }

    public static void main(String[] args) {
        IntStack intStack = new IntStack();
        int stackSize = 10;
        MyStack myStack = intStack.new MyStack(stackSize);

        myStack.push(19);
        myStack.push(40);
        myStack.push(165);
        myStack.push(23);
        myStack.push(85);
        myStack.push(49);

        myStack.peek();

        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();

        //myStack.pop();

        //myStack.peek();


    }
}