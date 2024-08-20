#include<stdio.h>
#include<string.h>
int toint(char* s){
    printf("%s", s);
    char ch[10] = s;
    if(strcmp(ch, 'black')) return 0;
    if(strcmp(ch, 'brown')) return 1;
    if(strcmp(ch, 'red')) return 2;
    if(strcmp(ch, 'orange')) return 3;
    if(strcmp(ch, 'yellow')) return 4;
    if(strcmp(ch, 'green')) return 5;
    if(strcmp(ch, 'blue')) return 6;
    if(strcmp(ch, 'violet')) return 7;
    if(strcmp(ch, 'grey')) return 8;
    if(strcmp(ch, 'white')) return 9;
}
int main(){
    char s1[10], s2[10], s3[10];
    int n;
    scanf("%s %s %s", s1, s2, s3);
    n = toint(s1)*10+toint(s2);
    switch(toint(s3)){
    case 1:
        n*=10;
    break;
    case 2:
        n*=100;
        break;
    case 3:
        n*=1000;
        break;
    case 4:
        n*=10000;
        break;
    case 5:
        n*=100000;
        break;
    case 6:
        n*=1000000;
        break;
    case 7:
        n*=10000000;
        break;
    case 8:
        n*=100000000;
        break;
    case 9:
        n*=1000000000;
        break;
    }
}
