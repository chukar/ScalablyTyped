package typings.meteor.meteorMeteorMod.Meteor

import typings.meteor.DDP.DDPStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/meteor", "Meteor.status")
@js.native
object status extends js.Object {
  /** Connection **/
  /** Status **/
  def apply(): DDPStatus = js.native
}

