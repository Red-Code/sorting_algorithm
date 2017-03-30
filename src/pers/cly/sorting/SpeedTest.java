package pers.cly.sorting;

/**
 * Created by CLY on 2017/3/30.
 *
 * 测试在不同情况下各个算法的速度
 */
public class SpeedTest {
    public static void test(){
        Sorting sorting_util = new Sorting();
        caculate_speed_straightInsertionSort(sorting_util);
        caculate_speed_shellSort(sorting_util);
        caculate_speed_bubbleSort(sorting_util);
        caculate_speed_quickSort(sorting_util);
        caculate_speed_selectionSort(sorting_util);
        caculate_speed_heapSort(sorting_util);
        caculate_speed_mergingSort(sorting_util);
        caculate_speed_radixSort(sorting_util);
    }

    //直接插入排序
    private static void caculate_speed_straightInsertionSort(Sorting sorting_util){
        java.util.Random r=new java.util.Random();

        //一百个随机数：
        int[] array_one_hundred = new int[100];
        for (int i=0;i<100;i++){
            array_one_hundred[i] = r.nextInt(100);
        }
        //一千个随机数：
        int[] array_one_thousand = new int[1000];
        for (int i=0;i<1000;i++){
            array_one_thousand[i] = r.nextInt(1000);
        }
        //一万个随机数：
        int[] array_ten_thousand = new int[10000];
        for (int i=0;i<10000;i++){
            array_ten_thousand[i] = r.nextInt(10000);
        }
        //十万个随机数：
        int[] array_one_hundred_thousand = new int[100000];
        for (int i=0;i<100000;i++){
            array_one_hundred_thousand[i] = r.nextInt(100000);
        }
        //一千万个随机数
        int[] array_ten_million = new int[10000000];
        for (int i=0;i<10000000;i++){
            array_ten_million[i] = r.nextInt(100000);
        }

        long startTime11 = System.currentTimeMillis();//获取当前时间
        sorting_util.straightInsertionSort(array_one_hundred);
        long endTime11 = System.currentTimeMillis();
        System.out.println("直接插入排序，100个数，运行时间："+(endTime11-startTime11)+"ms");

        long startTime12 = System.currentTimeMillis();//获取当前时间
        sorting_util.straightInsertionSort(array_one_thousand);
        long endTime12 = System.currentTimeMillis();
        System.out.println("直接插入排序，1000个数，运行时间："+(endTime12-startTime12)+"ms");

        long startTime13 = System.currentTimeMillis();//获取当前时间
        sorting_util.straightInsertionSort(array_ten_thousand);
        long endTime13 = System.currentTimeMillis();
        System.out.println("直接插入排序，10000个数，运行时间："+(endTime13-startTime13)+"ms");

        long startTime14 = System.currentTimeMillis();//获取当前时间
        sorting_util.straightInsertionSort(array_one_hundred_thousand);
        long endTime14 = System.currentTimeMillis();
        System.out.println("直接插入排序，100000个数，运行时间："+(endTime14-startTime14)+"ms");

        long startTime15 = System.currentTimeMillis();//获取当前时间
        sorting_util.straightInsertionSort(array_ten_million);
        long endTime15 = System.currentTimeMillis();
        System.out.println("直接插入排序，10000000个数，运行时间："+(endTime15-startTime15)+"ms");
    }

    //希尔排序
    private static void caculate_speed_shellSort(Sorting sorting_util){
        java.util.Random r=new java.util.Random();

        //一百个随机数：
        int[] array_one_hundred = new int[100];
        for (int i=0;i<100;i++){
            array_one_hundred[i] = r.nextInt(100);
        }
        //一千个随机数：
        int[] array_one_thousand = new int[1000];
        for (int i=0;i<1000;i++){
            array_one_thousand[i] = r.nextInt(1000);
        }
        //一万个随机数：
        int[] array_ten_thousand = new int[10000];
        for (int i=0;i<10000;i++){
            array_ten_thousand[i] = r.nextInt(10000);
        }
        //十万个随机数：
        int[] array_one_hundred_thousand = new int[100000];
        for (int i=0;i<100000;i++){
            array_one_hundred_thousand[i] = r.nextInt(100000);
        }
        //一千万个随机数
        int[] array_ten_million = new int[10000000];
        for (int i=0;i<10000000;i++){
            array_ten_million[i] = r.nextInt(100000);
        }

        long startTime21 = System.currentTimeMillis();//获取当前时间
        sorting_util.shellSort(array_one_hundred,array_one_hundred.length/2);
        long endTime21 = System.currentTimeMillis();
        System.out.println("希尔排序，100个数，运行时间："+(endTime21-startTime21)+"ms");

        long startTime22 = System.currentTimeMillis();//获取当前时间
        sorting_util.shellSort(array_one_thousand,array_one_thousand.length/2);
        long endTime22 = System.currentTimeMillis();
        System.out.println("希尔排序，1000个数，运行时间："+(endTime22-startTime22)+"ms");

        long startTime23 = System.currentTimeMillis();//获取当前时间
        sorting_util.shellSort(array_ten_thousand,array_ten_thousand.length/2);
        long endTime23 = System.currentTimeMillis();
        System.out.println("希尔排序，10000个数，运行时间："+(endTime23-startTime23)+"ms");

        long startTime24 = System.currentTimeMillis();//获取当前时间
        sorting_util.shellSort(array_one_hundred_thousand,array_one_hundred_thousand.length/2);
        long endTime24 = System.currentTimeMillis();
        System.out.println("希尔排序，100000个数，运行时间："+(endTime24-startTime24)+"ms");

        long startTime25 = System.currentTimeMillis();//获取当前时间
        sorting_util.shellSort(array_ten_million,array_ten_million.length/2);
        long endTime25 = System.currentTimeMillis();
        System.out.println("希尔排序，10000000个数，运行时间："+(endTime25-startTime25)+"ms");
    }

    //冒泡排序
    private static void caculate_speed_bubbleSort(Sorting sorting_util){
        java.util.Random r=new java.util.Random();

        //一百个随机数：
        int[] array_one_hundred = new int[100];
        for (int i=0;i<100;i++){
            array_one_hundred[i] = r.nextInt(100);
        }
        //一千个随机数：
        int[] array_one_thousand = new int[1000];
        for (int i=0;i<1000;i++){
            array_one_thousand[i] = r.nextInt(1000);
        }
        //一万个随机数：
        int[] array_ten_thousand = new int[10000];
        for (int i=0;i<10000;i++){
            array_ten_thousand[i] = r.nextInt(10000);
        }
        //十万个随机数：
        int[] array_one_hundred_thousand = new int[100000];
        for (int i=0;i<100000;i++){
            array_one_hundred_thousand[i] = r.nextInt(100000);
        }
        //一千万个随机数
        int[] array_ten_million = new int[10000000];
        for (int i=0;i<10000000;i++){
            array_ten_million[i] = r.nextInt(100000);
        }

        long startTime31 = System.currentTimeMillis();//获取当前时间
        sorting_util.bubbleSort(array_one_hundred);
        long endTime31 = System.currentTimeMillis();
        System.out.println("冒泡排序，100个数，运行时间："+(endTime31-startTime31)+"ms");

        long startTime32 = System.currentTimeMillis();//获取当前时间
        sorting_util.bubbleSort(array_one_thousand);
        long endTime32 = System.currentTimeMillis();
        System.out.println("冒泡排序，1000个数，运行时间："+(endTime32-startTime32)+"ms");

        long startTime33 = System.currentTimeMillis();//获取当前时间
        sorting_util.bubbleSort(array_ten_thousand);
        long endTime33 = System.currentTimeMillis();
        System.out.println("冒泡排序，10000个数，运行时间："+(endTime33-startTime33)+"ms");

        long startTime34 = System.currentTimeMillis();//获取当前时间
        sorting_util.bubbleSort(array_one_hundred_thousand);
        long endTime34 = System.currentTimeMillis();
        System.out.println("冒泡排序，100000个数，运行时间："+(endTime34-startTime34)+"ms");

        long startTime35 = System.currentTimeMillis();//获取当前时间
        sorting_util.bubbleSort(array_ten_million);
        long endTime35 = System.currentTimeMillis();
        System.out.println("冒泡排序，10000000个数，运行时间："+(endTime35-startTime35)+"ms");
    }

    //快速排序
    private static void caculate_speed_quickSort(Sorting sorting_util){
        java.util.Random r=new java.util.Random();

        //一百个随机数：
        int[] array_one_hundred = new int[100];
        for (int i=0;i<100;i++){
            array_one_hundred[i] = r.nextInt(100);
        }
        //一千个随机数：
        int[] array_one_thousand = new int[1000];
        for (int i=0;i<1000;i++){
            array_one_thousand[i] = r.nextInt(1000);
        }
        //一万个随机数：
        int[] array_ten_thousand = new int[10000];
        for (int i=0;i<10000;i++){
            array_ten_thousand[i] = r.nextInt(10000);
        }
        //十万个随机数：
        int[] array_one_hundred_thousand = new int[100000];
        for (int i=0;i<100000;i++){
            array_one_hundred_thousand[i] = r.nextInt(100000);
        }
        //一千万个随机数
        int[] array_ten_million = new int[10000000];
        for (int i=0;i<10000000;i++){
            array_ten_million[i] = r.nextInt(100000);
        }

        long startTime41 = System.currentTimeMillis();//获取当前时间
        sorting_util.quickSort(array_one_hundred,0,array_one_hundred.length-1);
        long endTime41 = System.currentTimeMillis();
        System.out.println("快速排序，100个数，运行时间："+(endTime41-startTime41)+"ms");

        long startTime42 = System.currentTimeMillis();//获取当前时间
        sorting_util.quickSort(array_one_thousand,0,array_one_thousand.length-1);
        long endTime42 = System.currentTimeMillis();
        System.out.println("快速排序，1000个数，运行时间："+(endTime42-startTime42)+"ms");

        long startTime43 = System.currentTimeMillis();//获取当前时间
        sorting_util.quickSort(array_ten_thousand,0,array_ten_thousand.length-1);
        long endTime43 = System.currentTimeMillis();
        System.out.println("快速排序，10000个数，运行时间："+(endTime43-startTime43)+"ms");

        long startTime44 = System.currentTimeMillis();//获取当前时间
        sorting_util.quickSort(array_one_hundred_thousand,0,array_one_hundred_thousand.length-1);
        long endTime44 = System.currentTimeMillis();
        System.out.println("快速排序，100000个数，运行时间："+(endTime44-startTime44)+"ms");

        long startTime45 = System.currentTimeMillis();//获取当前时间
        sorting_util.quickSort(array_ten_million,0,array_ten_million.length-1);
        long endTime45 = System.currentTimeMillis();
        System.out.println("快速排序，10000000个数，运行时间："+(endTime45-startTime45)+"ms");
    }

    //直接选择排序
    private static void caculate_speed_selectionSort(Sorting sorting_util){
        java.util.Random r=new java.util.Random();

        //一百个随机数：
        int[] array_one_hundred = new int[100];
        for (int i=0;i<100;i++){
            array_one_hundred[i] = r.nextInt(100);
        }
        //一千个随机数：
        int[] array_one_thousand = new int[1000];
        for (int i=0;i<1000;i++){
            array_one_thousand[i] = r.nextInt(1000);
        }
        //一万个随机数：
        int[] array_ten_thousand = new int[10000];
        for (int i=0;i<10000;i++){
            array_ten_thousand[i] = r.nextInt(10000);
        }
        //十万个随机数：
        int[] array_one_hundred_thousand = new int[100000];
        for (int i=0;i<100000;i++){
            array_one_hundred_thousand[i] = r.nextInt(100000);
        }
        //一千万个随机数
        int[] array_ten_million = new int[10000000];
        for (int i=0;i<10000000;i++){
            array_ten_million[i] = r.nextInt(100000);
        }

        long startTime51 = System.currentTimeMillis();//获取当前时间
        sorting_util.selectionSort(array_one_hundred);
        long endTime51 = System.currentTimeMillis();
        System.out.println("直接选择排序，100个数，运行时间："+(endTime51-startTime51)+"ms");

        long startTime52 = System.currentTimeMillis();//获取当前时间
        sorting_util.selectionSort(array_one_thousand);
        long endTime52 = System.currentTimeMillis();
        System.out.println("直接选择排序，1000个数，运行时间："+(endTime52-startTime52)+"ms");

        long startTime53 = System.currentTimeMillis();//获取当前时间
        sorting_util.selectionSort(array_ten_thousand);
        long endTime53 = System.currentTimeMillis();
        System.out.println("直接选择排序，10000个数，运行时间："+(endTime53-startTime53)+"ms");

        long startTime54 = System.currentTimeMillis();//获取当前时间
        sorting_util.selectionSort(array_one_hundred_thousand);
        long endTime54 = System.currentTimeMillis();
        System.out.println("直接选择排序，100000个数，运行时间："+(endTime54-startTime54)+"ms");

        long startTime55 = System.currentTimeMillis();//获取当前时间
        sorting_util.selectionSort(array_ten_million);
        long endTime55 = System.currentTimeMillis();
        System.out.println("直接选择排序，10000000个数，运行时间："+(endTime55-startTime55)+"ms");
    }

    //堆排序
    private static void caculate_speed_heapSort(Sorting sorting_util){
        java.util.Random r=new java.util.Random();

        //一百个随机数：
        int[] array_one_hundred = new int[100];
        for (int i=0;i<100;i++){
            array_one_hundred[i] = r.nextInt(100);
        }
        //一千个随机数：
        int[] array_one_thousand = new int[1000];
        for (int i=0;i<1000;i++){
            array_one_thousand[i] = r.nextInt(1000);
        }
        //一万个随机数：
        int[] array_ten_thousand = new int[10000];
        for (int i=0;i<10000;i++){
            array_ten_thousand[i] = r.nextInt(10000);
        }
        //十万个随机数：
        int[] array_one_hundred_thousand = new int[100000];
        for (int i=0;i<100000;i++){
            array_one_hundred_thousand[i] = r.nextInt(100000);
        }
        //一千万个随机数
        int[] array_ten_million = new int[10000000];
        for (int i=0;i<10000000;i++){
            array_ten_million[i] = r.nextInt(100000);
        }

        long startTime61 = System.currentTimeMillis();//获取当前时间
        sorting_util.heapSort(array_one_hundred);
        long endTime61 = System.currentTimeMillis();
        System.out.println("堆排序，100个数，运行时间："+(endTime61-startTime61)+"ms");

        long startTime62 = System.currentTimeMillis();//获取当前时间
        sorting_util.heapSort(array_one_thousand);
        long endTime62 = System.currentTimeMillis();
        System.out.println("堆排序，1000个数，运行时间："+(endTime62-startTime62)+"ms");

        long startTime63 = System.currentTimeMillis();//获取当前时间
        sorting_util.heapSort(array_ten_thousand);
        long endTime63 = System.currentTimeMillis();
        System.out.println("堆排序，10000个数，运行时间："+(endTime63-startTime63)+"ms");

        long startTime64 = System.currentTimeMillis();//获取当前时间
        sorting_util.heapSort(array_one_hundred_thousand);
        long endTime64 = System.currentTimeMillis();
        System.out.println("堆排序，100000个数，运行时间："+(endTime64-startTime64)+"ms");

        long startTime65 = System.currentTimeMillis();//获取当前时间
        sorting_util.heapSort(array_ten_million);
        long endTime65 = System.currentTimeMillis();
        System.out.println("堆排序，10000000个数，运行时间："+(endTime65-startTime65)+"ms");
    }

    //归并排序
    private static void caculate_speed_mergingSort(Sorting sorting_util){
        java.util.Random r=new java.util.Random();

        //一百个随机数：
        int[] array_one_hundred = new int[100];
        for (int i=0;i<100;i++){
            array_one_hundred[i] = r.nextInt(100);
        }
        //一千个随机数：
        int[] array_one_thousand = new int[1000];
        for (int i=0;i<1000;i++){
            array_one_thousand[i] = r.nextInt(1000);
        }
        //一万个随机数：
        int[] array_ten_thousand = new int[10000];
        for (int i=0;i<10000;i++){
            array_ten_thousand[i] = r.nextInt(10000);
        }
        //十万个随机数：
        int[] array_one_hundred_thousand = new int[100000];
        for (int i=0;i<100000;i++){
            array_one_hundred_thousand[i] = r.nextInt(100000);
        }
        //一千万个随机数
        int[] array_ten_million = new int[10000000];
        for (int i=0;i<10000000;i++){
            array_ten_million[i] = r.nextInt(100000);
        }

        long startTime71 = System.currentTimeMillis();//获取当前时间
        sorting_util.mergingSort(array_one_hundred, 0, array_one_hundred.length-1);
        long endTime71 = System.currentTimeMillis();
        System.out.println("归并排序，100个数，运行时间："+(endTime71-startTime71)+"ms");

        long startTime72 = System.currentTimeMillis();//获取当前时间
        sorting_util.mergingSort(array_one_thousand, 0, array_one_thousand.length-1);
        long endTime72 = System.currentTimeMillis();
        System.out.println("归并排序，1000个数，运行时间："+(endTime72-startTime72)+"ms");

        long startTime73 = System.currentTimeMillis();//获取当前时间
        sorting_util.mergingSort(array_ten_thousand, 0, array_ten_thousand.length-1);
        long endTime73 = System.currentTimeMillis();
        System.out.println("归并排序，10000个数，运行时间："+(endTime73-startTime73)+"ms");

        long startTime74 = System.currentTimeMillis();//获取当前时间
        sorting_util.mergingSort(array_one_hundred_thousand, 0, array_one_hundred_thousand.length-1);
        long endTime74 = System.currentTimeMillis();
        System.out.println("归并排序，100000个数，运行时间："+(endTime74-startTime74)+"ms");

        long startTime75 = System.currentTimeMillis();//获取当前时间
        sorting_util.mergingSort(array_ten_million, 0, array_ten_million.length-1);
        long endTime75 = System.currentTimeMillis();
        System.out.println("归并排序，10000000个数，运行时间："+(endTime75-startTime75)+"ms");
    }

    //基数排序
    private static void caculate_speed_radixSort(Sorting sorting_util){
        java.util.Random r=new java.util.Random();

        //一百个随机数：
        int[] array_one_hundred = new int[100];
        for (int i=0;i<100;i++){
            array_one_hundred[i] = r.nextInt(100);
        }
        //一千个随机数：
        int[] array_one_thousand = new int[1000];
        for (int i=0;i<1000;i++){
            array_one_thousand[i] = r.nextInt(1000);
        }
        //一万个随机数：
        int[] array_ten_thousand = new int[10000];
        for (int i=0;i<10000;i++){
            array_ten_thousand[i] = r.nextInt(10000);
        }
        //十万个随机数：
        int[] array_one_hundred_thousand = new int[100000];
        for (int i=0;i<100000;i++){
            array_one_hundred_thousand[i] = r.nextInt(100000);
        }

        //一千万个随机数
        int[] array_ten_million = new int[10000000];
        for (int i=0;i<10000000;i++){
            array_ten_million[i] = r.nextInt(100000);
        }

        long startTime81 = System.currentTimeMillis();//获取当前时间
        sorting_util.radixSort(array_one_hundred,3);
        long endTime81 = System.currentTimeMillis();
        System.out.println("基数排序，100个数，运行时间："+(endTime81-startTime81)+"ms");

        long startTime82 = System.currentTimeMillis();//获取当前时间
        sorting_util.radixSort(array_one_thousand,4);
        long endTime82 = System.currentTimeMillis();
        System.out.println("基数排序，1000个数，运行时间："+(endTime82-startTime82)+"ms");

        long startTime83 = System.currentTimeMillis();//获取当前时间
        sorting_util.radixSort(array_ten_thousand,5);
        long endTime83 = System.currentTimeMillis();
        System.out.println("基数排序，10000个数，运行时间："+(endTime83-startTime83)+"ms");

        long startTime84 = System.currentTimeMillis();//获取当前时间
        sorting_util.radixSort(array_one_hundred_thousand,6);
        long endTime84 = System.currentTimeMillis();
        System.out.println("基数排序，100000个数，运行时间："+(endTime84-startTime84)+"ms");

        long startTime85 = System.currentTimeMillis();//获取当前时间
        sorting_util.radixSort(array_ten_million,8);
        long endTime85 = System.currentTimeMillis();
        System.out.println("基数排序，10000000个数，运行时间："+(endTime85-startTime85)+"ms");
    }
}
