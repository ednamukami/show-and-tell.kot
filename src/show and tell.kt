fun main (){
    modulus()
    country()
    grace("edna")
    grace("jackline")
    var y=Student("Edna","Guinevere","ednnagee@gmail.com","0742666917","graceful")
    println(y.firstname)
    println(y.lastname)
    var c=Car("911","Carrera 4S","Sleek black",4)
    c.identity()
    c.identity()
    var f=van("toyota","Ford trancit","golden grey",10)
    f.identity()
    var x=String
        val myString= "Hello Everyone"
        val result = myString.removeFirstLastChar()
        println("First character is: $result")
    }
//Operators
fun modulus(){
    val a=10
    val b=3
    val modulus=a%b
    println(modulus)
}
//the other operators used in Kotlin are add(+),subtract(-),multiply(*)

//datatypes

fun country() {
    var city = arrayOf("harare", "mumbai", "dodoma", "jarkata")
    println(city[0].capitalize() + "," + city[1].capitalize() + "," + city[2].capitalize() + "," + city[3].capitalize())
    var c=Car("911","Carrera 4S","Sleek black",4)
    c.identity()
}
//other datatypes include Numbers(Int,long,double,short,float,bytes),characters(strings and char),Booleans and arrays
//The types of variables are mutable(var) and immutable(val)

fun grace(name: String){
    if(name=="edna"){
        println("I am joyous!")
    }
    else{
        println("i don't know who that is")
    }}

data class Student(var firstname:String,var lastname:String,var email:String,var phonenumber:String,var password:String)
//the classes hold functions inside them except the data class

//Inheritance
class Car( make:String, model:String,colour:String, capacity:Int):vihicle(make, model, colour, capacity){}
open class vihicle( var make:String,var model:String, var colour:String, var capacity:Int){
    fun identity(){
        println("I am a $make $model $colour  porsche")
    }
}
class van(make: String,model: String,colour: String,capacity: Int):vihicle(make, model, colour, capacity){

}
fun String.removeFirstLastChar(): String =  this.substring(1, this.length - 1)



