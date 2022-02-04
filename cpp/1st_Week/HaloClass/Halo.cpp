#include <iostream>
#include <string>

using namespace std;

class Halo
{
    private:
        string kata;
    public:
        Halo(){
            kata = "Halo Dunia";
        }
        
        void tulis(){
            cout << kata << endl;
        }

        ~Halo(){
        }
};
