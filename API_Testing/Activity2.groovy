package Activity

class Activity2 {
	
	static void main(args) {
		
		def marks =[60, 78, 99, 85, 89]
		
		def sum =0, avg=0
		def grade ="F"
		
		marks.each { sum+=it }
		avg=sum/marks.size() as Integer
		
		switch(avg){
			case 90..100:
				grade = "A"
				break
			case 80..89:
				grade = "B"
				break
			case 70..79:	
				grade = "C"
				break
			case 50..69:
				grade = "D"
				break
			case 0..49:
				grade = "F"
				break
			default:
				println "invalid"
						
		}
		
		println "Maximum Marks" +marks.max()
		println "Minimum Marks" +marks.min()
		println "Avg grade" +avg
		println "Grade: " +grade
				
				
	}
}
