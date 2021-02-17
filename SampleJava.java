//John Ryan - Java Notes - Building Classes 

//02/05/2021


// #COMMENTS

/* single line cooments use // */

//I am a single line comment!

// Multi-line comments are created by starting with /* and ending in */

/*
And I am a multi-line comment!
*/

// # main() Method

/* In java, every application must contain a main() method, which is the entry point for application. All other methods are invoked from the main() method.
The signature of the method is:  */

public static void main(String[] args) {
	
}

//It accepts a single argument: an array of elements of type String.

// #PRINT LINE

System.out.println() //can print to the console:

// - System is a class from the core liberary provided by Java.
// - Out is an object that controls the output
// - println() is a method associated with that object that recieves a single argument.

// #CLASSES

/* A class represents a single concept.
A Java program must have one class whose name is the same as the program filename.
In the example, the Person class must be declared in a program file Person.java */

public class Person {
	public static void main(String[] args) {

		System.out.println("I am a person, not a computer.");
	}
}

//# COMPILING JAVA

/* In java, when we compile a program, each individual class is converted into a .class file,
which is known as byte code. */

//The JVM(Java virtual machine) is used to run the byte code. */

// #Statements

/* In java, a statement is a line of code that executes a task and is terminated with a ;.*/


//#boolean Data Type

// In java, the boolean primitive data type used to store a value, which can be either true or false.
boolean result = true;
boolean isMarried = false


/*#Strings
A string in java is a Object that holds multiple characters, 
It is not not a primitive datatype.
A String can be created by placing characters between a pair of double quotes(")*/

String name = "Bob"
System.out.println(name.equals('Dave'));


/* To compare Strings, the equals() method must be used instead of the primitive equality comparator ==.

# int Data Type */

//In Java, the int datatype is used to store integer values. This means that it can store all positive
//and negative whole numbers and zero.

int num1 = 10;
int num2 = -5;
int num3 = 0;

//# char Data Type

//In java, char is used to store a single character. The character must be enclosed in single quotes.

char answer = 'y';


//#Primitive Data Types
//Javas most basic data types are called primitive data types and are in the system by default
//the available types are as follows;
int
char
boolean
byte
long
short
double
float

null //is another, but it can only ever store the value of null.

// #Final Keyword 

//the value of a variable cannot be changed if the variable was declared using the 
final //keyword.

/*Note the variable must be given a value when it is declared as*/ final. 
final //variables cannot be changed.

//value cannot be changed:
final double PI = 3.14;

//#double Data Type
//The double primitive type is used to hold decimal values.

double PI = 3.14;
double price = 5.75;

//# Math Operations

//Basic math operations can be applied to 
int, double 
//and
float
//data types:
+ //addition
- substraction
* multiplication
/ division
% mudulo //(yeilds Remainder)

int a = 20;
int b = 15;

int result;
result = a + b; //30
result = a - b; //10
result = a * b; //200
result = a / b; //2
result = a % b; //0

int a = 5;
int b = 3;
boolean result = a > b;

//# Comparison Operators

>
<
>= 
<=
==
!=


//# Comparison Operaters
//can be used to compare two values:

int number = 5;

number +=3; //Value is now 8
number -= 4; // Value is now 4
number *=6; //Value is now 24
number /=2; //Value is now 12
number %= 7; // Value is now 5

int numApples = 5;
numApples++; //Value is now 6

int numOranges = 5;
numOranges--; // Value is now 4



------------------------------------
//#Clases

public class Car{

/* Here we declare fields inside the class by specifying the type and name*/
String color;
Double price;
int length;

public Car() {
	/* instructions for creating a Car instance.This is the constructor 
	method that shows instance feilds in scope.  In order to assign a value to an instance variable, 
	we need to alter our constructor method to include parameters so that it can 
	access the data we want to assign to an instance.*/

}

public static void main(String[] args) {
	//Invokes the constructor above. To create an instance, we need to call or 
	//invoke the constructor within main(). 
	//The following example assigns a Car instance to the variable ferrari:
	Car ferrari = new Car(); //instance of class Car
	Car ford = new Car(); //instance of class Car
	System.out.println(ferrari); //print instance 
	System.out.println(ford); //print instance

	}
}

/* # progression to Constructor Parameters
When a srtring value gets passed into Car(), it is assigned to the parameter carColor.
then, inside the constructor, carColor will be assigned 
as the value to the instance variable color. */

public class Car {
	String color;
	// Constructor method with a parameter below
	public Car(String carColor) {
		//parameter value assigned to the field
		color = carColor;
	}
	public static void main(String[] args) {
		// program tasks are here.

	}
}

/* Our method also has a signature which defines the name and parameters of the method.
in the above the signature is */
Car(String carColor)

/* there are two trypes of parameters 1. Formal & 2. Actual:
1. Formal: specifies the type and name of data that can be passed into the method.
In the example above */
String carColor // is a formal parameter carColor will represent whatever String value is 
//passed into the constructor.

/* In Java, because of constructor overloading, a class can have multiple constructors 
as long as they different parameter values. The signature is useful in that 
it helps the compiler differentiate between the different methods. For example: */

public class Car {
	String color;
	int mpg;
	boolean isElectric;

	// constructor 1
	public Car(String carColor, int milesPerGallon) {
		color = carColor;
		mpg = milesPerGallon;
	}

	//Constructor 2
	public Car(boolean electricCar, int milesPerGallon) {
		electricCar = isElectric;
		mpg = milesPerGallon;
	}
}


/* In the example above, there are two constructors. 
When we initialize an object, the compiler will know which constructor 
to use because of the value we pass into it. For example, */

Car myCar = new Car(true, 40)

/* will be be created by the second constructor because the arguments match the type and order
of the second constructors signature.

If we do not define a constructor, the java compiler will 
generate a default constructor that contains no arguments and assigns 
the object default values. Default values can be created by assigning values to the 
instance fields during thier declaration:


/* Assigning Values to Instance Fields

Now that our constructor has a parameter, we must pass values into the method call. 
These values are referred to as arguments; Once they are passed in, they will be used 
to give the instance fields initial value.

Here we create an instance, ferrai, in the main() method with "red" as its color field: */

public class Car {
	String color;
//Constructor below
	public Car(String carColor) {
		//assign parameter value to instance field
		color = carColor; 

	}
	public static void main(String[] arg) {
		//value supplied when calling constructor
		Car ferrari = new Car("red");
	}
}

/* We pass the string value "red" to our constructor method call: */

new Car("red"); // the type of value given must match type declared by parameter.

/* Inside the constructor, the parameter carColor refers to the value 
passed in during the invocation: "red". This value is assigned to the instance field color.

the object, ferrari, holds the state of color as an instance field referencing value "red".
we access the value of this field with the dot operator (.):

/*
accessing a field:
objectName.fieldName
*/
 
ferrari.color;
// "red"


/* # Multiple Fields
Objects are not limited to a single instance field. 
We can declare as many fields as are necessary for the requirements of our program.

lets change Car instances so they have multiple feilds.

We'll add boolean isRunning, that indicates the car engine is on and an int velocity, 
that indicates the speed the car is travelling. */


public class Car {
	String color;
	//new fields below
	boolean isRunning;
	int velocity;

// new parameters that correspond to the new fields
	public Car(String carColor, boolean carRunning, int milesPerHour) {
		color = carColor;
		// assign new parmeters for new fields added
		isRunning = carRunning;
		velocity = milesPerHour;
	}
	public static void main(String[] args) {
		//new values passed into the method call
		Car ferrari = new Car("red", true, 27);
		Car renault = new Car("blue", false, 70);

		System.out.println(renault.isRunning);
		//false
		System.out.println(ferrari.velocity);
		//27
	
	}
}

/* ordering matters! we must pass values into the constructor invocation in the 
same order that they are listed in the parameters. */

// values match types, no error
Car honda = new Car("green", false, 0);
 
// values do not match types, error!
Car junker = new Car(true, 42, "brown");

























