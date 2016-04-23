object UseIceCream {
	def main(args : Array[String]) = {
		val iceCreamFlavour = (ic : IceCream) => ic match {
			case IceCream("VANILLA") => "It's Vanilla"
			case IceCream("CHOCOLATE") => "It's Chocolate"
			case IceCream("Strawberry") => "Yummm"
			case _ => "Unidentified flavour "+ic.flavour.toLowerCase
		}

		val ic1 = IceCream("Banana")
		val ic2 = IceCream("Strawberry")
		val ic3 = IceCream("CHOCOLATE")
		val ic4 = IceCream("Chocolate")

		println(iceCreamFlavour(ic1))
		println(iceCreamFlavour(ic2))
		println(iceCreamFlavour(ic3))
		println(iceCreamFlavour(ic4))
	}
}