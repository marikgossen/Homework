package class14;

public class E5ArrayUtils {
    boolean isFound=false;
    boolean contains(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                isFound=true;
                break;
            }
        }
    return isFound;

    }


}

