package Activity

class Activity6 {
	
	static void main(args) {
	def map =[:]
	
	map.put(1, "Java")
	map.put(2, "SQL")
	map.put(3, "Python")
	
	for(def item:map) {		
		
		println item
		}
	
	def newmap = map.plus([4: "API", 5: "Selenium"])
	println newmap
	println newmap.values().sort()
	}
}
