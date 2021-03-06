package typings.googleapis.googleapisMod.cloudfunctions_v1

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Functions API
  *
  * Manages lightweight user-provided functions executed in response to events.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudfunctions = google.cloudfunctions('v1');
  *
  * @namespace cloudfunctions
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Cloudfunctions
  */
@JSImport("googleapis", "cloudfunctions_v1.Cloudfunctions")
@js.native
class Cloudfunctions protected ()
  extends typings.googleapis.buildSrcApisCloudfunctionsV1Mod.cloudfunctions_v1.Cloudfunctions {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

