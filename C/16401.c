#include<stdio.h>
#include<stdlib.h>
int M, N;
long long int ans=0;
long long int arr[1000001] = {0,};

int compare(const void *a, const void *b){
    if(*(long long*)a>*(long long*)b) return 1;
    else if(*(long long*)a<*(long long*)b) return -1;
    return 0;
    
}

int chk(long long int n){
    int num=0;
    for(int i = 0; i<N; i++) num+=arr[i]/n;
    return num>=M? 1: 0; 
}

void b_srch(int l, int r){
    if(l>r) return;
    int num=0, q = (l+r)/2;
    for(int i = 0; i<N; i++) num+=(arr[i]/q);
    if(num>=M){
        ans = ans>q? ans:q;
        b_srch(q+1,r);
    }
    else b_srch(l,q-1);
}

int main(){
    scanf("%d %d", &M, &N);
    for(int i = 0; i<N; i++) scanf("%lld", &arr[i]);
    qsort(arr, N, sizeof(long long int), compare);
    b_srch(1,arr[N-1]);
    printf("%lld",ans);
}
