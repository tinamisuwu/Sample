package com.chinamobile;

public class Main {

    public static void main(String[] args) {
        //****************************************
        //
        CollectionTest collectionTest=new CollectionTest();
        collectionTest.InitializeArray();
        collectionTest.TestValueTypeAndReferenceType();
        collectionTest.TestPrimitiveType();
        //******************************************

        //Java中只有值传递，不存在引用传递
        PassByValue passByValue=new PassByValue();
        passByValue.testPassByValueChange();
        passByValue.testPassByValueNoChange();
        //*************************************************
    }
}
