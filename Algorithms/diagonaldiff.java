public class diagonaldiff {
    public static void main(String[] args) {
        int[][] a={{11,2,4},{4,5,6},{10,8,12}};
        int uptodown=0,downtoup=0;
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++) {
                if(i==j) {
                    uptodown+=a[i][j];
                }
                if(i+j==a.length-1) {
                    downtoup+=a[i][j];
                }
            }
        }
        System.out.println("Diagonal Difference = "+Math.abs(uptodown-downtoup));
    }
}
