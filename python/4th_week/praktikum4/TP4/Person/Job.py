class Job:
    # constructor
    def __init__(self):
        self.__nip = "(No Input)"
        self.__companyName = "(No Input)"
        self.__position = "(No Input)"
    
    # setter and getter of atribut
    def setDataJob(self, paramNip, paramCompanyName, paramPosition):
        self.__nip = paramNip
        self.__companyName = paramCompanyName
        self.__position = paramPosition
        
    def getNip(self):
        return self.__nip
    
    def getCompanyName(self):
        return self.__companyName
    
    def getPosition(self):
        return self.__position

    # print method
    def printDataJob(self):
        print(f"NIP           : {self.getNip()}")
        print(f"Company Name  : {self.getCompanyName()}")
        print(f"Position      : {self.getPosition()}")
