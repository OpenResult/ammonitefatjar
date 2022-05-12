import mill._
import mill.scalalib._

val sv = "3.1.2"

object afj extends ScalaModule {
  override def scalaVersion = sv
  override def ivyDeps = super.ivyDeps() ++ Agg(ivy"com.lihaoyi::mainargs:0.2.3")
}