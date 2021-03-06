package typings.nodeDashWaves

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-waves", JSImport.Namespace)
@js.native
object nodeDashWavesMod extends js.Object {
  def attach(elements: ElementSelector): Unit = js.native
  def attach(elements: ElementSelector, classes: String): Unit = js.native
  def attach(elements: ElementSelector, classes: js.Array[String]): Unit = js.native
  def calm(elements: ElementSelector): Unit = js.native
  def init(): Unit = js.native
  def init(config: Anon_Delay): Unit = js.native
  def ripple(elements: ElementSelector): Unit = js.native
  def ripple(elements: ElementSelector, option: Anon_Position): Unit = js.native
  type ElementSelector = String | HTMLElement | js.Array[HTMLElement]
}

