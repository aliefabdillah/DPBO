# example of hierarchical inheritance
class Details:
    def __init__(self):
        self.__id = "<No Id>"
        self.__name = "<No Name>"
        self.__gender = "<No Gender>"
    
    def setData(self, id, name, gender):
        self.__id = id
        self.__name = name
        self.__gender = gender
    
    def showData(self):
        print("Id : ", self.__id)
        print("Name : ", self.__name)
        print("Gender : ", self.__gender)

# employee class have parent class details
class Employee(Details):
    def __init__(self):
        super().__init__()
        self.__company="<No Company>"
        self.__dept="<No Dept>"
    
    def setEmployee(self, id, name, gender, comp, dept):
        self.setData(id, name, gender)
        self.__company = comp
        self.__dept = dept
    
    def showEmployee(self):
        self.showData()
        print("Company : ", self.__company)
        print("Departement : ", self.__dept)

def main():
    print("Details Object")
    e = Details()
    e.setData(1, "Putang Ina", "Male")
    e.showData()

    print("\nEmployee Object")
    e = Employee()
    e.setEmployee(1, "Prem Sharma", "Male", "gmr", "excavation")
    e.showEmployee()

if __name__ =="__main__":
    main()
    