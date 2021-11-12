public class Main {
    public static void main(String[] args) {

        BinaryHeap bh = new BinaryHeap(17);

//        bh.printFirst();
//
//        bh.peek();

        bh.insertData(3);
        bh.insertData(5);
        bh.insertData(8);
        bh.insertData(17);
        bh.insertData(19);
        bh.insertData(36);
        bh.insertData(40);
        bh.insertData(25);
        bh.insertData(100);

        bh.traverse();

        bh.extractMin();

        bh.traverse();

        bh.deleteHeap();

        bh.traverse();

        System.out.println(bh.peek());


    }
}
