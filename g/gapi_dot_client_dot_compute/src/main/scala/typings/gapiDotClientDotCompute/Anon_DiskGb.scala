package typings.gapiDotClientDotCompute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DiskGb extends js.Object {
  /** Size of the scratch disk, defined in GB. */
  var diskGb: js.UndefOr[Double] = js.undefined
}

object Anon_DiskGb {
  @scala.inline
  def apply(diskGb: Int | Double = null): Anon_DiskGb = {
    val __obj = js.Dynamic.literal()
    if (diskGb != null) __obj.updateDynamic("diskGb")(diskGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DiskGb]
  }
}

