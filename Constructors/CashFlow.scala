class CashFlow(amt : Double, curr : String) {
	def this(amt : Double) = this(amt, "GBP")
	def this(curr : Double) = this(0, curr)

	def amount = amt
	def currency = curr
}