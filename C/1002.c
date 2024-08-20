#include<stdio.h>

int main() {
    int x1, y1, r1, x2, y2, r2, T;
    scanf("%d", &T);
    while(T-->0){
        scanf("%d %d %d %d %d %d", &x1, &y1, &r1, &x2, &y2, &r2);

        if(x1==x2 && y1==y2){ 
            if(r1==r2) printf("-1\n"); //-1 - 1
            else printf("0\n"); //0 - 3
        }
        else{
            long long dist = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
            if(dist==((r1+r2)*(r1+r2))) printf("1\n"); //1 - 2
            else if(dist>((r1+r2)*(r1+r2))) printf("0\n"); //0 - 2
            else if(dist == ((r1-r2)*(r1-r2))) printf("1\n"); //1 - 1
            else if(dist <  ((r1-r2)*(r1-r2))) printf("0\n"); // 0 - 1
            else printf("2\n");
        }
    }
    return 0;
}
