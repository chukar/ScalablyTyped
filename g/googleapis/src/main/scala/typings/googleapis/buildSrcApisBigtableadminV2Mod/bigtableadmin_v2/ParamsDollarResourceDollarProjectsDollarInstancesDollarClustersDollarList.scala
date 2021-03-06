package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarInstancesDollarClustersDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * DEPRECATED: This field is unused and ignored.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The unique name of the instance for which a list of clusters is
    * requested. Values are of the form
    * `projects/<project>/instances/<instance>`. Use `<instance> = '-'` to list
    * Clusters for all Instances in a project, e.g.,
    * `projects/myproject/instances/-`.
    */
  var parent: js.UndefOr[String] = js.native
}

