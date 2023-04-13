import java.util.Arrays;

public class muldigtoa {
    public static void main(String[] args) {
        int a=75; //<100
        int[] arr = new int[10];
        int k=0;
        for(int i=2;i<10;) {
            if(a%i==0) {
                arr[k++]=i;
                a/=i;
            }
            else{
                i++;
            }
            if(a==1)
                break;
        }
        // int m=k;
        // for(int i=0;i<k-1;i++) {
        //     if(arr[i]==arr[i+1] && arr[i]*arr[i+1]<10) {
        //         arr[k++]=arr[i]*arr[i+1];
        //         i++;
        //     }
        //     else {
        //         arr[k++]=arr[i];
        //     }
        // }
        System.out.println(Arrays.toString(arr));
    }
}
