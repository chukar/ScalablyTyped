package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Android Device Provisioning Partner API
  *
  * Automates Android zero-touch enrollment for device resellers, customers,
  * and EMMs.
  *
  * @example
  * const {google} = require('googleapis');
  * const androiddeviceprovisioning = google.androiddeviceprovisioning('v1');
  *
  * @namespace androiddeviceprovisioning
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Androiddeviceprovisioning
  */
@JSImport("googleapis/build/src/apis/androiddeviceprovisioning/v1", "androiddeviceprovisioning_v1.Androiddeviceprovisioning")
@js.native
class Androiddeviceprovisioning protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var customers: Resource$Customers = js.native
  var operations: Resource$Operations = js.native
  var partners: Resource$Partners = js.native
}

