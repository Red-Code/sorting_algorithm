import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

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
        sorting_util.quickSort(param_bubbleSort);
        printResult("冒泡排序：",param_bubbleSort);

        HashMap<String,String> hashMap = new HashMap();
        Set<Map.Entry<String, String>> demo = hashMap.entrySet();
        for (Map.Entry<String, String> dd:demo){
            dd.getKey();
        }

        Set<Object> set = Collections.synchronizedSet(new HashSet<>());
    }

    public static void printResult(String sort_type,int[] array_result){
        System.out.print(sort_type);
        for (int i:array_result){
            System.out.print(i+",");
        }
        System.out.println();
    }
}
