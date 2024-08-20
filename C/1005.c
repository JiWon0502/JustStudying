//트리를 리스트로 구현해야하므로 나중으로 넘긴다... 알아서 풀어봐
#include<stdio.h>

int sqnc[2][100001] = {0,}; //[0][n] : before, [1][n] after
//[0][n]이 지어져야 [1][n]이 지어짐.

int max(int a, int b){
    return a>b?a : b;
}

int compare(const void* a, const void b*){
    a = sqnc[1][*(int*)a];
    b = sqnc[1][*(int*)b];
    if(a>b) return 1;
    else if(a<b) return -1;
    return 0;
}

int main(){
    int T, N, K;
    scanf("%d", &T);
    int tm[1001] = {0,};
    for(int i = 0; i<T; i++){
        int time = 0;
        int indx[1001];
        scanf("%d %d", &N, &K);
        for(int j = 0; j<N; j++){
            scanf("%d ", &tm[j+1]); //1~N까지 인덱스에 시간 저장 
        }
        for(int j = 0; j<K; j++){
            scanf("%d %d", &sqnc[0][j], &sqnc[1][j]);
            // 앞의 것을 지어야 다음것을 지을 수 있다.
        }
        for(int j = 0; j<K; j++)
            indx[j] = j;
        qsort(indx, K, sizeof(int), compare);
        
        printf("%d", time);
    }
}
