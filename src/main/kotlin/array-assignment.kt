fun main ( ){
    //create an array of 50 integers and use a for loop to print out the names of the integer
    val integerArray = Array(50) {index -> index + 1}
    for (integer in integerArray){
        println(integer)
    }

    //create an array of 6 doubles and print out the sum of all the elements in the array
    val doubleArray = arrayOf(1.2, 3.5, 2.2, 67.4, 8.9)
    val sum = doubleArray.sum()
    println(sum)

    //in a class, there are 5 students; Ivan, Aron, Nisah, Grace and Christine. Create an array
    val students = arrayOf("Ivan","Nisah", "Aron", "Grace", "Christine")
    val sort = students.sorted()
    for (name in sort) {
        println(name)
    }
}