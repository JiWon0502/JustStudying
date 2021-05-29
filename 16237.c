#include<stdio.h>

int main() {
    int num[6] = {0,};
    int ans = 0;
    for(int i = 1; i < 6; i++) scanf("%d", &num[i]);
    ans = num[3] + num[4] + num[5];
    

    printf("%d\n", ans);
}
