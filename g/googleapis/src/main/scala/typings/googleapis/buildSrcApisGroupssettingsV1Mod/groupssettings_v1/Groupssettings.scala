package typings.googleapis.buildSrcApisGroupssettingsV1Mod.groupssettings_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Groups Settings API
  *
  * Manages permission levels and related settings of a group.
  *
  * @example
  * const {google} = require('googleapis');
  * const groupssettings = google.groupssettings('v1');
  *
  * @namespace groupssettings
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Groupssettings
  */
@JSImport("googleapis/build/src/apis/groupssettings/v1", "groupssettings_v1.Groupssettings")
@js.native
class Groupssettings protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var groups: Resource$Groups = js.native
}

