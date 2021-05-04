#include<stdio.h>
#include<string.h>

int main(){
    int T, N, ans[151] = {0,};
    scanf("%d", &T);
    while(1){
        char arr[150][20] = {0,};
        scanf("%d", &N);
        for(int i = 0; i<N; i++) scanf("%s", arr[i]);
        for(int i = N-1; i>=0; i--){
            if(strcmp(arr[i], arr[i-1])<0)
                ans[i] = 1;
            else ans[i] = 0;
        }
        if(strcmp(arr[0], arr[1])>0) ans[0] = 1;
        else ans[0] = 0;
        for(int i = 0; i<N; i++) printf("%d", ans[i]);
        if(--T<0) break;
        else printf("\n");
    }
}
