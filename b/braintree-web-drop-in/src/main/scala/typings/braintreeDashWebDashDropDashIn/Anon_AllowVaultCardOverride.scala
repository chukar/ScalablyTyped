package typings.braintreeDashWebDashDropDashIn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowVaultCardOverride extends js.Object {
  var allowVaultCardOverride: js.UndefOr[Boolean] = js.undefined
  var vaultCard: js.UndefOr[Boolean] = js.undefined
}

object Anon_AllowVaultCardOverride {
  @scala.inline
  def apply(
    allowVaultCardOverride: js.UndefOr[Boolean] = js.undefined,
    vaultCard: js.UndefOr[Boolean] = js.undefined
  ): Anon_AllowVaultCardOverride = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowVaultCardOverride)) __obj.updateDynamic("allowVaultCardOverride")(allowVaultCardOverride.asInstanceOf[js.Any])
    if (!js.isUndefined(vaultCard)) __obj.updateDynamic("vaultCard")(vaultCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowVaultCardOverride]
  }
}

