public class Prime {
    public boolean isprime(int k) {
        int flag=0;
        for(int i=2;i<=k/2;i++) {
            if(k%i==0)
                flag=1; 
        }
        if(flag==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Prime p=new Prime();
        int n=10;
        for( int i=2;i<n;i++) {
            if(p.isprime(i))
                System.out.println(i);
        }
    }
}
