package typings.baseui.baseuiMod

import typings.baseui.Anon_ClassName
import typings.baseui.Anon_Theme
import typings.baseui.baseuiStrings.nav
import typings.react.reactMod.ComponentProps
import typings.std.Exclude
import typings.std.Pick
import typings.styletronDashReact.styletronDashReactMod.StyletronComponent
import typings.styletronDashStandard.styletronDashStandardMod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui", "styled")
@js.native
object styled_nav extends js.Object {
  def apply[P /* <: js.Object */, T](component: nav, styledFn: js.Function1[/* props */ Anon_Theme[T] with P, StyleObject]): StyletronComponent[(Pick[ComponentProps[nav], Exclude[String, Anon_ClassName]]) with P] = js.native
  def apply[P /* <: js.Object */, T](component: nav, styledFn: StyleObject): StyletronComponent[(Pick[ComponentProps[nav], Exclude[String, Anon_ClassName]]) with P] = js.native
}

