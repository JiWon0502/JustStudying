#include<stdio.h>

short num[1001]  = {0,};

void calc(){
    int dp[45] = {0,};
    for(int i = 1; i <= 44; i++){
        dp[i] = (i*i+i)/2;
        if(dp[i] < 334) num[3 * dp[i]] = 1;
        for(int j = 1; j<i ;j++){
            if((dp[j]+2*dp[i])<1001) num[(dp[j]+2*dp[i])] = 1;
            for(int k = 1; k<=j;k++){
                if((dp[k]+dp[j]+dp[i])<1001) num[(dp[k]+dp[j]+dp[i])] = 1;
            }
        }
    }
}

int main(){
    int n;
    scanf("%d",&n);
    calc();
    for(int i = 0; i<n; i++){
        int p;
        scanf("%d", &p);
        printf("%d\n", num[p]);
    }
}
