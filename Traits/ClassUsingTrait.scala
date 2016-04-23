object ClassUsingTrait {
	def main(args : Array[String]) = {
		sayHello()
		anotherTraitMethod("Kevin")
		myTraitMethod(12)
	}

	def myTraitMethod(num1 : Int) = {
		println(num1)
	}

}