public class matrixRotation {
    public static void main (String[] args) {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int[][] trans=new int[3][3];
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++) {
                trans[i][j]=a[j][i];
            }
        }
        for(int i=0;i<3;i++) {
            for(int j=0;j<1;j++) {
                int swap=trans[i][j];
                trans[i][j]=trans[i][j+2];
                trans[i][j+2]=swap;
            }
        }        
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(trans[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
