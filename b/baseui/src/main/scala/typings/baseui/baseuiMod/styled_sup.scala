package typings.baseui.baseuiMod

import typings.baseui.Anon_ClassName
import typings.baseui.Anon_Theme
import typings.baseui.baseuiStrings.sup
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
object styled_sup extends js.Object {
  def apply[P /* <: js.Object */, T](component: sup, styledFn: js.Function1[/* props */ Anon_Theme[T] with P, StyleObject]): StyletronComponent[(Pick[ComponentProps[sup], Exclude[String, Anon_ClassName]]) with P] = js.native
  def apply[P /* <: js.Object */, T](component: sup, styledFn: StyleObject): StyletronComponent[(Pick[ComponentProps[sup], Exclude[String, Anon_ClassName]]) with P] = js.native
}

