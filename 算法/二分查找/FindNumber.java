package learn;

import java.util.Arrays;

public class FindNumber {
    //使用二分查找判断数字是否在数组中
    public static void main(String[] args) {
        int N=100;
        int V=1000;
        int testTime=500000;
        System.out.println("测试开始");
        for(int i=0;i<testTime;i++){
            int n=(int)(Math.random()*N);
            int[] arr=randomArray(n,V);
            Arrays.sort(arr);
            int num=(int)(Math.random()*V)+1;
            if(right(arr,num)!=exist(arr,num)){
                System.out.println("出错了！");
            }
        }
        System.out.println("测试结束");
    }
    public static int[] randomArray(int n,int v){
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=(int)(Math.random()*v)+1;
        }
        return arr;
    }
    public static boolean right(int[] arr,int num){
        for (int i : arr) {
            if(num==i)
                return true;
        }
        return false;
    }
    public static boolean exist(int[] arr,int num){
        if(arr==null||arr.length==0){
            return false;
        }
        int l=0,r=arr.length-1,m=0;
        while (l<=r){
            m=(l+r)/2;
            if(arr[m]==num){
                return true;
            }else if(arr[m]>num){
                r=m-1;
            }else {
                l=m+1;
            }
        }
        return false;
    }
}
