#include<iostream>
using namespace std;
int main(){
    int a=2;
    if((a&1)==0){
        cout<<a<< " even";
    }else{
        cout<<a <<"odd";
    }
    return 0;
}