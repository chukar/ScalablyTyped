package typings.reactDashLazyDashLoadDashImageDashComponent.reactDashLazyDashLoadDashImageDashComponentMod

import typings.react.reactMod.ComponentType
import typings.reactDashLazyDashLoadDashImageDashComponent.reactDashLazyDashLoadDashImageDashComponentStrings.scrollPosition
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-lazy-load-image-component", "trackWindowScroll")
@js.native
object trackWindowScroll extends js.Object {
  def apply[P /* <: LazyComponentProps */](BaseComponent: ComponentType[P]): ComponentType[Omit[P, scrollPosition]] = js.native
}

