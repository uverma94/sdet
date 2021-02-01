package Activity

class Activity5 {
	
	static void main(args) {
		
		def list = [11, 2, 19, 5, "Mango", "Apple", "Watermelon"]
		
		def strlist = list.minus([11, 2, 19, 5])
		def intlist = list.minus(["Mango", "Apple", "Watermelon"])
		
		println "String List : ${strlist.sort()}"
		println "Integer List : ${intlist.sort()}"
		
	}
	
	
}
