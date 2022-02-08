#include <iostream>
#include <string>

class PersegiPanjang
{
    private:
        //atribut
        int panjang;
        int lebar;
    public:
        //constructor
        PersegiPanjang(){
            this->panjang = this->lebar = 0;
        }

        PersegiPanjang(int p, int l){
            this->lebar = l;
            this->panjang = p;
        }

        //method getter setter
        void setPanjang(int panjang){
            this->panjang = panjang;
        }

        void setLebar(int lebar){
            this->lebar = lebar;
        }

        int getPanjang(){
            return this->panjang;
        }

        int getLebar(){
            return this->lebar;
        }

        int keliling(){
            return 2*(this->panjang+this->lebar);
        }

        int luas(){
            return this->panjang * this->lebar;
        }

        //destructor
        ~PersegiPanjang(){}

};
