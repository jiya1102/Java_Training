#include<iostream>
using namespace std;
int main(){
    int num=123;
    int temp=num;
    int rev=0;
    int sum =0;
    while(num>0){
        rev=rev *10+(num%10);
        num=num/10;

    }
    if(rev==temp){
        cout<<"number is palindrome";
       }else{
        cout<<"number is not palindrome";
       }
       return 0;
}