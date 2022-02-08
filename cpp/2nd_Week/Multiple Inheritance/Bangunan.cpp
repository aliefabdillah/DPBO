#include <iostream>
#include <string>
using namespace std;

class Bangunan
{
    private:
        int kodeBangunan;
        string pemilikBangunan;
    public:
        Bangunan(){
        };

        void setKodeBangunan(int kodeBangunan){
            this->kodeBangunan = kodeBangunan;
        }

        void setPemilikiBangunan(string pemilikBangunan){
            this->pemilikBangunan = pemilikBangunan;
        }

        int getKodeBangunan(){
            return this->kodeBangunan;
        }

        string getPemilikiBangunan(){
            return this->pemilikBangunan;
        }
        
        ~Bangunan(){
        };
};