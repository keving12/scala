object NestedMethodTest {
	def main(args : Array[String]) {
		for(i <- i to 10) {
			printEven(i)
		}
	}

	// This is effectively a helper method but limited to the scope of the main method
	// No need to define a method that is visible to other methods in the same class as in Java
	def printEven(i : Int) = {
		if(i%2 == 0) {
			println(i + " is an even number")
		}
	}
}