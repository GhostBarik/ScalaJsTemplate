package webapp

import org.scalajs.dom.document

import scala.scalajs.js.JSApp

/**
  * Template for Scala.js application
  */
object Main extends JSApp {

  def main() {

    println("Hello from Scala.js!")

    val parNode = document.createElement("p")
    parNode.innerHTML = "print scala map: " + Map("Dan" -> 1, "Bar" -> 2).toString
    document.body.appendChild(parNode)
  }
}
