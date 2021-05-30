#include<stdio.h>
int main(){
    int N, M, set=1000, sole=1000, bill;
    scanf("%d %d", &N, &M);
    for(int i = 0; i<M; i++){
        int a, b;
        scanf("%d %d", &a, &b);
        set = a>set? set : a;
        sole = b>sole? sole : b;
    }
    if(set>sole*6) bill = N*sole;
    else bill = (set*(N/6)+sole*(N%6)) > set*((N+5)/6) ?  set*((N+5)/6) : (set*(N/6)+sole*(N%6));
    printf("%d", bill);
}
