package typings.reactDashNativeDashSafeDashArea.reactDashNativeDashSafeDashAreaMod

import typings.react.reactMod.ComponentType
import typings.reactDashNativeDashSafeDashArea.reactDashNativeDashSafeDashAreaStrings.padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-safe-area", "withSafeArea")
@js.native
object withSafeArea_padding extends js.Object {
  def apply[P](
    WrappedComponent: ComponentType[P],
    /**
    * @default 'margin'
    */
  applyTo: padding,
    /**
    * @default 'all'
    */
  direction: Direction
  ): ComponentType[P] = js.native
}

