#include<stdio.h>
#include<string.h>

char a1[105] = {0,};
char a2[105] = {0,};

int compare(const void* a, const void *b){
    return strcmp((char*)a, (char*)b);
}

int main(){
    int n;
    scanf("%d", &n);
    for(int i = 0; i<n; i++){
        scanf("%s %s", a1, a2);
        printf("%s & %s are", a1, a2);
        qsort(a1 , strlen(a1), sizeof(char), compare);
        qsort(a2 , strlen(a2), sizeof(char), compare);
        if(strcmp(a1, a2)==0)
            printf(" anagrams.\n");
        else printf(" NOT anagrams.\n");
    }
    return 0;
}
