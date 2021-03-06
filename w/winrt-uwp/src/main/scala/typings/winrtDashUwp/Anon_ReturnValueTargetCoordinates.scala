package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtDashUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReturnValueTargetCoordinates extends js.Object {
  /** This function returns asynchronously. */ var returnValue: IPromiseWithIAsyncAction
  /** The pixel coordinates, mapped to depth image space. */ var targetCoordinates: Point
}

object Anon_ReturnValueTargetCoordinates {
  @scala.inline
  def apply(returnValue: IPromiseWithIAsyncAction, targetCoordinates: Point): Anon_ReturnValueTargetCoordinates = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], targetCoordinates = targetCoordinates.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ReturnValueTargetCoordinates]
  }
}

