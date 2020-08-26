package com.delete;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getStr("abcde"));
    }

    public static String getStr(String s){
        ArrayList<Character> list=new ArrayList<>();
        for (int j=0;j<s.length();j++){
            int x=getList(s.length()).get(j);
            list.add((char)(s.charAt(j)+x));
        }
        return list.toString();
    }


    public static List<Integer> getList(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=1;i<=n;i++){
            list.add(getSum(i));
        }
        return list;
    }



    public static int getSum(int n){
        if (n==1){
            return 1;
        }
        else if (n==2){
            return 2;
        }
        else if(n==3){
            return 4;
        }
        else {
            return getSum(n-1)+getSum(n-2)+getSum(n-3);
        }
    }


}

