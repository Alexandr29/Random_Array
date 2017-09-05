
public class Main {

    public static void main(String[] args) {

        MyFrame myFrame = new MyFrame();

        int[] myArr = new int[100];
        int counter = 100;

        for (int i = 0; i < counter; i++) {
            int myRandom = (int)(Math.random()*100);
            myArr[myRandom]++;
        }

        for (int i = 0; i < myArr.length; i++) {
            System.out.print((i+1)+"-ая ячейка "+myArr[i] + "; ");
        }
        System.out.println();
    }


}
