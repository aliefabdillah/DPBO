#include <iostream>
#include <string>
using namespace std;

template <class T>
class Titik
{
    private:
        int x;   //koordinat x
        int y;  //koordinat y
    public:
        Titik();
        Titik(int xp, int yp);

        int getX();
        void setX(int xp);
        int getY();
        void setY(int yp);

        ~Titik();
};