/*큐브러버의 호텔에 예약을 한 사람의 수는 N명이고, 각 사람이 투숙 시작일과 종료일을 모두 알고 있다. 
모든 사람은 투숙 시작일의 오전 9시에 호텔에 투숙하고, 투숙 종료일의 오후 6시에 호텔에서 나간다. 
이 호텔에는 모든 것이 있기 때문에, 호텔 투숙객은 호텔을 벗어나지 않는다.

탭파와 공백파가 만나면 싸운다. 하지만, 탭파와 공백파의 수가 일치하는 날에는 균형이 잡혀서 싸움이 일어나지 않는다. 
탭파가 한 명도 없거나 공백파가 한 명도 없으면 호텔 관리자들끼리 왜 호텔 운영을 이런 식으로 하냐며 서로 책임을 돌리면서 싸운다.

호텔 예약 정보가 주어졌을 때, 여러가지 정보를 구해보려고 한다.

입력
첫째 줄에 예약을 한 사람의 수 N(1 ≤ N ≤ 5,000)이 주어진다. 둘째 줄부터 호텔 예약 정보가 한 줄에 하나씩 주어진다.

호텔 예약 정보는 문자 c와 정수 s, e로 이루어져 있다. c가 'T'인 경우는 탭파, 'S'인 경우는 공백파이다. s는 투숙 시작일, e는 투숙 종료일이다. (1 ≤ s ≤ e ≤ 366)

출력
다음 정보를 한 줄에 하나씩 출력한다.

투숙객이 1명 이상인 날의 수
가장 많은 투숙객이 있었던 날에 투숙한 사람의 수
싸움이 없는 날의 수
싸움이 없는 날 중 가장 많은 투숙객이 있었던 날에 투숙한 사람의 수. 싸움이 없는 날이 없으면 0을 출력한다.
가장 오랜 기간 투숙한 사람이 투숙한 날의 수*/
#include<stdio.h>
struct days{
    int t;
    int s;
};

int main(){
    int N, s, e, max_non=0;
    char c;
    int num[5]= {0,0,0,0,0};/*0 num에 순서대로 1명이상/1 사람수/2 싸움x날수/3 싸움X중 많은 투숙객 수/4 오랜 투숙 날수*/
    scanf("%d", &N);
    struct days day[370];
    for(int i = 0; i<370; i++){
        day[i].s = 0;
        day[i].t = 0;
    }
    
    while(N-->0){
        scanf(" %c %d %d",&c, &s, &e);
        
        if((e-s+1) > num[4]) num[4] = e-s+1;
        
        if(c == 'T'){
            for(int j = s; j<=e; j++)
                day[j].t++;
        }
        else  { 
            for(int j = s; j<=e; j++)
                day[j].s++;
        }
    }

    for(int i = 1; i<367; i++){
        if((day[i].s+ day[i].t)>= 1) num[0]++;
        if((day[i].s+ day[i].t)>= num[1]) num[1] = (day[i].s+ day[i].t);
        if(day[i].s == day[i].t && day[i].t!=0) {
            num[2]++;
            if((day[i].t+day[i].s)>(day[max_non].s+day[max_non].t))
                max_non = i;
        }
    }
    num[3] = day[max_non].s+day[max_non].t;
    for(int i = 0; i<5; i++) printf("%d\n", num[i]);
}