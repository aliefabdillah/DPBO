from Robot import Robot
from PhysicanRobot import PhysicanRobot

x = Robot("Martin")
y = PhysicanRobot("Jane")

print(x, type(x))
print(y, type(y))

y.sayHi()