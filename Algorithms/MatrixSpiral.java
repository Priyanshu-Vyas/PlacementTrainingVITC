public class MatrixSpiral {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        for(int j=0;j<3;j++) {
            System.out.print(a[0][j]+" ");
        }
        for(int i=1;i<3;i++) {
            System.out.print(a[i][2]+" ");
        }
        for(int j=1;j>-1;j--) {
            System.out.print(a[2][j]+" ");
        }
        for(int i=1;i>0;i--) {
            System.out.print(a[i][0]+" ");
        }
        for(int j=1;j<2;j++) {
            System.out.print(a[1][j]+" ");
        }
    }
}
