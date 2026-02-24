#include<iostream>
using namespace std;
//find maximam in two array
int main(){
  int arr1[]={2,6,8};
  int arr2[]={3,4,9};
  int max1=arr1[0];
  for(int i=0;i<3;i++){
    if(arr1[i]>max1){
      max1=arr1[i];
    }
  }
  int max2=arr2[0];
  for(int i=0;i<3;i++){
    if(arr2[i]>max2){
     max2=arr2[i];
     
    }
  }

  if(max1>max2){
    cout<<max1;
  }else{
    cout<<max2;
  }
}