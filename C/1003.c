#include<stdio.h>
int dp[41][2] = {0,};

int fibo(int n, int indx){
    if(n==0 || n==1)
        return dp[n][indx];
    else if(dp[n][indx]!=0)
        return dp[n][indx];
    else {
        dp[n][indx] = fibo(n-1,indx) + fibo(n-2,indx);
        return dp[n][indx];
    }
}

int main(){
    int T;
    scanf("%d", &T);
    dp[0][0] = 1;
    dp[1][1] = 1;
    while(T-->0){
        int n;
        scanf("%d", &n);
        printf("%d %d\n", fibo(n,0), fibo(n,1));
    }
    return 0;
}
