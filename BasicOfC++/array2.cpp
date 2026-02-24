#include<iostream>
using namespace std;
int main(){
    //merge two array
    int arr1[]={1,2,3};
    int arr2[]={5,6,4};
    int n1=sizeof(arr1)/sizeof(arr1[0]);
    int n2=sizeof(arr2)/sizeof(arr2[0]);
    int merge[10];
    for(int i=0;i<n1;i++){
      merge[i]=arr1[i];
    }
    for(int i=0;i<n2;i++){
     merge[n1+i]=arr2[i]; 
    }
    for(int i=0;i<n1+n2;i++){
        cout<<merge[i]<<" ";
    }
   
}