#include<stdio.h>
/*B[P[i]] = A[[i] 
so find P[i]
that makes every i in range of n that satisfies
B[i] <= B[i+1]

B[P[i]] = A[i]
*/
//indx starts at 0, for 0~N
int main(){
    int indx = 0, min = 0, N, A[51] = {0,}, P[51] = {0,};
    scanf("%d", &N);
    for(int i = 0; i < N; i++) scanf("%d", &A[i]);
    while(indx<N){
        for(int i = 0; i < N; i++){
            if(A[i] == min)
                P[i] = indx++;
        }
        min++;
    }
    for(int i = 0; i < N; i++) printf("%d ", P[i]);
}
