from Job import Job
from Person import Person

class Driver(Job, Person):
    # constructor
    def __init__(self):
        super().__init__()
        self.__lisenseID = "(No Input)"
        self.__activeUntil = 0
        self.__vehicleType = "(No Input)"

    # set and get method for atribute
    def setDataDriver(self, paramLisense,  paramActiveUntil, paramVehicleType):
        self.__lisenseID = paramLisense
        self.__activeUntil = paramActiveUntil
        self.__vehicleType = paramVehicleType
        
    def getLisenseId(self):
        return self.__lisenseID
    
    def getActiveUntil(self):
        return self.__activeUntil
    
    def getVehicleType(self):
        return self.__vehicleType

    # print data
    def printDataDriver(self):
        self.printDataPerson()
        self.printDataJob()
        print(f"Lisense ID    : {self.getLisenseId()}")
        print(f"Active Untill : {self.getActiveUntil()}")
        print(f"Vehicle Type  : {self.getVehicleType()}")
        self.sleep(self.getPosition(), "Not Sleep")
        print("---------------------------------------")
