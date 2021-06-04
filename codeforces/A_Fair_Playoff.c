/*
Four players participate in the playoff tournament. The tournament is held according to the following scheme: the first player will play with the second, and the third player with the fourth, then the winners of the pairs will play in the finals of the tournament.

It is known that in a match between two players, the one whose skill is greater will win. The skill of the 𝑖-th player is equal to 𝑠𝑖 and all skill levels are pairwise different (i. e. there are no two identical values in the array 𝑠).

The tournament is called fair if the two players with the highest skills meet in the finals.

Determine whether the given tournament is fair.

Input
The first line contains a single integer 𝑡 (1≤𝑡≤104) — the number of test cases.

A single line of test case contains four integers 𝑠1,𝑠2,𝑠3,𝑠4 (1≤𝑠𝑖≤100) — skill of the players. It is guaranteed that all the numbers in the array are different.

Output
For each testcase, output YES if the tournament is fair, or NO otherwise.
*/
#include<stdio.h>

int main(){
    int test_case;
    scanf("%d", &test_case);
    while(test_case-->0){
        int s[5], win1, win2, ans = 0;
        scanf("%d %d %d %d", &s[0], &s[1], &s[2], &s[3]);
        win1 = s[0]>s[1] ? s[0] : s[1];
        win2 = s[2]>s[3] ? s[2] : s[3];
        for(int i =0; i<4;i++){
            if(win1>s[i]) ans++;
            if(win2>s[i]) ans++;
        }
        if(ans == 5) printf("YES\n");
        else printf("NO\n");
    } 
    return 0;
}
