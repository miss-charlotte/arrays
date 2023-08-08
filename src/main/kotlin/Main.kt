fun main() {
   //non-primitive array
   val firstArray = arrayOf("Kenya", "Uganda", "Tanzania", 8, true)

   //primitive array
   val secondArray = Array<Int>(5, {6})
   for (x in secondArray) {
      println(x)
   }
   println(secondArray.size)

   val x = Array<String>(20, {""})
   val s = IntArray(20, {7})
   val d = DoubleArray(4)
   val k = CharArray(4)
   val b = BooleanArray(6)

   k[0] = 't'
   for (i in k){
      println(i)
   }

   x.forEach {
      print(it)
   }

   for (i in 100 downTo 0) {
      println(i)
   }
}