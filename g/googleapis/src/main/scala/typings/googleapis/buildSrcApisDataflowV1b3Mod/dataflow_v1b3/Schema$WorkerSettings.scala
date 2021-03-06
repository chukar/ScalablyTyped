package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data to pass through to the worker harness.
  */
@js.native
trait Schema$WorkerSettings extends js.Object {
  /**
    * The base URL for accessing Google Cloud APIs.  When workers access Google
    * Cloud APIs, they logically do so via relative URLs.  If this field is
    * specified, it supplies the base URL to use for resolving these relative
    * URLs.  The normative algorithm used is defined by RFC 1808,
    * &quot;Relative Uniform Resource Locators&quot;.  If not specified, the
    * default value is &quot;http://www.googleapis.com/&quot;
    */
  var baseUrl: js.UndefOr[String] = js.native
  /**
    * Whether to send work progress updates to the service.
    */
  var reportingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The Cloud Dataflow service path relative to the root URL, for example,
    * &quot;dataflow/v1b3/projects&quot;.
    */
  var servicePath: js.UndefOr[String] = js.native
  /**
    * The Shuffle service path relative to the root URL, for example,
    * &quot;shuffle/v1beta1&quot;.
    */
  var shuffleServicePath: js.UndefOr[String] = js.native
  /**
    * The prefix of the resources the system should use for temporary storage.
    * The supported resource type is:  Google Cloud Storage:
    * storage.googleapis.com/{bucket}/{object}
    * bucket.storage.googleapis.com/{object}
    */
  var tempStoragePrefix: js.UndefOr[String] = js.native
  /**
    * The ID of the worker running this pipeline.
    */
  var workerId: js.UndefOr[String] = js.native
}

object Schema$WorkerSettings {
  @scala.inline
  def apply(
    baseUrl: String = null,
    reportingEnabled: js.UndefOr[Boolean] = js.undefined,
    servicePath: String = null,
    shuffleServicePath: String = null,
    tempStoragePrefix: String = null,
    workerId: String = null
  ): Schema$WorkerSettings = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(reportingEnabled)) __obj.updateDynamic("reportingEnabled")(reportingEnabled.asInstanceOf[js.Any])
    if (servicePath != null) __obj.updateDynamic("servicePath")(servicePath.asInstanceOf[js.Any])
    if (shuffleServicePath != null) __obj.updateDynamic("shuffleServicePath")(shuffleServicePath.asInstanceOf[js.Any])
    if (tempStoragePrefix != null) __obj.updateDynamic("tempStoragePrefix")(tempStoragePrefix.asInstanceOf[js.Any])
    if (workerId != null) __obj.updateDynamic("workerId")(workerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WorkerSettings]
  }
}

