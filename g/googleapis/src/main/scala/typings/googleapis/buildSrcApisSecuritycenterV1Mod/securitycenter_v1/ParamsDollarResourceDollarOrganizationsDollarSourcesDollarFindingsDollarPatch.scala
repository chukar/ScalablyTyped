package typings.googleapis.buildSrcApisSecuritycenterV1Mod.securitycenter_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarOrganizationsDollarSourcesDollarFindingsDollarPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The relative resource name of this finding. See:
    * https://cloud.google.com/apis/design/resource_names#relative_resource_name
    * Example: "organizations/123/sources/456/findings/789"
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$Finding] = js.native
  /**
    * The FieldMask to use when updating the finding resource. This field
    * should not be specified when creating a finding.  When updating a
    * finding, an empty mask is treated as updating all mutable fields and
    * replacing source_properties.  Individual source_properties can be
    * added/updated by using "source_properties.<property key>" in the field
    * mask.
    */
  var updateMask: js.UndefOr[String] = js.native
}

