#include<stdio.h>
//23 = 16+4+2+1
//32 = 64/2
//64 = 64
//48 = 32+16
int main(){
    int answer = 0, x;
    scanf("%d", &x);
    while(x >0){
        if(x%2 == 1)
            answer++;
        x/=2;
    }
    printf("%d", answer);
}
