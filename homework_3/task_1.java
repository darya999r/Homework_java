// 1. Реализовать алгоритм сортировки слиянием.

package homework_3;

import java.util.ArrayList;

public class task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(45);
        array.add(18);
        array.add(3);
        array.add(83);
        array.add(12);
        array.add(5);
        array.add(27);
        array.add(38);

        System.out.println(array);
        System.out.println(sort(array));
    }

    static ArrayList<Integer> sort(ArrayList<Integer> arr) {
        if(arr.size()<2) return arr;

        ArrayList<Integer> arrL = sort(new ArrayList<>(arr.subList(0, arr.size()/2)));
        ArrayList<Integer> arrR = sort(new ArrayList<>(arr.subList(arr.size()/2, arr.size())));
        return merge(arrL, arrR, arr);
    }

    static ArrayList<Integer> merge(ArrayList<Integer> arrL, ArrayList<Integer> arrR, ArrayList<Integer> arrRes){
        int indexLeft =0 ;
        int indexRight = 0;
        while ((indexLeft < arrL.size()) && (indexRight < arrR.size())) {
            if(arrL.get(indexLeft) <= arrR.get(indexRight)) {
                arrRes.set(indexLeft+indexRight, arrL.get(indexLeft));
                indexLeft++;
            } else {
                arrRes.set(indexLeft+indexRight, arrR.get(indexRight));
                indexRight++;
            }
        }

        for (int i = indexLeft; i < arrL.size(); i++) {
            arrRes.set(i+indexRight, arrL.get(i));
        }

        for (int i = indexRight; i < arrR.size(); i++) {
            arrRes.set(indexLeft+i, arrR.get(i));
        }

        return arrRes;
    }
}
