#include<iostream>
using namespace std;
int main(){
    int arr1[]={1,2,3,};
    int arr2[]={1,2,3,4};
    bool eqal=true;
    int n1=sizeof(arr1)/sizeof(arr1[0]);
    int n2=sizeof(arr2)/sizeof(arr2[0]);
    if(n1!=n2){
        eqal=false;
    }else{
    for(int i=0;i<n1;i++){
       if(arr1[i]!=arr2[i]){
        eqal=false;
        break;
       }
    }}
    if(eqal){
     cout<<"Array is euqal";
     }else{
      cout<<"Array is not euqal";
     }
     return 0;
}