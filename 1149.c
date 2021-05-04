#include<stdio.h>
#define Red 0
#define Green 1
#define Blue 2

int dp[1004][3] = {0,};
int arr[1004][3] = {0,};

int min(int a, int b){
    int mn;
    mn = a<b?a:b;
    return mn;
}

int calc(int n, int color){
    if(n==1 || dp[n][color] != 0) return dp[n][color];
    else{
        if(color == Red)
            dp[n][color] = arr[n][color] + min(calc(n-1, Blue), calc(n-1,Green));
        else if(color == Green)
            dp[n][color] = arr[n][color]+ min(calc(n-1, Red), calc(n-1,Blue));
        else dp[n][color] = arr[n][color] +  min(calc(n-1, Green), calc(n-1,Red));
        return dp[n][color];
    }
}


int main(){
    int N, min_num;
    scanf("%d", &N);
    for(int i = 1; i<=N; i++)
        scanf("%d %d %d", &arr[i][Red], &arr[i][Green], &arr[i][Blue]);
    dp[1][0] = arr[1][0];
    dp[1][1] = arr[1][1];
    dp[1][2] = arr[1][2];
    min_num = min(min(calc(N,Red), calc(N,Green)),calc(N,Blue));
    printf("%d", min_num);
}
