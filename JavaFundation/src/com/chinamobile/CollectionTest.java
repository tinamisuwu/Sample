package com.chinamobile;
import java.util.Arrays;
import java.util.List;

public class CollectionTest {
    //数组的初始化，以及数组转换成List
    public void  InitializeArray()
    {
       Integer[] intarr={1,2,3};
       String[] str=new String[]{"hello","world"};
       List<Integer> intList= Arrays.asList(intarr);
       List<String> strList=Arrays.asList(str);
       intList.forEach(x->System.out.println(x));
       strList.forEach(x->System.out.println(x));
    }

    public  void TestValueTypeAndReferenceType()
    {
        int valueType=5;
        Integer referenceType=new Integer(5);
        PlusOne(valueType,referenceType);
        System.out.printf("valueType : %s",valueType);
        System.out.printf("refrenceType : %s",referenceType);
    }
    //原始数据类型和分装类型都是值传递
    public void TestPrimitiveType()
    {
        int valueType=5;
        Integer referenceType=new Integer(5);
        int valueTypeCopy=valueType;
        Integer referenceTypeCopy=referenceType;
        valueType=valueType+1;
        referenceType=referenceType+1;
        System.out.printf("valueType : %s",valueType);
        System.out.println();
        System.out.printf("refrenceType : %s",referenceType);
        System.out.println("***********************************");
        System.out.printf("valueTypeCopy : %s",valueTypeCopy);
        System.out.println();
        System.out.printf("referenceTypeCopy : %s",referenceTypeCopy);
    }
    private void PlusOne(int valueType, Integer referenceType) {
        valueType=valueType+1;
        referenceType=referenceType+1;
    }
}

