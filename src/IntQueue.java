public class IntQueue {

    public class MyQueue {

        // 링 버퍼 큐

        private int[] queueArr;
        private int capacity;
        private int front = 0;
        private int rear = 0;
        private int queueCount = 0;

        public MyQueue(int capacity) {
            this.capacity = capacity;
            this.queueArr = new int[this.capacity];
        }

        public void showStatus(String workMsg) {

            System.out.print(workMsg + " 후 큐 상태: [ ");
            for (int stackValue : this.queueArr) {
                System.out.print(stackValue + " ");
            }
            System.out.println("]");

        }

        public void enQueue(int value){

            // enQueue는 rear만 본다

            if (queueCount == capacity){
                throw new ArrayIndexOutOfBoundsException();
            }

            queueArr[rear++] = value;

            if (rear == capacity){
                rear = 0;
            }

            queueCount++;

            showStatus("enqueue");
        }
        
        public int deQueue(){

            // deQueue는 front만 본다

            if (queueCount == 0 ){
                throw new ArrayIndexOutOfBoundsException();
            }
            int result = queueArr[front];

            queueArr[front++] = 0;

            if (front == capacity){
                front = 0;
            }

            queueCount--;

            showStatus("dequeue");

            return result;

        }
        
        
        
    }

    public static void main(String[] args) {
        
        IntQueue intQueue = new IntQueue();
        MyQueue myQueue = intQueue.new MyQueue(5);
        
        myQueue.enQueue(89);
        myQueue.enQueue(25);
        myQueue.enQueue(37);
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();

    }
}