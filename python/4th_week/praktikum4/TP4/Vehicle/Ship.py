from Vehicle import Vehicle

class Ship(Vehicle):
    # contructor
    def __init__(self):
        super().__init__()
        self.__age = 0          #age data in year
        self.__type = "(No Input)"
        self.__countryManufacture = "(No Input)"
    
    # setter and getter
    def setDataShip(self, paramType, paramAge, paramCountryManufacture, paramFuel, paramPassanger):
        self.setFuelType(paramFuel)
        self.setMaxPassanger(paramPassanger)
        self.__age = paramAge
        self.__type = paramType
        self.__countryManufacture = paramCountryManufacture
        
    def getAge(self):
        return self.__age
    
    def getType(self):
        return self.__type
    
    def getCountryManufacture(self):
        return self.__countryManufacture
    
    # print method
    def printDataShip(self):
        print(f"Type                  : {self.getType()}")
        print(f"Age                   : {self.getAge()} Year")
        print(f"Country Of Manufactur : {self.getCountryManufacture()}")
        self.printDataVehicle()
        self.move(self.getType())
        print("----------------------------------------------")
