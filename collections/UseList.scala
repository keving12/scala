object UseList {
	def main(args : Array[String]) = {
		var x = 1::2::3::4::5
		for(i <- 0 to x.length-1) { println(x(i)) }
	}
}