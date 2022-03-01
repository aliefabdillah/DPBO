class Vehicle:
    # constructor
    def __init__(self):
        self.__fuelType = "(No Input)"
        self.__maxPassenger = 0
    
    # setter and getter
    def setFuelType(self, paramFuel):
        self.__fuelType = paramFuel
    
    def getFuelType(self):
        return self.__fuelType
    
    def setMaxPassanger(self, paramPassanger):
        self.__maxPassenger = paramPassanger
    
    def getMaxPassanger(self):
        return self.__maxPassenger
    
    # move method
    def move(self, vehicleType):
        print(f"The {vehicleType} has move.......")
    
    # print data
    def printDataVehicle(self):
        print(f"Fuel Type             : {self.getFuelType()}")
        print(f"Max Passanger         : {self.getMaxPassanger()}")
    
