package com.chinamobile;
/*
Java中只有值传递，不存在引用传递，值传递和引用传递的区别并不是传递的内容，数据存在引用类型和值类型，而是实参到底有没有被复制一份给形参
*/

public class PassByValue {
    public void  testPassByValueChange()
    {
        User actualParam=new User();
        actualParam.setName("wwb");
        actualParam.setGender("male");
        System.out.printf("before ChangeCall name is %s gender is %s",actualParam.name,actualParam.gender);
        System.out.println();
        resetUserWithChange(actualParam);
        System.out.printf("after ChangeCall name is %s gender is %s",actualParam.name,actualParam.gender);
    }

    public void  testPassByValueNoChange()
    {
        User actualParam=new User();
        actualParam.setName("wwb");
        actualParam.setGender("male");
        System.out.printf("before NoChangeCall name is %s gender is %s",actualParam.name,actualParam.gender);
        System.out.println();
        resetUserWithNoChange(actualParam);
        System.out.printf("after NoChangeCall name is %s gender is %s",actualParam.name,actualParam.gender);
    }
    //传入的是地址的副本，也是传值，因为地址的副本跟实参的地址是一样的，所以指向同一个内存地址
    private void resetUserWithChange(User refernceParam) {
        refernceParam.setName("zjl");
        refernceParam.setGender("female");
    }
    //传入的是一个地址的副本，也是传值，如果传的是引用的话 refernceParam=new User(); 会使实参丢失
    private void resetUserWithNoChange(User refernceParam) {
        refernceParam=new User();
        refernceParam.setName("zjl");
        refernceParam.setGender("female");
    }
}
