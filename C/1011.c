#include<stdio.h>

long long int calc(long long int a){
    long long int n=0;
    while(1){
        if(n*(n+1) < a && a <= (n+1)*(n+2))
            break;
        n++;
    }
    n++;
    if(a<=(n*(n-1)+n)) return 2*n-1;
    else return 2*n;
}

int main(){
    int T;
    long long int x, y;
    scanf("%d", &T);
    for(int i = 0; i<T; i++){
        scanf("%lld %lld", &x, &y);
        printf("%lld\n", calc(y-x));
    }
}
