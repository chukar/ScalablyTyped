package typings.angularDashLocker.angularMod.locker

import typings.angular.angularMod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILockerProvider extends IServiceProvider {
  /**
    * Allow the defaults to be specified via the `lockerProvider`
    *
    * @param {ILockerSettings}  lockerSettings  The defaults to override
    */
  def defaults(lockerSettings: ILockerSettings): Unit = js.native
}

