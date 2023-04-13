public class QuickSort {
    public static void quickSort(int[] a,int low,int high) {
        if(low<high) {
            int pivot=partition(a,low,high);
            quickSort(a,low,pivot-1);
            quickSort(a,pivot+1,high);
        }
    }
    public static int partition(int[] a,int low,int high) {
        int pivot=a[high]; // pivot is the last element
        int i=low-1; // i is the index of the last element which is less than pivot
        for(int j=low;j<high;j++) { 
            if(a[j]<=pivot) { 
                i++; 
                int temp=a[i]; 
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[i+1];
        a[i+1]=a[high];
        a[high]=temp;
        return i+1;
    }
    public static void main(String[] args) {
        int[] a=new int[5];
        a[0]=5;
        a[1]=4;
        a[2]=3;
        a[3]=2;
        a[4]=1;
        quickSort(a,0,4);
        for(int i=0;i<5;i++)
            System.out.println(a[i]);
    }
}