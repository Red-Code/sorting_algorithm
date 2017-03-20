import java.util.*;

public class Main {
    public static void main(String[] args) {
        Sorting sorting_util = new Sorting();

        //直接插入排序
        int[] param_straightInsertionSort= {6,2,8,5,324,23423,56,2,87,3,42,436};
        sorting_util.straightInsertionSort(param_straightInsertionSort);
        printResult("直接插入排序：",param_straightInsertionSort);

        //希尔排序
        int[] param_shellSort= {6,2,8,5,324,23423,56,2,87,3,42,436};
        int incrementNum = param_shellSort.length/2;//增量
        sorting_util.shellSort(param_shellSort,incrementNum);
        printResult("希尔排序：",param_shellSort);

        //冒泡排序
        int[] param_bubbleSort= {6,2,8,5,324,23423,56,2,87,3,42,436};
        sorting_util.bubbleSort(param_bubbleSort);
        printResult("冒泡排序：",param_bubbleSort);

        //快速排序
        int[] param_quickSort= {6,2,8,5,324,23423,56,2,87,3,42,436};
        sorting_util.quickSort(param_quickSort,0,param_quickSort.length-1);
        printResult("快速排序：",param_quickSort);

        //直接选择排序
        int[] param_selectionSort= {6,2,8,5,324,23423,56,2,87,3,42,436};
        sorting_util.selectionSort(param_selectionSort);
        printResult("直接选择排序：",param_selectionSort);
    }

    /**
     * 将排序结果展示出来
     * @param sort_type 用来描述排序方法
     * @param array_result 排序结果数组
     */
    public static void printResult(String sort_type,int[] array_result){
        System.out.print(sort_type);
        for (int i:array_result){
            System.out.print(i+",");
        }
        System.out.println();
    }
}
