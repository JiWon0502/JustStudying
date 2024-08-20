#include<stdio.h>
#include<stdlib.h>
int compare(const void* a,const void*b){
    if(*(int*)a>*(int*)b) return 1;
    else if(*(int*)a<*(int*)b) return -1;
    return 0;
}
int gcd(int a, int b){
    return b? gcd(b,a%b):a;
}
int main(){
    int dice1[6] = {0,}, dice2[6] = {0,}, ans=0;
    scanf("%d %d %d %d %d %d", &dice1[0],&dice1[1], &dice1[2], &dice1[3], &dice1[4], &dice1[5]);
    scanf("%d %d %d %d %d %d", &dice2[0],&dice2[1], &dice2[2], &dice2[3], &dice2[4], &dice2[5]);
    qsort(dice1, 6, sizeof(int), compare);
    qsort(dice2, 6, sizeof(int), compare);
    for(int i = 0; i<6; i++){
        int j = 0;
        while(dice1[i]>dice2[j++]) ans++;
    }
    printf("%d/%d",ans/gcd(36,ans), 36/gcd(36,ans));
}
