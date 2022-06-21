package main;

public class Mainc {
    public static void main(String[] args)
    {
        Mainc mc = new Mainc();
        BubbleArray ba = new BubbleArray(new int[]{25, 20, 30, 40, 100, 75, 12, 1, 3, 9});

        BubbleArray.BubbleArrayResult bar =  ba.bubbleSort();

        System.out.println(Double.toString(bar.getMedian()));
        System.out.println(Integer.toString(bar.getLargestValue()));
    }

}
