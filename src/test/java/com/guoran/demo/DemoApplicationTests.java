package com.guoran.demo;

import org.junit.Test;


import java.util.Arrays;

/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class DemoApplicationTests {

    @Test
    public void contextLoads() {


        System.out.println("开始");

        try {
            test01();
            System.out.println("91 * 3 = 273");
            System.out.println("调 test01() 后");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出错误------>" + e);
        }


        System.out.println("结束");
    }


    @Test
    public void test02(){
        System.out.println("进入方法 ------ > " + 0);
        int a = 1;
        int b = ++a;
        a += b++;
        System.out.println("结束方法 ------ > " + 1);
        System.out.println("打印 a  ------ > " + a);
        System.out.println("打印 b  ------ > " + b);

        int[] ints = new int[]{1,54,564,4,90937 / 32,909377 * 13,9093777 / 467,564,564,564,9093777,74,543,21,32,46,0,40,56406,404,054};
        System.out.println("快速排序前 ------- > " + Arrays.toString(ints));

        quickSort(ints);

        System.out.println("快速排序后 ------- > " + Arrays.toString(ints));

    }

    @Test
    public void test03(){
        String str = "130204176009132510";


        System.out.println(str.substring(12));

    }


    private void quickSort(int[] arrays)
    {
        subQuickSort(arrays, 0, arrays.length - 1);
    }

    private void subQuickSort(int[] arrays, int start, int end)
    {
        if (start >= end)
        {
            return;
        }

        if (start >= end)
        {
            return;
        }
        int middleIndex = subQuickSortCore(arrays, start, end);
        subQuickSort(arrays, start, middleIndex - 1);
        subQuickSort(arrays, middleIndex + 1, end);

        //稍微动一下代码

    }




    private int subQuickSortCore(int[] arrays, int start, int end)
    {
        int middleValue = arrays[start];

        while (start < end)
        {
            while (arrays[end] >= middleValue && start < end)
            {
                end--;
            }
            arrays[start] = arrays[end];
            while (arrays[start] <= middleValue && start < end)
            {
                start++;
            }
            arrays[end] = arrays[start];
        }
        arrays[start] = middleValue;
        return start;
    }



    public boolean test01() throws Exception {
        boolean flag = false;

        System.out.println("HDDB EFGA CCBE IOAM NBZZ QIJK ALDF OQFI ASDK ZKLJ AISD ZMJF AOID");

        System.out.println("柳媚娘：我喜欢吃红烧鸡腿。");


        if(flag){
            throw new Exception("not a question!");
//            throw new Exception("is a 666 game");
        }

        return true;
    }


}
