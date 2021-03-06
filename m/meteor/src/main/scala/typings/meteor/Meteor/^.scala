package typings.meteor.Meteor

import typings.meteor.Mongo.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Meteor")
@js.native
object ^ extends js.Object {
  /** User **/
  /** Error **/
  var Error: ErrorStatic = js.native
  var TypedError: TypedErrorStatic = js.native
  /** Global props **/
  var isClient: Boolean = js.native
  var isCordova: Boolean = js.native
  /** Global props **/
  var isDevelopment: Boolean = js.native
  var isProduction: Boolean = js.native
  var isServer: Boolean = js.native
  var isTest: Boolean = js.native
  var release: String = js.native
  var settings: Settings = js.native
  var users: Collection[User] = js.native
}

