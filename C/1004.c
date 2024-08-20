#include<stdio.h>
  	//출발점/도착점이 원 안에 있는 경우 +1
int main(){
	int T, x1, y1, x2, y2, n;
	scanf("%d", &T);
	for(int j=0;j<T; j++){
		int answer = 0;
		scanf("%d %d %d %d", &x1, &y1, &x2, &y2);
    	scanf("%d", &n);
    	for(int i = 0; i<n; i++){
			int x, y, r;
    		scanf("%d %d %d", &x, &y, &r);
    		if(((x1-x)*(x1-x)+(y1-y)*(y1-y)) <  r*r && ((x2-x)*(x2-x)+(y2-y)*(y2-y)) <  r*r){}
    		else if(((x1-x)*(x1-x)+(y1-y)*(y1-y)) <  r*r || ((x2-x)*(x2-x)+(y2-y)*(y2-y)) <  r*r) {
					answer++;
			}
		}
		printf("%d\n", answer);
	}
}
