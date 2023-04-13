public class OddlyEven {
    public static void main(String[] args) {
        int oddsum=0,evensum=0;
        int[] a={4,5,6,7};
        for(int i=0;i<a.length;i++) {
            if(i%2==0) {
                evensum+=a[i];
            }
            else {
                oddsum+=a[i];
            }
        }
        System.out.println(Math.abs(oddsum-evensum));
    }
}