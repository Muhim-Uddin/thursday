/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thursday;

/**
 *
 * @author HP 840 G5 i7
 */
public class Thursday {

    public static void main(String[] args) {
        char[] charArray={'H','I','T','O','U','H','I','D'};
        byte[] ascii={65,66,67,68,70,71,73};
        String str="welcome";
        String str1="java";
        String str2=new String(charArray);
        String str3=new String(charArray,3,3);
        String str4=new String(ascii);
        String str5=new String(ascii,2,3);
        String str6=new String();
        String str7=new String(str);
        System.out.println(str);
        System.out.println("str1:"+str1);
        System.out.println("str2:"+str2);
        System.out.println("str3:"+str3);
        System.out.println("str4:"+str4);
        System.out.println("str5:"+str5);
        System.out.println("str6:"+str6);
        System.out.println("str7:"+str7);
        str +="tutor touhid";
        System.out.println("STR:"+str);
    }
}
