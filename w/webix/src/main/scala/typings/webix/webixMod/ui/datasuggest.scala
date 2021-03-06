package typings.webix.webixMod.ui

import typings.std.HTMLElement
import typings.webix.webixMod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webix", "ui.datasuggest")
@js.native
class datasuggest ()
  extends typings.webix.webix.ui.baseview {
  @JSName("$enterKey")
  var $enterKey_Original: WebixCallback = js.native
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("$skin")
  var $skin_Original_datasuggest: WebixCallback = js.native
  @JSName("config")
  var config_datasuggest: datasuggestConfig = js.native
  @JSName("$enterKey")
  def $enterKey(args: js.Any*): js.Any = js.native
  def attachEvent(`type`: datasuggestEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: datasuggestEventName, functor: WebixCallback, id: String): String | Double = js.native
  def blockEvent(): Unit = js.native
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  def detachEvent(id: String): Unit = js.native
  def getBody(): js.Any = js.native
  def getHead(): js.Any = js.native
  def getItemId(text: String): String | Double = js.native
  def getItemText(id: String): String = js.native
  def getItemText(id: Double): String = js.native
  def getList(): typings.webix.webix.ui.baseview = js.native
  def getMasterValue(): js.Any = js.native
  def getSuggestion(): String = js.native
  def getValue(): String | Double = js.native
  def hasEvent(name: String): Boolean = js.native
  def linkInput(input: HTMLElement): Unit = js.native
  def mapEvent(map: js.Any): Unit = js.native
  def resizeChildren(): Unit = js.native
  def setMasterValue(value: js.Any): Unit = js.native
  def setPosition(x: Double, y: Double): Unit = js.native
  def setValue(value: String): Unit = js.native
  def setValue(value: Double): Unit = js.native
  def show(node: HTMLElement): Unit = js.native
  def show(node: HTMLElement, position: js.Any): Unit = js.native
  def show(node: HTMLElement, position: js.Any, point: String): Unit = js.native
  def unblockEvent(): Unit = js.native
}

