object Loops {
	def main(args : Array[String]) = {
		var i = 0
		// while loop
		while(i < 10) {
			println("Hello from "+i)
			i = i + 1
		}

		// for loop
		for(i <- 12 to 15) {
			println("For loop index "+i)
		}

		// for loop with conditional statement
		for(i <- 10 to 20 if i%2 == 0) {
			println(i+" is an even number")
		}
	}	
}
