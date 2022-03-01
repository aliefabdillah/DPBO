# contoh penggunaan simple inheritance di pyton
from matplotlib.pyplot import cla


class Person:
    def __init__(self, fname, lname):
        self.firstname = fname
        self.lastname = lname

    def printname(self):
        print(self.firstname, self.lastname)

# membuat person class sebagai object dan melakukan eksekusi method
x = Person("John", "Doe")
x.printname()

# class Student have a parent class person
class Student(Person):
    pass

student = Student("Budi", "Jayadi")
student.printname()