package typings.materializeDashCss.materializeDashCssMod

import typings.materializeDashCss.M.MaterialboxOptions
import typings.materializeDashCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Materialbox")
@js.native
class Materialbox ()
  extends typings.materializeDashCss.M.Materialbox

/* static members */
@JSImport("materialize-css", "Materialbox")
@js.native
object Materialbox extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeDashCss.M.Materialbox = js.native
  /**
    * Init Materialboxes
    */
  def init(els: MElements): js.Array[typings.materializeDashCss.M.Materialbox] = js.native
  def init(els: MElements, options: Partial[MaterialboxOptions]): js.Array[typings.materializeDashCss.M.Materialbox] = js.native
  /**
    * Init Materialbox
    */
  def init(els: Element): typings.materializeDashCss.M.Materialbox = js.native
  def init(els: Element, options: Partial[MaterialboxOptions]): typings.materializeDashCss.M.Materialbox = js.native
}

