#include<stdio.h>
#include<stdlib.h>

int arr[100001] = {0,};

int compare(const void* a, const void *b){
    if(*(int*)a > *(int*)b)
        return -1;
    else if (*(int*)a < *(int*)b)
        return +1;
    return 0;
}

int main(){
    int N;
    long long int answer = 0;
    scanf("%d", &N);
    for(int i = 0; i <N; i++) scanf("%d", &arr[i]);
    qsort(arr,N,sizeof(int),compare);
    for(int i = 0; i<N; i++){
        if((arr[i]-i) <= 0) break;
        else answer += arr[i]-i;
    }
    printf("%lld", answer);
}
