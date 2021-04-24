#include<stdio.h>
long long int arr[1000001] = {0,};
long long int tmp[1000001] = {0,};


int main(){
    long long int N;
    scanf("%lld", &N);
    for(long long int i = 0; i<N; i++){
        scanf("%lld", &arr[i]);
        tmp[i] = arr[i];
    }
    
}
