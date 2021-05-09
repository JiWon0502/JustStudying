#include<stdio.h>
int arr[100][100]={0,};
int ans = 0;


int main(){
    int N,M;
    scanf("%d %d", &N, &M);
    for(int i =0;i<N;i++){
        for(int j = 0; j<M; j++)
            scanf("%d", &arr[i][j]);
    }
    
}
