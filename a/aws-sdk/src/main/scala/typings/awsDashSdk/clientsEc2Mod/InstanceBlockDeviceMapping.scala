package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceBlockDeviceMapping extends js.Object {
  /**
    * The device name (for example, /dev/sdh or xvdh).
    */
  var DeviceName: js.UndefOr[String] = js.native
  /**
    * Parameters used to automatically set up EBS volumes when the instance is launched.
    */
  var Ebs: js.UndefOr[EbsInstanceBlockDevice] = js.native
}

object InstanceBlockDeviceMapping {
  @scala.inline
  def apply(DeviceName: String = null, Ebs: EbsInstanceBlockDevice = null): InstanceBlockDeviceMapping = {
    val __obj = js.Dynamic.literal()
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName.asInstanceOf[js.Any])
    if (Ebs != null) __obj.updateDynamic("Ebs")(Ebs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceBlockDeviceMapping]
  }
}

