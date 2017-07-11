
// note: scala needs special handling form command-line operators....

// main method in "Solution" will be run as your answer
object Solution {
  def main(args: Array[String]) {
    val data = args.toList
    var eax: Double = 0
    var acc: Double = 0
    var idx = 0

    // loop through the arg-list:
    //  first element goes directly into eax
    //  next element goes into ds
    //  operations manipulate the 'eax' with the value in 'ds', using the appropriate operand

    for (x <- data) {
      idx += 1
      if (idx == 1) {
        // direct to eax
        eax = x.toDouble
      } else if (idx % 2 == 0) {
        // even placeholder (value goes into acc register
        acc = x.toDouble
      } else {
        // index position is ODD (and NOT THE FIRST DATAUM), e.g., an operator
        x match {
          case "+" => eax += acc
          case "x" => eax = eax * acc
          case "-" => eax -= acc
          case "/" => eax = eax / acc
        }
      }
    }
    println(eax)
  }
}


