package Activity

class Activity4 {
	
	static void main(def args) {
		
			def str = "This is a Groovy Language"
			
			def rev = str.reverse()
			println "Reverse String: " +rev
			
			def sub = str.substring(10)
			println "Sub String: " +sub
			
			def split = str.split("")
			println "Split String: " +split
			
			def minus = str.minus("Groovy")			
			println "String after removal: " +minus
			
			def lower = str.toLowerCase()			
			def upper = str.toUpperCase()
			
			println "Lower case string: " + lower
			println "Upper case string: " + upper
			
			def matchStatus = str.matches("(.*)Groovy(.*)")
			
			if(matchStatus) { println "String matches" }			
				def replaceWith = "very Groovy"
				println(str.replaceAll("Groovy", replaceWith))		
				println str
			
	}
	
}
