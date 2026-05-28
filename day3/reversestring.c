#include<stdio.h>
void reverse(char arr[], int i){
    if(arr[i] == '\0') return;
    reverse(arr, i+1);
    printf("%c", arr[i]);
}
int main(){
    char str[] = "shivam Thakur";
    reverse(str, 0);
    return 0;
}