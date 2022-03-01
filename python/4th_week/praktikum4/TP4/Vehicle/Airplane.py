from Vehicle import Vehicle

class Airplane(Vehicle):
    # contructor
    def __init__(self):
        super().__init__()
        self.__age = 0              #age data in year
        self.__type = "(No Input)"
        self.__wingsLength = 0      # in meter
    
    # setter and getter
    def setDataPlane(self, paramType, paramAge, paramWingsLength, paramFuel, paramPassanger, ):
        self.setFuelType(paramFuel)
        self.setMaxPassanger(paramPassanger)
        self.__age = paramAge
        self.__type = paramType
        self.__wingsLength = paramWingsLength
        
    def getAge(self):
        return self.__age
    
    def getType(self):
        return self.__type
    
    def getWingsLength(self):
        return self.__wingsLength
    
    # print method
    def printDataPlane(self):
        print(f"Type                  : {self.getType()}")
        print(f"Age                   : {self.getAge()} Year")
        print(f"Wings Length          : {self.getWingsLength()}M")
        self.printDataVehicle()
        self.move(self.getType())
        print("----------------------------------------------")