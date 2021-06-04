/*
You are given a string 𝑠 consisting of the characters 0, 1, and ?.

Let's call a string unstable if it consists of the characters 0 and 1 and any two adjacent characters are different (i. e. it has the form 010101... or 101010...).

Let's call a string beautiful if it consists of the characters 0, 1, and ?, and you can replace the characters ? to 0 or 1 (for each character, the choice is independent), so that the string becomes unstable.

For example, the strings 0??10, 0, and ??? are beautiful, and the strings 00 and ?1??1 are not.

Calculate the number of beautiful contiguous substrings of the string 𝑠.

Input
The first line contains a single integer 𝑡 (1≤𝑡≤104) — number of test cases.

The first and only line of each test case contains the string 𝑠 (1≤|𝑠|≤2⋅105) consisting of characters 0, 1, and ?.

It is guaranteed that the sum of the string lengths over all test cases does not exceed 2⋅105.

Output
For each test case, output a single integer — the number of beautiful substrings of the string 𝑠.


Strings "0" and "1" are unstable.

input :
3
0?10
???
?10??1100

output:
8
6
25

First test case, all beautiful substrings:
0 (from position 1 to position 1)
0? (from position 1 to position 2)
? (from position 2 to position 2)
?1 (from position 2 to position 3)
?10 (from position 2 to position 4)
1 (from position 3 to position 3)
10 (from position 3 to position 4)
0 (from position 4 to position 4)

If a string consists of some types of characters, it doesn't mean all of them should be in the string. So, for a beautiful string, 0, 1 and ? are allowed characters, but they don't have to be present.

Examples of beautiful strings:

1? - can be turned into 10, which is unstable
1?? - can be turned into 101, which is unstable
??? - can be turned into 010, which is unstable
01010 - can be turned into 01010, which is unstable
1 - can be turned into 1, which is unstable

Examples of strings which are not beautiful:
1001
1?0
11
00
*/
#include<stdio.h>
#include<string.h>

int chk(char* s, int n){
    for(int i = 0; i<n; i++){
        if(s[i] == '?' && s[i-1]!=s[i+1] && s[i-1]!='?' && s[i+1]!='?') return 0;
        else if 
    }
}
int main(){
    int test_case;
    scanf("%d", &test_case);
    while(test_case-- > 0){
        char s[200001];
        int ans = 0;
        scanf("%s", s);
        ans+= strlen(s);
        
    }
    return 0;
}
