package Activity

class Activity1 {
	
	static void main(args) {
	
	def x
	int y
	
	def val = [20, 100.23, "Verma", false, x, y]
	
	val.each { println "Variable in the array: " +it+" Data Type of Variable: "+it.getClass() }	
	
	}
	
}
