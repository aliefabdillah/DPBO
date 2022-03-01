# class person
class Person:
    # contructor
    def __init__(self):
        self.__nik = "(No Input)"
        self.__name = "(No Input)"
        self.__gender = "(No Input)"
    
    # setter and getter of atribute
    def setDataPerson(self, paramNik, paramName, paramGender):
        self.__nik = paramNik
        self.__name = paramName
        self.__gender = paramGender
    
    def getNik(self):
        return self.__nik
    
    def getName(self):
        return self.__name
    
    def getGender(self):
        return self.__gender

    # sleep method
    def sleep(self, paramInput, paramMode):
        if paramMode == "sleep":
            print(f"the {paramInput} is sleep....")
        else:
            print(f"the {paramInput} isn't sleep.....")
    
    # print method
    def printDataPerson(self):
        print(f"NIK           : {self.getNik()}")
        print(f"Name          : {self.getName()}")
        print(f"Gender        : {self.getGender()}")
