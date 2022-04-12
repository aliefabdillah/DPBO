#include <iostream>
#include <string>

using namespace std;

namespace exception
{
    struct error
    {
        const char *p;
        error (const char *q){
            p = q;
        }
    };
} // namespace exception


class Eksepsi
{
private:

public:
    Eksepsi(/* args */) {}

    void eksepsiThrowStandar(int kode){
        if (kode < 1){
            throw exception::error("Error Code");
        }
    }

    void eksepsiThrowSendiri(int kode){
        if(kode < 1){
            throw exception::error("Error");
        }
    }

    void eksepsiThrowIndexOutOfBounds(int jumlah, int index, int nilai, int *tab){
        if((jumlah-1) < index){
            throw exception::error("array index out of bounds");
        }
        else
        {
            (*tab) = nilai;
        }
        
    }
    
    ~Eksepsi() {}
};