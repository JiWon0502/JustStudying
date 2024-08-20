#include<stdio.h>
#include<stdlib.h>
int main(){
    int K,P,M;
    scanf("%d", &K);
    while(K-->0){
        int ans = 0;
        scanf("%d %d", &P, &M);
        int* arr = (int*) malloc(sizeof(int) * M);
        for(int i = 0; i<M; i++) arr[i]=0;
        for(int i = 0; i<P;i++){
            int pos;
            scanf("%d", &pos);
            if(arr[pos-1] != 0) ans++;
            else arr[pos-1] = 1;
        }
        printf("%d\n",ans);
        free(arr);
    }
}
