#include<stdio.h>
long long int arr[1000001] = {0,};
long long int tmp[1000001] = {0,};
int compare(const void* a, const void* b){
    if(*(long long int*)a > *(long long int*)b) return 1;
    else if(*(long long int*)a < *(long long int*)b) return -1;
    else return 0;
}

int main(){
    long long int N;
    scanf("%lld", &N);
    for(long long int i = 0; i<N; i++){
        scanf("%lld", &arr[i]);
        tmp[i] = arr[i];
    }
    qsort(arr, N, sizeof(long long int), compare);
    for(long long int i = 0; i<N; i++){
        long long int ans = 0;
        long long int j = 0;
        while(tmp[i]>arr[j]){
            if(arr[j] != arr[j-1] || j==0)
                ans++;
            j++;
        }
        printf("%lld ", ans);
    }
}
