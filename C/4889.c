#include<stdio.h>
#include<string.h>

int main(){
    char arr[2001] = {0,};
    int len, i = 1;
    while(1){
        int l = 0, r = 0, answer= 0;
        scanf("%s", arr);
        if(arr[0] == '-') return 0;
        len = strlen(arr);
        for(int i = 0; i < len; i ++){
            if(arr[i] == '{'){
                l++;
            }
            else if(arr[i] == '}'){
                if(l<=r) {
                    l++;
                    answer++;
                }
                else r++;
            }
        }
        if(l-r>0) answer+= (l-r)/2;
        else if(r-l >0) answer += (r-l)/2;
        printf("%d. %d\n", i++, answer);
    }
}
