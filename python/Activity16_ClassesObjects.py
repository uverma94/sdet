class Car:	
    'This class represents a car'
		
    def __init__(self, manufacturer, model, make, transmission, color):	
        self.manufacturer = manufacturer	
        self.model = model	
        self.make = make	
        self.transmission = transmission	
        self.color = color 
	
    def accelerate(self):	
        print(self.manufacturer + " " + self.model + " has started moving")
		
    def stop(self):	
        print(self.manufacturer + " " + self.model + " has stopped moving")
	
 	
car1 = Car("Lemozin", "XYZ", "2000", "Manual", "Yellow")	
car2 = Car("Lamborgini", "ASQ", "2010", "Automatic", "Green")	
car3 = Car("ALto", "Desire", "2020", "Automatic", "Red")
 
	
car1.accelerate()	
car1.stop()