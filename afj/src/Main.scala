import mainargs.*
object Main {
  @main
  def execute(s: String, i: Int) =
    println(s * i)

  @main
  def request(): Unit =
    val resp = requests.get("http://httpbin.org/get")
    println(resp)

  // needed by mainargs
  def main(args: Array[String]): Unit = ParserForMethods(this).runOrExit(args)
}
