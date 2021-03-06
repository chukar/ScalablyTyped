package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClientDotCompute.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesScopedList extends js.Object {
  /** [Output Only] List of instances contained in this scope. */
  var instances: js.UndefOr[js.Array[Instance]] = js.undefined
  /** [Output Only] Informational warning which replaces the list of instances when the list is empty. */
  var warning: js.UndefOr[Anon_Code] = js.undefined
}

object InstancesScopedList {
  @scala.inline
  def apply(instances: js.Array[Instance] = null, warning: Anon_Code = null): InstancesScopedList = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancesScopedList]
  }
}

