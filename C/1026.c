#include<stdio.h>
int A[51] = {0,};
int B[51] = {0,};

int compare_a(const void* a, const void* b){
    if(*(int*)a > *(int*)b)
        return 1;
    else if(*(int*)a < *(int*)b)
        return -1;
    else return 0;
}

int compare_b(const void* a, const void* b){
    if(*(int*)a < *(int*)b)
        return 1;
    else if(*(int*)a > *(int*)b)
        return -1;
    else return 0;
}


int main(){
    int N, tmp=0;
    scanf("%d", &N);
    for(int i = 0; i<N; i++) scanf("%d", &A[i]);
    for(int i = 0; i<N; i++) scanf("%d", &B[i]);
    qsort(A, N, sizeof(int), compare_a);
    qsort(B, N, sizeof(int), compare_b);

    for(int i = 0; i < N; i++){
        tmp+=A[i]*B[i];
    }
    printf("%d", tmp);
}
