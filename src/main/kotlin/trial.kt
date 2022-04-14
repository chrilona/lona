fun main(){

println(takeNumbers(arrayOf(4,5,6)))
    println(takeVowels(arrayOf('a','b','c','e','i','d','u')))
  cities(arrayOf( "harare","mumbai","dodoma"))
    math(arrayOf(6,7,8,9,2,4,1))
}
fun takeNumbers(numbers:Array<Int>):Int{
    var totalProduct= 1
    numbers.forEach { number->
        totalProduct*=number
    }
    return totalProduct
}
fun takeMix(mixs:Array<Any>):Double{
    var totalSum= 0.0
    mixs.forEach { mix->
        if (mix is Double  || mix is Float)
            totalSum+=mix.toString().toDouble()
    }
            return totalSum
}
fun takeVowels(letters:Array<Char>):Int {

    var vowel = arrayOf('a','e','i','o','u')
    var totalV = 0
    letters.forEach { let ->
        if (vowel.contains(let)) {
            totalV += 1
        }
    }
        return totalV

}
fun cities(citys:Array<String>){
    for (city in citys){
        println(city.capitalize())}
}
fun math(numbers: Array<Int>){
    var sum = numbers[2] + numbers[5]
    println(sum)
    println(numbers.indexOf(22))
    println(numbers.sortedArray().contentToString())
}
