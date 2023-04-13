public class hourglass {
    public static void main(String[] args) {
        int sum=0;
        int a[][] = {{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}};
        for(int i=1;i<5;i++) {
            for(int j=1;j<5;j++) {
                if(a[i][j]+a[i-1][j]+a[i-1][j-1]+a[i-1][j+1]+a[i+1][j]+a[i+1][j-1]+a[i+1][j+1]>sum) {
                    sum=a[i][j]+a[i-1][j]+a[i-1][j-1]+a[i-1][j+1]+a[i+1][j]+a[i+1][j-1]+a[i+1][j+1];
                }
            }
        }
        System.out.println(sum);
    }
}
