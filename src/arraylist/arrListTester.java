package arraylist;

public class arrListTester {
    public static void main(String[] args){
        GenArraylist arraylist = new GenArraylist(5);
        arraylist.add(100);
        arraylist.add(200);
        arraylist.add(300);
        arraylist.add(400);
        arraylist.add(500);
        arraylist.add(600);
        arraylist.add("hello");
        arraylist.add(70000);
        arraylist.add(8000);
        System.out.println("Size is: " + arraylist.getSize());
        System.out.println("Count is: " + arraylist.getCount());
        arraylist.printArr();

    }
}
