package typings.angularDashStrap.mgcrea.ngStrap.modal

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModal extends js.Object {
  @JSName("$promise")
  var $promise: IPromise[Unit] = js.native
  def hide(): Unit = js.native
  def show(): Unit = js.native
  def toggle(): Unit = js.native
}

