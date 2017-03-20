/**
 * Created by CLY on 2017/3/17.
 */
public class Sorting {
    /**
     * 名称：插入排序-直接插入排序
     * 描述：每次将一个待排序的元素与已排序的元素进行逐一比较，直到找到合适的位置按大小插入。
     * 时间复杂度：平均O(n^2)，最坏O(n^2)
     * 稳定性：稳定
     * @param array 待排数组
     */
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

    /**
     * 名称：插入排序-希尔排序
     * 描述：把整个序列分成若干个子序列，分别进行直接插入排序。这算是“一趟希尔排序”
     * 时间复杂度：平均O(n^1.5)，最坏O(n^2)
     * 稳定性：不稳定
     * @param array 待排数组
     * @param incrementNum 初始增量
     */
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

    /**
     * 名称：交换排序-冒泡排序
     * 描述：第一趟，第一个和第二个比，第二个再和第三个比···，第一趟完后，最大的数会被排到最后。第二趟依旧这样做。
     * 时间复杂度：平均O(n^2)，最坏O(n^2)
     * 稳定性：稳定
     * @param array 待排数组
     */
    public void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {//最多做n-1趟排序
            for (int j = 0; j < array.length - i - 1; j++) {//随着i的一次次循环，j每次都少一次循环（因为后面的书都是排好序的）
                if (array[j] > array[j + 1]) {    //如果前一位大于后一位，则把大的放前面
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 名称：交换排序-快速排序
     * 描述：选第一个数作为“枢轴”，
     *      将枢轴与序列另一端的数比较，如果枢轴大于它，就换位，小于就再和另一端的倒数第二个数比较···，
     *      第一次换位完了后依旧和另一边的比，但判断标准得颠倒，变成“如果枢轴小于它，就换位”
     *      一轮比完了，枢轴就到了中间，左边比它小，右边比它大。
     *      之后枢轴两边的序列继续进行快排。
     * 时间复杂度：平均O(nlogn)，最坏O(n^2)
     * 稳定性：不稳定
     * @param array 待排数组
     * @param low 开始位置（初始为0，因为一开始选[0]作为枢轴）
     * @param high 结束位置（初始为数组最后一个数）
     */
    public void quickSort(int[] array,int low,int high){
        int start = low;//开始位置（前端）
        int end = high;//结束位置（后端）
        int key = array[low];//关键值，也就是枢轴。第一次从位置0开始取，一轮排完会后排到中间。

        while(end>start){//
            //现在关键值在“前端”，从后往前比较，要找到小于关键值的值
            while(end>start&&array[end]>=key)  //如果比关键值大，则比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;//如果最后一个值大于关键值，则end往前移一位，拿倒数第二个比···
            if(array[end]<=key){//由于之前的end--，现在是往前移了一位了，如果这时候刚好比关键值小，则将小的值和关键值交换位置。
                int temp = array[end];
                array[end] = array[start];
                array[start] = temp;
            }
            //现在关键值在后端，从前往后比较，要找到大于关键值的值
            while(end>start&&array[start]<=key)//如果比关键值小，则比较下一个，直到有比关键值大的交换位置
                start++;//从前端开始找，如果前端的值比目前处在后端的关键值小，则start++，将前端位置往后移一位
            if(array[start]>=key){//由于前端往后移了一位，就再比一次，如果此时前端值刚好比关键值大，则交换位置，把关键值交换到前端。
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }
            //此时第一次循环比较结束，关键值（枢轴）的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }
        //递归，此时分别对枢轴两边进行快排
        if(start>low) quickSort(array,low,start-1);//此时low是初始时的开始位置，start则++了好几次，low位至start位构成了左边序列。low作为左边序列的起始位，start其实是枢轴的位置，所以start-1就是左边序列的结束位
        if(end<high) quickSort(array,end+1,high);//此时end是枢轴的位置，所以end+1是右边序列的起始位，high是最初的结束为（也就是最后一个数，期间改变的是end，high没变），所以high就是右边序列的结束位
    }

    /**
     * 名称：选择排序-直接选择排序
     * 描述：先从头到尾扫一遍，找到最小的数，和第一个交换，然后从第二个开始找，找到最小的，和第二个位置交换·····
     * 时间复杂度：平均O(n^2)，最坏O(n^2)
     * 稳定性：稳定
     * @param array 待排数组
     */
    public void selectionSort(int[] array){
        int len=array.length;
        int small;//一次比较中最小的下标。
        int temp;
        for(int i=0;i<len-1;i++){//初始从第0位开始找，此位放最小的数，之后第1位放第二小的数·····
            small=i;//该此比较中最小的下标
            for(int j=i+1;j<len;j++){//把假定最小下标后的下标的值与该值循环比较，每次都将更小的下标赋给small，一轮下来，small里就是真正的最小下标
                if(array[j]<array[small]){//如果找到比“最小下标”小的值，则将该下标改成最小下标
                    small=j;
                }
            }
            if(i!=small){//查询一轮下来，判断small是否变更，如果没变就表示目前i位就是最小的，不用换位。否则换位
                temp=array[small];//将目前找到的最小元素临时装到temp中
                //此处没有直接将i位于small位交换是因为直接交换可能会导致相同的数据元素位置发生变化，引起排序不稳定。
                for(int k=small;k>i;k--){//将第i位至第samll-1位的元素集体向后移一位（这样就刚好把第samll位盖住了，顺序也不会发生改变，也保证了稳定性）
                    array[k]=array[k-1];
                }
                array[i]=temp;//将目前最小值赋值给第i位
            }
        }
    }

    /**
     * 名称：选择排序-堆排序
     * 描述：首先，此序列对应的一维数组可看成是一个完全二叉树（其结构是：如果最顶端为最大值，则“所有的非终端结点的值都大于等于其左右的孩子结点的值”）。
     *      将这个完全二叉树经过一遍排序后，其顶端元素为最大值（为最大值则表示最终结果是从小到大排。如果顶端为最小值，则表示最终数组结果为从大到小排）。
     *      之后将树顶元素和最后一个元素交换位置，交换完后，最后一个元素变成了最小的值。
     *      接着再将“除最后一个元素”以外的元素看成是完全二叉树，对这个完全二叉树再进行这样的排序·····
     *      最终该完全二叉树（也就是一维数组）达到了从小到大的顺序。
     * 时间复杂度：平均O(nlogn)，最坏O(nlogn)
     * 稳定性：不稳定
     * @param array 待排数组
     */
    public void heapSort(int[] array){
        //整个过程分为两步，
        // 第一步：先构成一个根节点为最大元素的堆
        //在完全二叉树中，第i位结点的左孩子结点刚好在（i*2+1）位，右孩子结点在（i*2+2）位。
        int half = (array.length-1) / 2;//所以此处(array.length-1)/2，才能找到完全二叉树中的“最末端的非终端结点”（该结点以后的结点都是叶子结点）
        //堆排序的做法就是“以一个非终端结点和它的左右孩子结点”为一个“三角单位”，找出该三角单位中最大的数，将该数置于此三角单位的顶结点处。从最尾部的“三角单位”排起，一直排到根节点和其左右孩子结点组成的“三角单位”，此时根节点上的最大数就是整个完全二叉树的最大数。
        int len= array.length;
        for (int i = half; i >= 0; i--) {//此处的i=half就是从“最末端的非终端结点”所组成的“三角单位”开始排起，每排完一个非终端结点，就i--，找他上一个非终端节点接着排序，直到排到根节点为止。
            heapAdjust(array,len, i);//根据传入的非终端结点，找到“以该非终端结点为顶部结点以及他的左右孩子结点”，找出三者中的最大数，将其换到该三角单位的顶部结点位。
        }
        //第二步：此时第一轮的排序已经完成，现在有一个根节点为最大元素的堆，
        //我们需要把目前的根节点和末尾元素替换。
        // 然后重新进行一轮排序，找出第二大的元素，放到倒数第二位·····
        //每循环一次，“需要被排序的完全二叉树长度就减一”（因为尾部都是排好序的了）
        for (int i = array.length - 1; i >= 1; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapAdjust(array, i, 0);
        }
    }
    private void heapAdjust(int[] array, int heapSize, int index) {//构建局部最大顶堆，其中array是待排数组。heapSize是目前“需要被排的完全二叉树长度”（因为一轮排完，最大值就放到尾端了，这样需要被排的堆长度就减少了1）。index是任一个“非终端节点位”
        int left = index * 2 + 1;//index位的左孩子结点位
        int right = index * 2 + 2;//index位的右孩子结点位
        int largest = index;//最大的结点位（可能是顶位也可能是左右孩子结点位，只要是最大的数，其位置就也是这个）
        if (left < heapSize && array[left] > array[index]) {//左孩子结点不能超过目前堆的长度，且如果左孩子结点大于顶点，就将最大结点位改成左孩子结点位
            largest = left;
        }
        if (right < heapSize && array[right] > array[largest]) {//右孩子结点不能超过目前堆的长度，且如果右孩子结点大于“最大结点位上的元素”，就将最大结点位改成右孩子结点位
            largest = right;
        }
        if (index != largest) {//如果发现原来的顶端结点位已经不是最大结点位了，则将左、右孩子结点中最大的元素与顶端元素换位
            int temp = array[index];//将顶端元素暂存
            array[index] = array[largest];//将最大结点位上的元素放到顶端位上
            array[largest] = temp;//将旧顶端元素存到之前的最大顶点位上（因为最大顶点位其实是左右孩子结点中最大的孩子结点位）

            heapAdjust(array, heapSize, largest);//由于左、右孩子结点中的一个已经被替换，所以有可能破坏了“以旧孩子结点为顶端结点的局部三角排序顺序”，所以“要以被替换的结点为顶点”重新做一次调整。
        }
    }

    /**
     * 名称：归并排序
     * 描述：
     * 时间复杂度：平均O(nlogn)，最坏O(nlogn)
     * 稳定性：稳定
     * @param array 待排数组
     */
    public void mergingSort(int[] array){

    }

    /**
     * 名称：基数排序
     * 描述：
     * 时间复杂度（d代表长度，n代表关键字个数，r代表关键字的基数）：平均O(d(n+rd))，最坏O(d(n+rd))
     * 稳定性：稳定
     * @param array 待排数组
     */
    public void radixSort(int[] array){

    }


}
