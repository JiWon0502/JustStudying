#include<stdio.h>
int main(){
    long long int N;
    int F;
    scanf("%lld\n%d", &N, &F);
    N = ((N/100)*100)%F;
    if(N==0) printf("00");
    else{
        F-=N;
        if(F<10) printf("0%d",F);
        else printf("%d", F);
    }
    return 0;
}
