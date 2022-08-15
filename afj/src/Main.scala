import mainargs.*
object Main {
  @main
  def execute(s: String, i: Int) =
    println(s * i)

  @main
  def request(): Unit =
    val resp = requests.get("http://httpbin.org/get")
    val json = ujson.read(resp.text())

    println(json("origin").str)

  // needed by mainargs
  def main(args: Array[String]): Unit = ParserForMethods(this).runOrExit(args)
}
