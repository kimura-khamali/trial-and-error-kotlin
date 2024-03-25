import kotlin.reflect.KProperty1

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*fun main() {
    var name = "Hello world!"
    println(name)
}*/

fun main() {
    name("Karen")
    sum(num1 = 35, num2 = 50)
    areaOfRectangle(length = 10.0, width = 12.0)
    areaOfSquare(length = 12)
    //areaOfCircle(radius = 22/7)
    areaOfCircle(pie= 3.14)
    person(name = "Brenda", age = 35, city = "Nairobi")

}
fun name(fullName: String) {
    println(fullName)

}
fun sum(num1: Int, num2: Int) {
    println(num1 + num2)
}

fun areaOfRectangle(length: Double, width: Double):Double {
    println(length * width)
    return length * width
}
 fun areaOfSquare(length: Int) {
     println(length * length)
 }

//fun areaOfCircle(radius: Int)
fun areaOfCircle(pie: Double) {
    var radius = 22/7
    var area = pie * (radius * radius)
    println(area)
}

fun person(name: String,age:Int,city:String){
    println(name)
    println(age)
    println(city)
    println("$name $age $city")
}