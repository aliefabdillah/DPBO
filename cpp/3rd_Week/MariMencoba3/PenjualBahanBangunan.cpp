#include "Manusia.cpp"
#include "TokoBangunan.cpp"

using namespace std;

class PenjualBahanBangunan: public Manusia, public TokoBangunan {
    private:
        string namaPenjual;

//    constructor
    public:
        PenjualBahanBangunan(){}

    //    set and get method
        string getNamaPenjual() {
            return namaPenjual;
        }

        void setNamaPenjual(string namaPenjual) {
            this->namaPenjual = namaPenjual;
        }

        ~PenjualBahanBangunan(){};
};
