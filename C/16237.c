#include<stdio.h>

int main() {
    int num[6] = {0,};
    int ans = 0;
    for(int i = 1; i < 6; i++) scanf("%d", &num[i]);
    ans = num[3] + num[4] + num[5];
    if(num[2] > num[3]){
        num[2] -= num[3];
        if(num[1] > num[4]){
            num[1]-=num[4];
            ans+=(num[2]/2+num[2]%2);
            num[1] -= (num[2]/2 + num[2]%2*3);
            ans+=(num[1]+4)/5;
        }
        else{
            ans+=(num[2]/2+num[2]%2);
        }
    }
    else{
        num[3]-=num[2];
        if((num[3]*2+num[4])<num[1]){
            num[1]-=(num[3]*2+num[4]);
            ans+=(num[1]+4)/5;
        }
    }
    printf("%d", ans);
}
