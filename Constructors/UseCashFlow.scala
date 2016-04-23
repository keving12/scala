object UseCashFlow {
	def main(args : Array[String]) = {
		val wages = new CashFlow(2000)
		println(wages.amount)	// Should print 2000
		println(wages.currency) // Should print GBP
		val wages2 = new CashFlow("USD")
		println(wages.amount)	// Should print 0
		println(wages.currency)	// Should print USD
	}
}