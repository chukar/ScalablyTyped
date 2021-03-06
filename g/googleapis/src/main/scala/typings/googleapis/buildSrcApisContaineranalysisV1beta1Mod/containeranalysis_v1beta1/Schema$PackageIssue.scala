package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message wraps a location affected by a vulnerability and its
  * associated fix (if one is available).
  */
@js.native
trait Schema$PackageIssue extends js.Object {
  /**
    * Required. The location of the vulnerability.
    */
  var affectedLocation: js.UndefOr[Schema$VulnerabilityLocation] = js.native
  /**
    * The location of the available fix for vulnerability.
    */
  var fixedLocation: js.UndefOr[Schema$VulnerabilityLocation] = js.native
  /**
    * Deprecated, use Details.effective_severity instead The severity (e.g.,
    * distro assigned severity) for this vulnerability.
    */
  var severityName: js.UndefOr[String] = js.native
}

object Schema$PackageIssue {
  @scala.inline
  def apply(
    affectedLocation: Schema$VulnerabilityLocation = null,
    fixedLocation: Schema$VulnerabilityLocation = null,
    severityName: String = null
  ): Schema$PackageIssue = {
    val __obj = js.Dynamic.literal()
    if (affectedLocation != null) __obj.updateDynamic("affectedLocation")(affectedLocation.asInstanceOf[js.Any])
    if (fixedLocation != null) __obj.updateDynamic("fixedLocation")(fixedLocation.asInstanceOf[js.Any])
    if (severityName != null) __obj.updateDynamic("severityName")(severityName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PackageIssue]
  }
}

