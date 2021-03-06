package typings.stellarDashBase.stellarDashBaseMod.Operation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAccount
  extends BaseOperation[typings.stellarDashBase.stellarDashBaseMod.OperationType.CreateAccount] {
  var destination: String
  var startingBalance: String
}

object CreateAccount {
  @scala.inline
  def apply(
    destination: String,
    startingBalance: String,
    `type`: typings.stellarDashBase.stellarDashBaseMod.OperationType.CreateAccount,
    source: String = null
  ): CreateAccount = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], startingBalance = startingBalance.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccount]
  }
}

@JSImport("stellar-base", "Operation.createAccount")
@js.native
object createAccount extends js.Object {
  def apply(options: typings.stellarDashBase.stellarDashBaseMod.OperationOptions.CreateAccount): typings.stellarDashBase.stellarDashBaseMod.xdr.Operation[CreateAccount] = js.native
}

