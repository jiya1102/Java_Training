#include<iostream>
using namespace std;
int main(){
    //copy one array into anathor
    int arr[]={2,4,6};
    int copy[10];

    for(int i=0;i<3;i++){
        copy[i]=arr[i];
        cout<<copy[i]<<" ";
    }
    
}