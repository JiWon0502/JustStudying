#include<iostream>
using namespace std;
//std::cin>>[변수]
//std::cout<<[출력할 값]
int main(){
    cin.tie(NULL);
    ios_base::sync_with_stdio(false);

    int a,b,n;
    cin >> n;
    for(int i = 0; i<n; i++){
        cin >> a >> b;
        cout << a+b << '\n';
    }
    return 0;
}
