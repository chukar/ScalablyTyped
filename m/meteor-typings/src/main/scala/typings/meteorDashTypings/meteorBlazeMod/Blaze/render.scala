package typings.meteorDashTypings.meteorBlazeMod.Blaze

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/blaze", "Blaze.render")
@js.native
object render extends js.Object {
  def apply(templateOrView: typings.meteorDashTypings.meteorBlazeMod.Blaze.Template, parentNode: Node): View = js.native
  def apply(
    templateOrView: typings.meteorDashTypings.meteorBlazeMod.Blaze.Template,
    parentNode: Node,
    nextNode: Node
  ): View = js.native
  def apply(
    templateOrView: typings.meteorDashTypings.meteorBlazeMod.Blaze.Template,
    parentNode: Node,
    nextNode: Node,
    parentView: View
  ): View = js.native
  def apply(templateOrView: View, parentNode: Node): View = js.native
  def apply(templateOrView: View, parentNode: Node, nextNode: Node): View = js.native
  def apply(templateOrView: View, parentNode: Node, nextNode: Node, parentView: View): View = js.native
}

