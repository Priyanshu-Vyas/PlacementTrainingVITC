public class kthSmallest {
    public static void main (String[] args) {
        int k=5;
        int[] a = {1,9,10,3,7,5};
        for(int i=0;i<a.length;i++) {
            for(int j=i+1;j<a.length;j++) {
                if(a[j]>a[i]) {
                    int swap=a[i];
                    a[i]=a[j];
                    a[j]=swap;
                }
            }
        }
        System.out.println("Kth Smallest Element is : "+a[k-1]);
    }
}
