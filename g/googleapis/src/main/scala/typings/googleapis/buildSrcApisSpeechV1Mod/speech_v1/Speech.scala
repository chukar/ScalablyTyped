package typings.googleapis.buildSrcApisSpeechV1Mod.speech_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Speech-to-Text API
  *
  * Converts audio to text by applying powerful neural network models.
  *
  * @example
  * const {google} = require('googleapis');
  * const speech = google.speech('v1');
  *
  * @namespace speech
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Speech
  */
@JSImport("googleapis/build/src/apis/speech/v1", "speech_v1.Speech")
@js.native
class Speech protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var operations: Resource$Operations = js.native
  var projects: Resource$Projects = js.native
  var speech: Resource$Speech = js.native
}

