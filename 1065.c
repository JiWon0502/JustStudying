#include<stdio.h>

int chk(int n){
    int a = n/1000;
    n%=1000;
    int b = n/100;
    n%=100;
    int c = n/10;
    n%=10;
    int d = n;
    if(a!=0 && (a-b == c-d) && (a-c == 2*(b-c))) return 1;
    else if(b!=0 && (b-c == c-d)) return 1;
    else if(a==0 && b==0) return 1;
    return 0;
}
int main(){
    int N, ans= 0;
    scanf("%d", &N);
    for(int i = 0; i<N; i++) ans+=chk(i+1);
    printf("%d", ans);
}
