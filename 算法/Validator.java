package learn;

import java.util.Arrays;

public class Validator {
    public static void main(String[] args) {
        int N=5;
        int V=10;
        int testTimes=50000;
        System.out.println("测试开始");
        for(int i=0;i<testTimes;i++){
            int n=(int)(Math.random()*N);
            int[] arr=randomArray(n,V);
            int[] arr1=copyArray(arr);
            int[] arr2=copyArray(arr);
            int[] arr3=copyArray(arr);
            selectSort(arr1);
            bubbleSort(arr2);
            insertSort(arr3);
            if(!someArray(arr1,arr2)||!someArray(arr1,arr3)){
                System.out.println("出错了！");
//                System.out.println(Arrays.toString(arr));
            }
        }
        System.out.println("测试结束");
    }
  //得到一个长度为n的随机数组
    public static int[] randomArray(int n,int v){
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=(int)(Math.random()*v)+1;
        }
        return arr;
    }

    public static int[] copyArray(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=arr[i];
        }
        return ans;
    }
    public static boolean someArray(int[] arr1,int[] arr2){
        int n=arr1.length;
        for(int i=0;i<n;i++){
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }
    public static void swap(int[] arr,int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    //选择排序
    public static void selectSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            swap(arr,i,minIndex);
        }
//        System.out.println(Arrays.toString(arr) +"选择");
    }
    //冒泡排序
    public static void bubbleSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
//        System.out.println(Arrays.toString(arr) +"冒泡");
    }
    //插入排序
    public static void insertSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i-1;j>=0&&arr[j]>arr[j+1];j--){
                swap(arr,j,j+1);
            }
        }
//        System.out.println(Arrays.toString(arr) +"插入");
    }
}
