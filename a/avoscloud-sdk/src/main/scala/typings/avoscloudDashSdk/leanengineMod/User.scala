package typings.avoscloudDashSdk.leanengineMod

import typings.avoscloudDashSdk.avoscloudDashSdkMod.SuccessFailureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  *
  * <p>A AV.User object is a local representation of a user persisted to the
  * AV cloud. This class is a subclass of a AV.Object, and retains the
  * same functionality of a AV.Object, but also extends it with various
  * user specific methods, like authentication, signing up, and validation of
  * uniqueness.</p>
  */
@JSImport("leanengine", "User")
@js.native
class User ()
  extends typings.avoscloudDashSdk.avoscloudDashSdkMod.User

/* static members */
@JSImport("leanengine", "User")
@js.native
object User extends js.Object {
  def allowCustomUserClass(isAllowed: Boolean): Unit = js.native
  def become[T](sessionToken: String): typings.avoscloudDashSdk.avoscloudDashSdkMod.Promise[T] = js.native
  def become[T](sessionToken: String, options: SuccessFailureOptions): typings.avoscloudDashSdk.avoscloudDashSdkMod.Promise[T] = js.native
  def current(): typings.avoscloudDashSdk.avoscloudDashSdkMod.User = js.native
  def logIn[T](username: String, password: String): typings.avoscloudDashSdk.avoscloudDashSdkMod.Promise[T] = js.native
  def logIn[T](username: String, password: String, options: SuccessFailureOptions): typings.avoscloudDashSdk.avoscloudDashSdkMod.Promise[T] = js.native
  def logOut[T](): typings.avoscloudDashSdk.avoscloudDashSdkMod.Promise[T] = js.native
  def requestPasswordReset[T](email: String): typings.avoscloudDashSdk.avoscloudDashSdkMod.Promise[T] = js.native
  def requestPasswordReset[T](email: String, options: SuccessFailureOptions): typings.avoscloudDashSdk.avoscloudDashSdkMod.Promise[T] = js.native
  def signUp[T](username: String, password: String, attrs: js.Any): typings.avoscloudDashSdk.avoscloudDashSdkMod.Promise[T] = js.native
  def signUp[T](username: String, password: String, attrs: js.Any, options: SuccessFailureOptions): typings.avoscloudDashSdk.avoscloudDashSdkMod.Promise[T] = js.native
}

