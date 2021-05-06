#include<stdio.h>
long long int B, C;
int chk(long long int stdnt){
    stdnt-=B;
    if(stdnt<=0) return 1;
    else if(stdnt % C == 0) return stdnt/C+1;
    else return stdnt/C+2;
}
int main(){
    long long int N, ans = 0;
    long long int arr[1000001] = {0,};
    scanf("%lld", &N);
    for(long long int i = 0; i < N; i++) scanf("%lld", &arr[i]);
    scanf("%lld %lld", &B, &C);
    for(long long int i = 0; i<N; i++) ans+=chk(arr[i]);
    printf("%lld", ans);
}
