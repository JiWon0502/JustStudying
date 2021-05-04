#include<stdio.h>
#include<string.h>
//char* strncpy(char* destination, const char* source, size_t num);
//size_t strlen(const char* str);
int main(){
    int j = 0, tmp = 0, last_i = 0;
    char arr[1001];
    char answer[1001][1001];
    scanf("%s", arr);
    int len = strlen(arr);

    for(int i = 0; i < len; i++) {
        if(arr[i] == arr[i+1]){
            if(j == 0 && tmp == 0)
                j++;
            else if(tmp != 0){
                strncpy(answer[j++], &arr[last_i], tmp);
                tmp = 0;
            }
            last_i = i+2;
            i++;
        }
        else tmp++;
    }
    strncpy(answer[j++], &arr[last_i], (len - last_i + 1 ));
    for(int  i = 0; i<j; i++){
        printf("%s\n", answer[i]);
    }
}
