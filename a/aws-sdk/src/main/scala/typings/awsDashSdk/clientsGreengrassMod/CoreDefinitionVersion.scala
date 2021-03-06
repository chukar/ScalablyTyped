package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreDefinitionVersion extends js.Object {
  /**
    * A list of cores in the core definition version.
    */
  var Cores: js.UndefOr[__listOfCore] = js.native
}

object CoreDefinitionVersion {
  @scala.inline
  def apply(Cores: __listOfCore = null): CoreDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    if (Cores != null) __obj.updateDynamic("Cores")(Cores.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreDefinitionVersion]
  }
}

