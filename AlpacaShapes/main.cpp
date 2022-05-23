//
// Created by wesleyou on 23/05/22.
//
#include <iostream>
#include <string>
#include <cmath>
using namespace std;

int main() {
    int s, r;
    scanf("%i" "%i", &s, &r);
    if (s*s > 3.14*r*r) {
        cout << "SQUARE";
    }
    else {
        cout << "CIRCLE";
    }
    return 0;
}
