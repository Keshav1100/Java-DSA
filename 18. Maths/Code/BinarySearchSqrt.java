public class BinarySearchSqrt {
    public static void main(String[] args) {
        int n = 40;
        int prec = 3;
        System.out.printf("%.3f",Binsqrt(n,prec));
    }
    public static double Binsqrt(int n,int prec){
        int start = 1;
        int end = n;
        int mid = 0;
        while(start<=end){
            mid = start+ (end-start)/2;
            if(mid*mid<n){
                start = mid+1;
            }
            else if(mid*mid>n){
                end = mid-1;
            }
            else if(mid*mid==n){
                return mid;
            }
        }
        double precValue = 0.1;
        double ans = mid;
        for (int i = 0; i < prec; i++) {
            while(ans*ans<=n){
                ans+=precValue;
            }
            ans-=precValue;
            precValue/=10;
        }
        return ans;
    }
}
