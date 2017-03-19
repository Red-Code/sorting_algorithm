/**
 * Created by CLY on 2017/3/17.
 */
public class Sorting {
    //直接插入排序：每次将一个待排序的元素与已排序的元素进行逐一比较，直到找到合适的位置按大小插入。
    public void straightInsertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {//取arr[0]作为初始的顺序序列，从arr[1]开始和顺序序列进行比较。
            if(array[i] < array[i-1]){//每次先与当前顺序序列的最大的数比，如果比他小则表示需要插入。如果比当前顺序序列里的最大数还要大，则不必插入，直接进行下一次循环。
                int temp = array[i];//先将待插数存入temp
                int j;
                for(j = i-1; j >= 0 && array[j] > temp; j --){//待插数据的前一个数其实就是当前顺序序列的最大数，所以先和前一个数比，如果比最大数小，则最大数后移一位，然后继续比。
                    array[j+1] = array[j];//把比temp大或相等的元素全部往后移动一个位置
                }
                array[j+1] = temp;//把待排序的元素temp插入腾出位置的(j+1)
            }
        }
    }

    //希尔排序：把整个序列分成若干个子序列，分别进行直接插入排序。这算是“一趟希尔排序”
    public void shellSort(int[] array,int incrementNum){
        for (int increment = incrementNum; increment > 0; increment /= 2) {//从初始增量开始循环，每次增量减少一倍
            //下面就是一个修改过的直接插入排序
            for (int i = increment; i < array.length; i++) {//取arr[0]作为初始的顺序序列，从arr[1]开始和顺序序列进行比较。
                if(array[i] < array[i-increment]){//每次先与当前顺序序列的最大的数比，如果比他小则表示需要插入。如果比当前顺序序列里的最大数还要大，则不必插入，直接进行下一次循环。
                    int temp = array[i];//先将待插数存入temp
                    int j;
                    for(j = i-increment; j >= 0 && array[j] > temp; j -=increment){//待插数据的前一个数其实就是当前顺序序列的最大数，所以先和前一个数比，如果比最大数小，则最大数后移一位，然后继续比。
                        array[j+increment] = array[j];//把比temp大或相等的元素全部往后移动一个位置
                    }
                    array[j+increment] = temp;//把待排序的元素temp插入腾出位置的(j+1)
                }
            }
        }
    }

    //冒泡排序：第一趟，第一个和第二个比，第二个再和第三个比···，第一趟完后，最大的数会被排到最后。第二趟依旧这样做。
    public void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {//最多做n-1趟排序
            for (int j = 0; j < array.length - i - 1; j++) {//对当前无序区间score[0......length-i-1]进行排序(j的范围很关键，这个范围是在逐步缩小的)
                if (array[j] > array[j + 1]) {    //把大的值交换到后面
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 快速排序：
     * 选第一个数作为“枢轴”，
     * 将枢轴与序列另一端的数比较，如果枢轴大于它，就换位，小于就再和另一端的倒数第二个数比较···，
     * 第一次换位完了后依旧和另一边的比，但判断标准得颠倒，变成“如果枢轴小于它，就换位”
     * 一轮比完了，枢轴就到了中间，左边比它小，右边比它大。
     * 之后枢轴两边的序列继续进行快排。
     */
    public void quickSort(int[] array){

    }
}
