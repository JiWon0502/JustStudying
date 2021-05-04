//without the solution function... `cause double pointer is so...xxx

#include<stdio.h>

int checkif(int n){
    int sum;
    for(int i = 1; i < n; i++){
        if(n%i == 0) sum+=i; 
    }
    if(sum == n) return 1;
    else return 0;
}

int main(){
    int k, numbers[10001] = {0,};
    scanf("%d", &k);
    for(int i = 0; i < k; i++){
        scanf("%d", &numbers[i]);
        if(checkif(numbers[i])) printf("YES\n");
        else printf("NO\n");
    }
    return 0;
}
