#include <stdio.h>
// #include<search.h>
int gcdExtended(int a, int b, int c){
    int x = 0, lastx = 1 ,y = 1, lasty = 0, temp,gcd; 
    while(b != 0){
        temp = x;
        x = lastx - ((a/b)*x);
        lastx = temp;

        temp = y;
        y = lasty -((a/b)*y);
        lasty = temp;

        int r = a%b;
        if(r != 0)
        gcd = r;

        a = b;
        b = r;
    }

    lastx = lastx*(c/gcd);
    lasty = lasty*(c/gcd);

    printf("x is %d, y is %d", lastx, lasty);
}

int main()
{
    int a , b, c;
    printf("Enter value of a: ");
    scanf("%d", &a);
    printf("Enter value of b: ");
    scanf("%d", &b);
    printf("Enter value of c: ");
    scanf("%d", &c);
    gcdExtended(a,b,c);       
    return 0;
}