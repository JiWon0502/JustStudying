#include<stdio.h>

int main(){
    int N, M, J, l=1,r, x,n, answer = 0;
    scanf("%d %d", &N, &M);
    scanf("%d", &J);
    for(int i = 0; i< J; i++){
        scanf("%d", &x);
        r = l + M -1;
        if(l<=x && r>=x) {
            n = 0;
        }
        else if(x<l) {
            n = l-x;
            l -= n;
        }
        else {
            n = x-r;
            l += n;
        }
        answer+=n;
        
    }
    printf("%d", answer);
}
