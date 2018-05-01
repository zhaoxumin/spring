package com.my.spring;

import java.util.HashMap;

public class Test {
    public static void main(String []args){
        HashMap hashMap=new HashMap();
        hashMap.put(1,"jack");
        hashMap.put(1,"tom");
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(1).hashCode());
    }

}
