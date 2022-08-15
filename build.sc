import mill._
import mill.scalalib._

val sv = "3.1.2"

object afj extends ScalaModule {
  override def scalaVersion = sv
  override def ivyDeps = super.ivyDeps() ++ Agg(
    ivy"com.lihaoyi::mainargs:0.2.3",
    ivy"com.lihaoyi::requests:0.7.1",
    ivy"com.lihaoyi::upickle:2.0.0")
}