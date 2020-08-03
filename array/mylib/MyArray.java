package com.array.mylib;

import java.util.Arrays;

public class MyArray {

//    private static final int length = 20;
//    private static String[] texts = new String[length];
//    private static int counter = 0;

    public static int count(String[] texts){
        int counter =0;
        for(int i=0; i< texts.length; i++){
            if(texts[i] != null ){
                counter++;
            }
        }
        return counter;
    }

    public static void printArray(String[] texts){
        System.out.println(Arrays.toString(texts));
    }

    public static void addToLast(String key, String[] texts ) throws Exception {
        if(texts[texts.length -1] != null){
            throw new Exception("Array is overflowing");
        }
        int counter = count(texts);
        texts[counter] = key;
    }

    public static void addToFirst(String key, String[] texts) throws Exception {
        if(texts[0] == null){
            texts[0] = key;
            return;
        }
        for(int i=0; i< texts.length; i++){
            if(texts[i] == null) {
                for (int j = i; j > 0; j--) {
                    texts[j] = texts[j - 1];
                }
                texts[0] = key;
                return;
            }
        }
        throw new Exception("Array is overFlowing");
    }
    public static void add(String key, String[] texts, int index) throws Exception {
        int counter = count(texts);
        if(counter< index){
            throw new Exception("This index is not valid. Please Try a lower index.");
        }
        if(texts[index] == null){
            texts[index] = key;
            return;
        }
        for(int i = 0; i<texts.length; i++){
            if(texts[i] == null){
               if(index< i){
                   for(int j = i; j>index; j--){
                       texts[j] = texts[j-1];
                   }
                   texts[index] = key;
                   return;
               } else {
                   for(int j = i; j< index; j++){
                       texts[j] = texts[j+1];
                   }
                   texts[index] = key;
                   return;
               }
            }
        }
        throw new Exception("Array is Overflowing");
    }
    public static void remove (int index, String[] texts) throws Exception{
        int counter = count(texts);
        if(index> counter) {
            throw new Exception("This index does not contain a proper String");
        }
        for(int i = index; i <counter; i++){
            texts[i] = texts[i +1];
        }
    }

    public static void removeFirst(String[] texts){
        int counter = count(texts);
        for(int i = 0; i <counter; i++){
            texts[i] = texts[i +1];
        }
    }
    public static void removeLast (String[] texts) {
        int counter = count(texts);
        texts[counter -1] = null;
    }

    public static void update (int index, String key,String[] texts) throws Exception {
        int counter = count(texts);
        if(counter<index){
            throw new Exception("This index is not valid. Please Try a lower index.");
        }
        texts[index] = key;
    }

    public static String find(int index, String[] texts){
        for(int i =0; i<texts.length; i++){
            if(i == index){
                return texts[i];
            }
        }
        return "Value is not Found!";
    }

    public static int findIndex(String key, String[] texts) {
        for(int i =0; i<texts.length; i++){
            if(texts[i] == key){
                return i;
            }
        }
        System.out.println("Value Not Found");
        return -1;
    }

    public static void mySort(String[] texts) throws Exception {

        int counter = count(texts);

        for(int i=0; i<counter; i++){
            for(int j = 0; j< counter - 1; j++){
                if(texts[j].compareTo(texts[j + 1]) > 0) {
                    String temp = texts[j];
                    texts[j] = texts[j + 1];
                    texts[j + 1] = temp;
                }
            }
        }
    }
    public static boolean includes(String key, String[] texts){
        int counter = count(texts);
        for(int i = 0; i<counter; i++ ){
            if(texts[i] == key){
                return true;
            }
        }
        return false;
    }
    public static String[] slice(int start, int end, String[] texts){
        String[] newArray = new String[(end - start)];
        int counter= count(texts);
        if(start <= counter && end <= counter){
            for(int i = start, j= 0; i<end; i++){
                    newArray[j] = texts[i];
                    j++;
            }
        }
        return newArray;
    }
    public static String[] slice(int start, String[] texts){
        int counter = count(texts);
        String[] newArray = new String[(counter - start)];
        if(start <= counter){
            for(int i = start, j= 0; i<counter; i++){
                newArray[j] = texts[i];
                j++;
            }
        }
        return newArray;
    }
    public static String[] slice(String[] texts){
        String[] newArray = new String[texts.length];

        for(int i = 0, j= 0; i<texts.length; i++){
            newArray[j] = texts[i];
            j++;
        }

        return newArray;
    }
    public static String join(char separator, String[] texts){
        int counter= count(texts);
        String string = "";
        for(int i = 0; i< counter; i++){
            if(i == 0) {
                string = texts[i];
            } else {
                string = string + separator + texts[i];
            }
        }
        return string;
    }
//    public static void fill (String ...strings){
//        for(int i =0; i< strings.length; i++ ){
//            System.out.println(texts[i]);
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "MyArray{}";
//    }
    public static void fill(String string, int start, int end, String[] texts){
        int counter = count(texts);
        for(int i = start; i<end; i ++){
            texts[i] = string;
        }
    }
    public static void fill(String string, int start, String[] texts){
//        int counter = count(texts);
        for(int i = start; i< texts.length; i ++){
            texts[i] = string;
        }
    }

    public static void fill(String string, String[] texts){
            for(int i = 0; i< texts.length; i ++){
                texts[i] = string;
            }
    }
}
