public class NSeries {
    public static void main(String[] args) {
        int n=10;
        for(int i=2;i<=n*2;i+=2) {
            System.out.print(i*((i*2)-1)+" ");
        }
    }
}
