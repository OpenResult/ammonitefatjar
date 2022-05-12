import mainargs.*
object Main {
  @main
  def execute(s: String, i: Int) =
    println(s * i)

  // needed by mainargs
  def main(args: Array[String]): Unit = ParserForMethods(this).runOrExit(args)
}
