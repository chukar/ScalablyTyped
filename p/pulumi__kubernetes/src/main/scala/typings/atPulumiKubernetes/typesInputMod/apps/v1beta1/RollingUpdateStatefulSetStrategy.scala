package typings.atPulumiKubernetes.typesInputMod.apps.v1beta1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RollingUpdateStatefulSetStrategy is used to communicate parameter for
  * RollingUpdateStatefulSetStrategyType.
  */
trait RollingUpdateStatefulSetStrategy extends js.Object {
  /**
    * Partition indicates the ordinal at which the StatefulSet should be partitioned.
    */
  var partition: js.UndefOr[Input[Double]] = js.undefined
}

object RollingUpdateStatefulSetStrategy {
  @scala.inline
  def apply(partition: Input[Double] = null): RollingUpdateStatefulSetStrategy = {
    val __obj = js.Dynamic.literal()
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollingUpdateStatefulSetStrategy]
  }
}

