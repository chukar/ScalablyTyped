package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An occurrence of a particular package installation found within a
  * system&#39;s filesystem. E.g., glibc was found in `/var/lib/dpkg/status`.
  */
@js.native
trait Schema$Location extends js.Object {
  /**
    * Required. The CPE URI in [CPE
    * format](https://cpe.mitre.org/specification/) denoting the package
    * manager version distributing a package.
    */
  var cpeUri: js.UndefOr[String] = js.native
  /**
    * The path from which we gathered that this package/version is installed.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The version installed at this location.
    */
  var version: js.UndefOr[Schema$Version] = js.native
}

object Schema$Location {
  @scala.inline
  def apply(cpeUri: String = null, path: String = null, version: Schema$Version = null): Schema$Location = {
    val __obj = js.Dynamic.literal()
    if (cpeUri != null) __obj.updateDynamic("cpeUri")(cpeUri.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Location]
  }
}

