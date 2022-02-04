#include <iostream>
#include <string>

using namespace std;

class Titik
{
    /* Class yang digunakan untuk mengimplementasikan sebuah tipe titik */
    private:
        int x;      //koordinat x
        int y;      //koordinat y
    public:
    //Constructor
    Titik(){
        //di set 0 karena tidak ada parameter
        x = 0;
        y = 0;
    }

    //constructor dengan parameter
    Titik(int xp, int yp){
        x = xp;
        y = yp;
    }

    //fungsi set
   void setX(int xp){
        //mengset koordinat x
        x = xp;
    }

    void setY(int yp){
        //set koordinat y
        y = yp;
    }
    
    // fungsi get
    int getX(){
        return x;
    }

    int getY(){
        return y;
    }

    //destructor
    ~Titik(){
    }
};
