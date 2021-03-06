package typings.googleapis.buildSrcApisAnalyticsV2Dot4Mod.analytics_v2_4

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Analytics API
  *
  * Views and manages your Google Analytics data.
  *
  * @example
  * const {google} = require('googleapis');
  * const analytics = google.analytics('v2.4');
  *
  * @namespace analytics
  * @type {Function}
  * @version v2.4
  * @variation v2.4
  * @param {object=} options Options for Analytics
  */
@JSImport("googleapis/build/src/apis/analytics/v2.4", "analytics_v2_4.Analytics")
@js.native
class Analytics protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var data: Resource$Data = js.native
  var management: Resource$Management = js.native
}

