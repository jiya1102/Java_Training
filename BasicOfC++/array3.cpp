#include<iostream>
using namespace std; 
int main(){
    //comman element in two array
    int arr[]={1,2,3,4 };
    int arr2[]={3,4,5};

    for(int i=0;i<4;i++){
     for(int j=0;j<3;j++){
      if(arr[i]==arr2[j]){
        cout<<"common element:"<<arr[i]<<endl;
      }
     }
    }

}