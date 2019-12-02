package webapp

import org.scalajs.dom
import dom.document

import scala.scalajs.js.annotation.JSExportTopLevel

/**
  * Template for Scala.js application
  */
object Main {

  @JSExpportTopLevel("list")
  var l = List(1,2,3)

  def main(args: Array[String]): Unit = {
    println("Hello from Scala.js!")
  }
}
