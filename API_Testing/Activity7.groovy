package Activity

class Activity7 {
	
	static void main(args) {
		
		File file = new File("resources/sample.txt");
		file.createNewFile();
		
		file.write("A Quick Brown Fox Jumped Over The Lazy Cow\n")
		file.append("John Jimbo jingeled happily ever after\n")
		file.append("Th1\$ 1\$ v3ry c0nfus1ng")
		
		
		//Print the line that has Cow at the end of the line
		file.eachLine { line->
			if(line==~ /^A.*Cow$/) {
					println "Line that has Cow at the end is $line"
			} }
	  	//Print the line that start with capital letter 'J'
		file.eachLine { line->
			if(line==~ /^J.*/) {
				println "Line that start with capital letter 'J' is $line "
			} }
			
		//Print the line that has two numbers one after the other
		file.eachLine { line->
			if(line==~ /.*\d\d.*/) {	
				println "Line that has two numbers one after the other is $line"
			} }
		
		//Print the string(s) that match the pattern '\S+er'
		println "\n\nFind Operations:"
		
		def match1 = file.getText() =~ /\S+er/
		println "String(s) matching '/\\S+er/' are: ${match1.findAll()}"
		
		//Print the string(s) that match the pattern '\S*\d\W'
		
		def match2 = file.getText() =~ /\S*\d\W/
		println "String(s) matching '/\\S*\\d\\W/' are: ${match2.findAll()}"
		
		}
		
	}
	
