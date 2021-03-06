package typings.meteor.meteorMeteorMod.Meteor

import typings.meteor.meteorMeteorMod.global_Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/meteor", "Meteor.loginWithPassword")
@js.native
object loginWithPassword extends js.Object {
  def apply(user: String, password: String): Unit = js.native
  def apply(
    user: String,
    password: String,
    callback: js.Function1[/* error */ js.UndefOr[global_Error | Error | TypedError], Unit]
  ): Unit = js.native
  def apply(user: js.Object, password: String): Unit = js.native
  def apply(
    user: js.Object,
    password: String,
    callback: js.Function1[/* error */ js.UndefOr[global_Error | Error | TypedError], Unit]
  ): Unit = js.native
}

