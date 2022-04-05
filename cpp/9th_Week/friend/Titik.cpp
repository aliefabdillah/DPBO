#include <iostream>
#include <string>

class Titik3D;
class Titik
{
private:
    int x;
    int y;
public:
    Titik() {}
    Titik(int xp, int yp) {
        x = xp;
        y = yp;
    }

    void setX(int xp){
        x = xp;
    }

    void setY(int yp){
        y = yp;
    }

    // fungsi friend
    friend void tampilTitik(Titik t1, Titik3D t2);

    ~Titik() {}
};