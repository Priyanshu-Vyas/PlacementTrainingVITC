public class NonReapeativeDigits {
    static int find(int n1,int n2) {
        int count=0;
        for(int i=n1;i<=n2;i++) {
            int num=i;
            boolean[] visited = new boolean[10];
            while(num > 0) {
                if(visited[num%10]==true)
                    break;
                visited[num%10] = true;
                num/=10;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n1=10;
    }
}
