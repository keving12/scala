
abstract class Greeter {
	// message is unassigned so is an abstract field and should be overridden by any subclasses or compilation fails
	val message : String
	// antotherMessage has a value so will be inherited by all subclasses so can be used without making any changes in subclasses
	val anotherMessage = "A Message for all"
	// sayHi Method is not implemented here so is an abstract method and will need to be implemented by subclasses or compilation fails
	def sayHi()
}

class SpanishGreeter extends Greeter {
	val message = "Que Pasa Homes!"
	def sayHi() = {
		println(message)
		println(anotherMessage)
	}
}

class EnglishGreeter extends Greeter {
	val message = "Hello chaps!"
	def sayHi() = {
		println(message)
		println(anotherMessage)
	}
}

val greeter = new SpanishGreeter()
greeter.sayHi();

val anotherGreeter = new EnglishGreeter()
anotherGreeter.sayHi(); 