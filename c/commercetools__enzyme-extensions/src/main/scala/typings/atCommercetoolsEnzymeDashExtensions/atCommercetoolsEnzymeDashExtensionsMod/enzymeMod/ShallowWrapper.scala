package typings.atCommercetoolsEnzymeDashExtensions.atCommercetoolsEnzymeDashExtensionsMod.enzymeMod

import typings.enzyme.enzymeMod.EnzymeSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShallowWrapper[P] extends js.Object {
  def drill(expander: js.Function1[/* props */ js.Any, ShallowWrapper[js.Object]]): ShallowWrapper[P] = js.native
  def renderProp(propName: String, args: js.Any*): ShallowWrapper[P] = js.native
  def until(selector: EnzymeSelector): ShallowWrapper[P] = js.native
  def until(selector: EnzymeSelector, options: UntilOptions): ShallowWrapper[P] = js.native
}

