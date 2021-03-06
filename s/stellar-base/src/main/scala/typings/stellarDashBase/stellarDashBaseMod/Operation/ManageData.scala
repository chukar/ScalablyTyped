package typings.stellarDashBase.stellarDashBaseMod.Operation

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManageData
  extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationType.ManageData] {
  var name: String
  var value: Buffer
}

object ManageData {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.stellarDashBase.stellarDashBaseMod.OperationType.ManageData,
    value: Buffer,
    source: String = null
  ): ManageData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageData]
  }
}

@JSImport("stellar-base", "Operation.manageData")
@js.native
object manageData extends js.Object {
  def apply(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptions.ManageData): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[ManageData] = js.native
}

