#include "Product.cpp"

// child class dengan parent class Product
//implementasi class hardware
class Hardware: public Product
{
    private:
        string brand, model;        //atribut private dengan tipe data string       
    public:
        // constructor
        Hardware() {}

        /* set and get method */
        void setBrand(string paramBrand) {      //set brand method
            brand = paramBrand;
        }

        void setModel(string paramModel) {      //set model method
            model = paramModel;
        }

        string getBrand() {                 //get brand method
            return brand;
        }

        string getModel() {                 // get model method
            return model;
        }

        // destructor
        ~Hardware() {}
};