#include<stdio.h>
int sum=999999999, N;
int arr[11][11]={0,};
int visit[11] = {0,};

void dfs(start, pos, cnt, tmp_sum){//최초 시작점 , 현재 위치, 순회한 수 , 현재 sum
    if(start == pos && cnt == N){
        if(sum > tmp_sum) sum = tmp_sum;
        return;
    }
    else if(start == pos && cnt!=0) return;
    else if(cnt >= N) return;
    else if(sum<tmp_sum) return;
    for(int i = 0; i<N; i++){
        if(arr[pos][i] != 0 && visit[i] != 1) {
            visit[i] = 1;
            tmp_sum += arr[pos][i];
            dfs(start, i, cnt+1, tmp_sum);
            visit[i] = 0;
            tmp_sum -= arr[pos][i];
        }
    }
}

int main(){
    scanf("%d", &N);
    for(int i = 0; i<N; i++){
        for(int j = 0; j<N; j++)
            scanf("%d", &arr[i][j]);
    }
    for(int i = 0; i<N; i++){
        dfs(i, i, 0, 0);
    }
    printf("%d", sum);
}
