#include<stdio.h>
long long int dp[81] = {0,};
long long int fib(int n){
    if(dp[n]!=0 || n==0)
        return dp[n];
    else {
        dp[n] = fib(n-1)+fib(n-2);
        return dp[n];
    }
}
int main(){
    int N;
    dp[1] = 1;
    dp[2] = 1;
    scanf("%d", &N);
    printf("%lld", 4*fib(N)+2*fib(N-1));
}
