package typings.reactDashNativeDashTabDashView

import typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorFocused[T /* <: Route */] extends js.Object {
  var color: String
  var focused: Boolean
  var route: T
}

object Anon_ColorFocused {
  @scala.inline
  def apply[T /* <: Route */](color: String, focused: Boolean, route: T): Anon_ColorFocused[T] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColorFocused[T]]
  }
}

