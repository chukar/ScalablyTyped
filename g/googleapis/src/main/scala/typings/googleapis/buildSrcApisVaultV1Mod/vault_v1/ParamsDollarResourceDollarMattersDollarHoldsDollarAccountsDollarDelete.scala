package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarMattersDollarHoldsDollarAccountsDollarDelete extends StandardParameters {
  /**
    * The ID of the account to remove from the hold.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The hold ID.
    */
  var holdId: js.UndefOr[String] = js.native
  /**
    * The matter ID.
    */
  var matterId: js.UndefOr[String] = js.native
}

