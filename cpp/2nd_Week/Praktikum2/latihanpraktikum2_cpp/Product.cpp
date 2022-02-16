#include <iostream>
#include <string>
using namespace std;

// parent class
class Product{
    // implementasi class Product
    private:
        long price;             //atribut price dengan tipe data long
        string idProduct;       //atribut idProduct dengan tipe data string
    public:
        //constructor       
        Product(){}
        
        /* set dan get method dari atribut */
        void setPrice(long paramPrice){
            price = paramPrice;
        }

        void setIdProduct(string paramIdProduct){
            idProduct = paramIdProduct;
        }

        long getPrice(){
            return price;
        }

        string getIdProduct(){
            return idProduct;
        }

        ~Product(){}
};