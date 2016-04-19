// Constrcutor is defined immediately after the name of the class along with any args
// If we want a field created from the args simply prefix the arg name with val (immutable) and compiler will create us a getter method as well
// Swap val for var if field need to be editable and compiler will generate a setter method
class ConstrcutorTest(val message_ : String) {
	// Below is another way of defining a field but the above performs the same function for less code
	//def message : String = message_;
	def add(a : Int, b : Int) = a+b
}

val ct = new ConstrcutorTest("Addition class")
// Reference the field in the object - this call gives us the value of the message_ field
println(ct.message_)
println(ct.add(7, 7))
