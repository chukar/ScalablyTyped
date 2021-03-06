package typings.reactDashFa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashFaMod {
  import typings.react.reactMod.Component
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.react.reactMod.StatelessComponent

  type CustomComponent = String | (ComponentClass[js.Any, ComponentState]) | StatelessComponent[js.Any]
  type Icon = Component[IconProps, js.Object, js.Any]
  type IconStack = Component[IconStackProps, js.Object, js.Any]
}
