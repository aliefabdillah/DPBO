#include "Hardware.cpp"

// implementasi class memory dengan parent class hardware
class Memory: public Hardware
{
    //atribut private
    private:
        string frequency, memorySize, supportsCuda;
    public:
        // constructor
        Memory() {}

        /* set and get method */
        void setFrequency(string paramFrequency) {
            frequency = paramFrequency;
        }

        void setMemorySize(string paramMemorySize) {
            memorySize = paramMemorySize;
        }

        void setSupportsCuda(string paramSupportsCuda) {
            supportsCuda = paramSupportsCuda;
        }

        string getFrequency() {
            return frequency;
        }

        string getMemorySize() {
            return memorySize;
        }

        string isSupportsCuda() {
            return supportsCuda;
        }
        //destructor
        ~Memory() {}
};