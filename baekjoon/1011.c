#include<stdio.h>

long long calc(long long int a){
    long long n=0;
    while(1){
        n++;
        if(n*(n+1)<a && a < (n+1)*(n+2))
            break;
    }
    if(a<=(n*(n-1)+n)) return 2*n-1;
    else return 2*n;
}

int main(){
    int T;
    long long x, y;
    scanf("%d", &T);
    for(int i = 0; i<T; i++){
        scanf("&llu &llu", &x, &y);
        printf("%llu", calc(y-x));
    }
}
