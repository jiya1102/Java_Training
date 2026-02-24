#include<iostream>
using namespace std;
// sum of two array
int main(){
    int arr1[]={1,2,3};
    int arr2[]={4,5,6};
    int sum[10];
        for(int i=0;i<3;i++){
         sum[i]=arr1[i]+arr2[i];
         cout<<"sum is "<<sum[i]<<endl;
    }
}