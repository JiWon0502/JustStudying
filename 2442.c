#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        for(int j=(n-1-i);j>0;j--){
            printf(" ");
        }
        for(int w=2*i+1;w>0;w--){
            printf("*");
        }
        printf("\n");
    }
    return 0;
}
