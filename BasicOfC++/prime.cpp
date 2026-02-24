#include<iostream>
using namespace std;
int main(){
    //find prime number
    int x=6;
    bool prime=true;
    for(int i=2;i<x;i++){
      if(x%i==0){
        prime=false;
      }
    }
    if(prime){
        cout<<"number is prime";
    }else{
        cout<<"number is not prime";
    }

}