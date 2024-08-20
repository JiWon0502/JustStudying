#include<stdio.h>
int num[50001] = {0,};

int main(){
    int n;
    scanf("%d", &n);
    for(int i=0; i<=50001; i++) num[i] = 4;
    for(int i = 1; i <= 225; i++){
        if(i*i < 50001) num[i*i] = 1; //1
        for(int j = 1; j<=225; j++){
            if((i*i + j*j) < 50001 && num[i*i+j*j] > 2)
                num[i*i+j*j] = 2; //2
            for(int k = 1; k <= 225; k++){
                if((i*i + j*j + k*k) <= 50001 && num[(i*i + j*j + k*k)] > 3)
                    num[(i*i + j*j + k*k)] = 3; //3
            }
        }
    }
    printf("%d", num[n]);
}
