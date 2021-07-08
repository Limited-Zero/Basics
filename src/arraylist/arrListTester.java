package arraylist;

public class arrListTester {
    public static void main(String[] args){
        GenArraylist arraylist = new GenArraylist(8);
        arraylist.add(100);
        arraylist.add(200);
        arraylist.add(300);
        arraylist.add(400);
        arraylist.add(500);
        arraylist.add((Integer)600);
        arraylist.add("hello");
        arraylist.printArr();
        System.out.println("");
        arraylist.remove(2);
        arraylist.remove(4);
        arraylist.printArr();
        /**System.out.println(arraylist.searchFor("hello"));
         * System.out.println(arraylist.searchFor(600));
         */
    }
}
