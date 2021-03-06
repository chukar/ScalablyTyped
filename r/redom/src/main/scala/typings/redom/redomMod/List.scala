package typings.redom.redomMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redom", "List")
@js.native
class List protected () extends RedomComponent {
  def this(parent: RedomQuery, View: RedomComponentConstructor) = this()
  def this(parent: RedomQuery, View: RedomComponentConstructor, key: String) = this()
  def this(parent: RedomQuery, View: RedomComponentConstructor, key: String, initData: js.Any) = this()
  /* CompleteClass */
  override var el: HTMLElement = js.native
  @JSName("update")
  def update_MList(data: js.Array[_]): Unit = js.native
  @JSName("update")
  def update_MList(data: js.Array[_], context: js.Any): Unit = js.native
}

/* static members */
@JSImport("redom", "List")
@js.native
object List extends js.Object {
  def extend(parent: RedomQuery, View: RedomComponentConstructor): RedomComponentConstructor = js.native
  def extend(parent: RedomQuery, View: RedomComponentConstructor, key: String): RedomComponentConstructor = js.native
  def extend(parent: RedomQuery, View: RedomComponentConstructor, key: String, initData: js.Any): RedomComponentConstructor = js.native
}

@JSImport("redom", "list")
@js.native
object list extends js.Object {
  def apply(parent: RedomQuery, View: RedomComponentConstructor): List = js.native
  def apply(parent: RedomQuery, View: RedomComponentConstructor, key: String): List = js.native
  def apply(parent: RedomQuery, View: RedomComponentConstructor, key: String, initData: js.Any): List = js.native
  def extend(parent: RedomQuery, View: RedomComponentConstructor): RedomComponentConstructor = js.native
  def extend(parent: RedomQuery, View: RedomComponentConstructor, key: String): RedomComponentConstructor = js.native
  def extend(parent: RedomQuery, View: RedomComponentConstructor, key: String, initData: js.Any): RedomComponentConstructor = js.native
}

