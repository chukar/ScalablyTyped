package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarLocationsDollarProductsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of items to return. Default 10, maximum 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The next_page_token returned from a previous List request, if any.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The project OR ProductSet from which Products should be listed.  Format:
    * `projects/PROJECT_ID/locations/LOC_ID`
    */
  var parent: js.UndefOr[String] = js.native
}

