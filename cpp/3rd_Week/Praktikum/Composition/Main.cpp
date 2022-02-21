#include <bits/stdc++.h>
#include <string>

using namespace std;

#include "Birthday.cpp"
#include "Person.cpp"

int main()
{
    // buat objek birthday terlebih dahulu
    Birthday bDayDate(17, 8, 1945);

    // buat objek person lalu masukan objek birthday 
    Person anyPerson("Lord Fred", bDayDate);

    anyPerson.printPerson();
    return 0;
}
