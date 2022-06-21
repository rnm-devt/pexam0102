package main;

import java.util.*;

public class BubbleArray {
    private int[] nlist;

    public class BubbleArrayResult{
        private final double nMedian;
        private final int nMax;

        public BubbleArrayResult(double nMedian, int nMax){
            this.nMedian = nMedian;
            this.nMax = nMax;
        }

        public double getMedian(){
            return nMedian;
        }

        public int getLargestValue(){
            return nMax;
        }
    }

    public BubbleArray(int[] nlist){
        this.nlist = nlist;
    }

    public BubbleArrayResult bubbleSort(){
        int nlen = nlist.length;
        for(int i=nlen-1;i>0;i--){

            for(int j=0;j<nlen-1;j++){

                if(nlist[j] > nlist[j+1]){
                    int bigN = nlist[j];
                    //swap
                    nlist[j] = nlist[j+1];
                    nlist[j+1] = bigN;
                }

            }
            nlen--;
        }

        double nMedian;
        int nMax;

        nMax = nlist[nlist.length-1];
        if(nlist.length % 2 == 0){
            nMedian = ((double) nlist[nlist.length/2] + (double) nlist[nlist.length/2 - 1]) / 2;
        }else{
            nMedian = (double) nlist[nlist.length/2];
        }

        return new BubbleArrayResult(nMedian, nMax);
    }

}
