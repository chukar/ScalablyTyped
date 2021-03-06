package typings.reactDashScroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object modulesComponentsLinkMod {
  import typings.react.reactMod.Component
  import typings.react.reactMod.HTMLProps
  import typings.std.HTMLButtonElement

  type Link = Component[LinkProps, js.Object, js.Any]
  type LinkProps = ReactScrollLinkProps with HTMLProps[HTMLButtonElement]
}
