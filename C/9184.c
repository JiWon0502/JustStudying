#include<stdio.h>
long long int w[55][55][55];

long long int dp(int a, int b, int c){
    if( a <= 0 || b<= 0 || c <= 0) 
        return 1;
    else if(w[a][b][c] != 0) return w[a][b][c];
    else if(a>20 || b>20 || c>20){
        w[a][b][c] = dp(20,20,20);
        return w[a][b][c];
    }
    else if(a<b && b<c){
        w[a][b][c] = dp(a,b,c-1)+dp(a,b-1,c-1)-dp(a,b-1,c);
        return w[a][b][c];
    }
    else{
        w[a][b][c] = dp(a-1,b,c)+dp(a-1,b-1,c)+dp(a-1,b,c-1)-dp(a-1,b-1,c-1);
        return w[a][b][c];
    }
        
}

int main(){
    int a, b, c;
    
    while(1){
        scanf("%d %d %d", &a, &b, &c);
        if(a == b && b==c && c==-1) break;
        else printf("w(%d, %d, %d) = %lld\n", a, b, c, dp(a,b,c));
    }
    return 0;
}
