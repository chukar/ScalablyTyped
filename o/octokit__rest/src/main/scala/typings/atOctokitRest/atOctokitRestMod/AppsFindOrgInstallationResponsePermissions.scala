package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsFindOrgInstallationResponsePermissions extends js.Object {
  var checks: String
  var contents: String
  var metadata: String
}

object AppsFindOrgInstallationResponsePermissions {
  @scala.inline
  def apply(checks: String, contents: String, metadata: String): AppsFindOrgInstallationResponsePermissions = {
    val __obj = js.Dynamic.literal(checks = checks.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppsFindOrgInstallationResponsePermissions]
  }
}

