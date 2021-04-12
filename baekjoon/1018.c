#include<stdio.h>

int main(){
    int N, M, answer = 0, min = 64;
    char arr[51][51] = {0,};
    scanf("%d %d", &N, &M);
    for(int i = 0; i < N; i++){
        for(int j = 0; j < M; j++){
            scanf("%c", &arr[i][j]);
        }
    }
    for(int i = 0; i<N-7; i++){
        for(int j = 0; j<M-7; j++){
            for(int p = 0; p<8; p++){
                for(int q=0; q<8; q++){
                    if((p+q) % 2 == 0 && arr[i+p][j+q] == 'B') answer++;
                    else if((p+q) % 2 == 1 && arr[i+p][j+q] == 'W') answer++;
                }
            }
            answer = answer<64-answer ? answer : 64-answer;
            min = min<answer ? min : answer;
            answer = 0;
        }
    }
    printf("%d", min);
}
