package typings.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "PropertyBinding")
@js.native
class PropertyBinding protected ()
  extends typings.three.srcAnimationPropertyBindingMod.PropertyBinding {
  def this(rootNode: js.Any, path: String) = this()
  def this(rootNode: js.Any, path: String, parsedPath: js.Any) = this()
}

/* static members */
@JSImport("three", "PropertyBinding")
@js.native
object PropertyBinding extends js.Object {
  @js.native
  class Composite protected ()
    extends typings.three.srcAnimationPropertyBindingMod.PropertyBinding.Composite {
    def this(targetGroup: js.Any, path: js.Any) = this()
    def this(targetGroup: js.Any, path: js.Any, parsedPath: js.Any) = this()
  }
  
  def create(root: js.Any, path: js.Any): typings.three.srcAnimationPropertyBindingMod.PropertyBinding | typings.three.srcAnimationPropertyBindingMod.PropertyBinding.Composite = js.native
  def create(root: js.Any, path: js.Any, parsedPath: js.Any): typings.three.srcAnimationPropertyBindingMod.PropertyBinding | typings.three.srcAnimationPropertyBindingMod.PropertyBinding.Composite = js.native
  def findNode(root: js.Any, nodeName: String): js.Any = js.native
  def parseTrackName(trackName: String): js.Any = js.native
}

