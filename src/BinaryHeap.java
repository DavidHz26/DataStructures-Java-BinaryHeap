public class BinaryHeap {

    private int[] array = null;
    private int sizeOfHeap;

    public BinaryHeap(int size) {
        System.out.println("Initialized");
        array = new int[size + 1];
        sizeOfHeap = 0;
    }

    public int peek() {
        if(array == null) {
            return -1;
        }

        return 1;
    }

    public int getSizeOfHeap() {
        System.out.println(sizeOfHeap);
        return sizeOfHeap;
    }

    public void insertData(int data) {
        sizeOfHeap = insert(sizeOfHeap, data);
    }

    private int insert(int sizeOfHeap, int data) {
        if(array == null) {
            return -1;
        }

        array[sizeOfHeap + 1] = data;
        sizeOfHeap++;

        heapifyBottomToTop(sizeOfHeap);

        return sizeOfHeap;
    }
    
    private void heapifyBottomToTop(int sizeOfHeap) {

        if(sizeOfHeap == 1) {
            return;
        }

        if(array[sizeOfHeap] < array[sizeOfHeap / 2]) {
            int temp = array[sizeOfHeap];
            array[sizeOfHeap] = array[sizeOfHeap / 2];
            array[sizeOfHeap / 2] = temp;

            heapifyBottomToTop(sizeOfHeap / 2);
        }
    }

    public void extractMin(){

        if(array == null) {
            return;
        }

        System.out.println(array[peek()] + " extracted");

        array[peek()] = array[sizeOfHeap];
        array[sizeOfHeap] = 0;
        sizeOfHeap--;

        heapifyTopToBottom(peek());

    }

    public void heapifyTopToBottom(int root) {

        if(root == sizeOfHeap) {
            return;
        }

        if(array[2 * root] != 0 && array[2 * root + 1] != 0) {

            if(array[2 * root] < array[2 * root + 1]) {
                int temp = array[root];
                array[root] = array[2 * root];
                array[2 * root] = temp;

                heapifyTopToBottom(2 * root);
            } else if(array[2 * root + 1] < array[2 * root]) {
                int temp = array[root];
                array[root] = array[2 * root];
                array[2 * root] = temp;

                heapifyTopToBottom(2 * root + 1);
            }

            return;
        }

        if(array[2 * root] != 0) {
            int temp = array[root];
            array[root] = array[2 * root];
            array[2 * root] = temp;

            heapifyTopToBottom(2 * root);

        }

        else if(array[2 * root + 1] != 0) {
            int temp = array[root];
            array[root] = array[2 * root + 1];
            array[2 * root + 1] = temp;

            heapifyTopToBottom(2 * root + 1);
        }

    }

    public void traverse() {
        if(array == null) {
            return;
        }

       for(int i : array) {
           System.out.print("[" + i + "] ");
       }

        System.out.println();
    }

    public void deleteHeap() {
        array = null;
        System.out.println("Heap deleted");
    }


}
