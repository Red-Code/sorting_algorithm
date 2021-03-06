package pers.cly.sorting;

/**
 * 运行测试各种排序方法
 */
public class Main {
    public static void main(String[] args) {
        Sorting sorting_util = new Sorting();

        //直接插入排序
        int[] param_straightInsertionSort= {6,2,8,5,324,23423,56,2,87,3,42,436};
        sorting_util.straightInsertionSort(param_straightInsertionSort);
        printResult("插入排序-直接插入排序：",param_straightInsertionSort);

        //希尔排序
        int[] param_shellSort= {6,2,8,5,324,23423,56,2,87,3,42,436};
        int incrementNum = param_shellSort.length/2;//增量
        sorting_util.shellSort(param_shellSort,incrementNum);
        printResult("插入排序-希尔排序：",param_shellSort);

        //冒泡排序
        int[] param_bubbleSort= {6,2,8,5,324,23423,56,2,87,3,42,436};
        sorting_util.bubbleSort(param_bubbleSort);
        printResult("交换排序-冒泡排序：",param_bubbleSort);

        //快速排序
        int[] param_quickSort= {6,2,8,5,324,23423,56,2,87,3,42,436};
        sorting_util.quickSort(param_quickSort,0,param_quickSort.length-1);
        printResult("交换排序-快速排序：",param_quickSort);

        //直接选择排序
        int[] param_selectionSort= {6,2,8,5,324,23423,56,2,87,3,42,436};
        sorting_util.selectionSort(param_selectionSort);
        printResult("选择排序-直接选择排序：",param_selectionSort);

        //堆排序
        int[] param_heapSort= {6,2,8,5,324,23423,56,2,87,3,42,436};
        sorting_util.heapSort(param_heapSort);
        printResult("选择排序-堆排序：",param_heapSort);

        //归并排序
        int[] param_mergingSort= {6,2,8,5,324,23423,56,2,87,3,42,436};
        sorting_util.mergingSort(param_mergingSort, 0, param_mergingSort.length-1);
        printResult("归并排序：",param_mergingSort);

        //基数排序
        int[] param_radixSort= {6,2,8,5,324,23423,56,2,87,3,42,436};
        sorting_util.radixSort(param_radixSort,5);
        printResult("基数排序：",param_radixSort);

        //测试在不同情况下各个算法的速度
        SpeedTest.test();
        /**
         * 测试结果：
         （1）
         随机数范围：0-100
         随机数数量：100
         结果：
         8种算法速度均在0ms左右，没有显著差别。

         （2）
         随机数范围：0-1000
         随机数数量：1000
         结果：
         希尔排序、快速排序、堆排序、基数排序：0ms左右
         直接插入排序、冒泡排序、直接选择排序、归并排序：1ms-10ms

         （3）
         随机数范围：0-10000
         随机数数量：10000
         结果：
         希尔排序、快速排序、堆排序、基数排序：0ms-10ms
         直接插入排序：10ms-20ms
         直接选择排序、归并排序：50ms左右
         冒泡排序：150ms左右

         （4）
         随机数范围：0-100000
         随机数数量：100000
         结果：
         希尔排序、快速排序、堆排序、基数排序：10ms-20ms
         直接插入排序：1100ms左右
         归并排序：2000ms左右
         直接选择排序：5000ms左右
         冒泡排序：14500ms左右

         （5）
         随机数范围：0-10000000
         随机数数量：10000000
         结果：
         基数排序：690ms左右
         快速排序：1300ms左右
         希尔排序：2600ms左右
         堆排序：2900ms左右
         直接插入排序、冒泡排序、直接选择排序、归并排序：速度过慢。
         */
    }

    /**
     * 将排序结果展示出来
     * @param sort_type 用来描述排序方法
     * @param array_result 排序结果数组
     */
    private static void printResult(String sort_type,int[] array_result){
        System.out.print(sort_type);
        for (int i:array_result){
            System.out.print(i+",");
        }
        System.out.println();
    }
}
