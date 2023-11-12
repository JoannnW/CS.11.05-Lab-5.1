public class ArrayUtility {

    public static void print(int[] array) {
        int[] myArray;
        myArray=new int[6];
        return;
    }

    public static int sum(int[] array) {
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        int sum=0;
        for (int num:array){
            sum+=num;
        }
        double average=(double) sum/array.length;
        average=(int)(average*100.0)/100.0;
        return average;
    }

    public static int minimum(int[] array) {
        int min=array[0];
        for (int i=0;i< array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int count=0;
        for (int i:array){
            if(i%2==0){
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] reverse;
        reverse=new int[array.length];
        for (int i=0;i<array.length;i++){
            reverse[i]=array[array.length-1-i];
        }
        return reverse;
    }

    public static void reverseTwo(int[] array) {
        int start=0;
        int end=array.length-1;
        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for(int i=0;i<array.length;i++){
            if (array[i]==num){
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for(String i:array){
            if(i.equals(str)){
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for(int i=0;i<array.length;i++){
            array[i] *= 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i=0;i<array.length;i++){
            array[i] *= n;
        }
    }

    public static String toString(int[] array) {
        String result="";
        for (int i=0;i<array.length;i++){
            result += array[i];
            if (i!=array.length-1){
                result+=", ";
            }
        }
        return result;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==num){
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int end=array[array.length-1];
        for (int i=array.length-1;i>0;i--){
            array[i]=array[i-1];
        }
        array[0]=end;
    }

    public static void shiftLeft(int[] array) {
        int start=array[0];
        for(int i=0;i<array.length-1;i++){
            array[i]=array[i+1];
        }
        array[array.length-1]=start;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for (int i=0;i<n;i++){
            shiftRight(array);
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for (int i=0;i<n;i++){
            shiftLeft(array);
        }
    }


}
