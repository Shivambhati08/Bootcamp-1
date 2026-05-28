#include<stdio.h>
#include<string.h>
int palindrome(char str[], int start, int last){
    if(start >= last)
    return 1;
    if(str[start] != str[last])
    return 0;
    palindrome(str, start + 1, last -1);
}
int main(){
    char String[] = "naman";
    int len = strlen(String);
    if(palindrome(String, 0, len -1))
    printf("palindrome");
    else 
    printf("Not a palindrome");
    return 0;
}