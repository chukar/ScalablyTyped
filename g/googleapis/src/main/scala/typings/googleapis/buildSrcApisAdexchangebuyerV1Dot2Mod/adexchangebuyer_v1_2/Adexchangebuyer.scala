package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot2Mod.adexchangebuyer_v1_2

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Ad Exchange Buyer API
  *
  * Accesses your bidding-account information, submits creatives for
  * validation, finds available direct deals, and retrieves performance
  * reports.
  *
  * @example
  * const {google} = require('googleapis');
  * const adexchangebuyer = google.adexchangebuyer('v1.2');
  *
  * @namespace adexchangebuyer
  * @type {Function}
  * @version v1.2
  * @variation v1.2
  * @param {object=} options Options for Adexchangebuyer
  */
@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.2", "adexchangebuyer_v1_2.Adexchangebuyer")
@js.native
class Adexchangebuyer protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var accounts: Resource$Accounts = js.native
  var context: APIRequestContext = js.native
  var creatives: Resource$Creatives = js.native
}

