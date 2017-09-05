
public class Main {
    private double[] myArr = new double[100];
    private double[] myArr2 = new double[100];
    private int counter = 100;


    public double[] getMyArr() {
        for (int i = 0; i < getCounter(); i++) {
            int myRandom = (int) (Math.random() * 100);
            myArr[myRandom]++;
        }
        return myArr;
    }
    public double[] getMyArr2() {
        for (int i = 0; i < myArr2.length; i++) {
            myArr2[i] = myArr[i];
        }
        return myArr2;
    }
    public int getCounter() {
        return counter;
    }


    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
        myFrame.showFrame();
        BarChart01 barChart01 = new BarChart01();

        barChart01.showChart();
    }

}
