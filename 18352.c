#include<stdio.h>
int que[3000001] = {0,};
int visit[300001] = {0,};
int main(){
    int N, M, K, X;
    int **arr;
    arr = (int**) malloc(sizeof(int*) *N);
    arr[0] = (int*) malloc (sizeof(int)*N*N);
    for(int i = 1; i<height; i++) arr[i] = arr[i-1] + width;
    scanf("%d %d %d %d", &N, &M, &K, &X);
    for(int i = 0; i<M; i++) {
        int a, b;
        scanf("%d %d", &a, &b);
        arr[a-1][b-1] = 1;
    }
    
}
