package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Content API for Shopping
  *
  * Manages product items, inventory, and Merchant Center accounts for Google
  * Shopping.
  *
  * @example
  * const {google} = require('googleapis');
  * const content = google.content('v2');
  *
  * @namespace content
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Content
  */
@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Content")
@js.native
class Content protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var accounts: Resource$Accounts = js.native
  var accountstatuses: Resource$Accountstatuses = js.native
  var accounttax: Resource$Accounttax = js.native
  var context: APIRequestContext = js.native
  var datafeeds: Resource$Datafeeds = js.native
  var datafeedstatuses: Resource$Datafeedstatuses = js.native
  var inventory: Resource$Inventory = js.native
  var liasettings: Resource$Liasettings = js.native
  var orderinvoices: Resource$Orderinvoices = js.native
  var orderpayments: Resource$Orderpayments = js.native
  var orderreports: Resource$Orderreports = js.native
  var orderreturns: Resource$Orderreturns = js.native
  var orders: Resource$Orders = js.native
  var pos: Resource$Pos = js.native
  var products: Resource$Products = js.native
  var productstatuses: Resource$Productstatuses = js.native
  var shippingsettings: Resource$Shippingsettings = js.native
}

