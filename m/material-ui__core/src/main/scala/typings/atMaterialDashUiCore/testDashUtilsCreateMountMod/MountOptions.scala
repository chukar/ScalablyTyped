package typings.atMaterialDashUiCore.testDashUtilsCreateMountMod

import typings.atMaterialDashUiCore.Fn_Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MountOptions extends js.Object {
  var mount: Fn_Node = js.native
}

object MountOptions {
  @scala.inline
  def apply(mount: Fn_Node): MountOptions = {
    val __obj = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MountOptions]
  }
}

