#include<stdio.h>
int main(){
    int n, i, j, k;
    scanf("%d",&n);
    if(n==1){
        printf("*");
        return 0;
    }
    for(i=0;i<n;i++){
        for(j=i;j>0;j--){
            printf(" ");
        }
        for(k=2*(n-i)-1;k>0;k--){
            printf("*");
        }
        printf("\n");
    }
    for(i=n-2;i>0;i--){
        for(j=i;j>0;j--){
            printf(" ");
        }
        for(k=2*(n-i)-1;k>0;k--){
            printf("*");
        }
        printf("\n");
    }
    for(i=0;i<2*n-1;i++){
        printf("*");
    }
    return 0;
}
