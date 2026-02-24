#include<iostream>
using namespace std;

int main(){
    //find unique element in both array
    int arr[]={1,2,3,5};
    int arr2[]={2,3,4};

    int n1=4;
    int n2=3;

    for(int i=0;i<n1;i++){
        bool found=false;

        for(int j=0;j<n2;j++){
            if(arr[i]==arr2[j]){
                found=true;
                break;
            }
        }
         if(!found){
            cout<<"Unique element: "<<arr[i]<<endl;
        }
    }

    for(int i=0;i<n2;i++){
        bool found=false;

        for(int j=0;j<n1;j++){
            if(arr2[i]==arr[j]){
                found=true;
                break;
            }
        }

        if(!found){
            cout<<"unique element:"<<arr2[i];
        }
    }
}