package typings.atEmotionStyledDashBase.atEmotionStyledDashBaseMod

import typings.atEmotionSerialize.atEmotionSerializeMod.Interpolation
import typings.atEmotionStyledDashBase.typesHelperMod.Omit
import typings.atEmotionStyledDashBase.typesHelperMod.Overwrapped
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStyledComponentBaseThemeless[InnerProps, ExtraProps]
  extends CreateStyledComponentBase[InnerProps, ExtraProps, js.Any] {
  def apply[StyleProps /* <: Omit[Overwrapped[InnerProps, StyleProps], ReactClassPropKeys] */, Theme /* <: js.Object */](styles: (Interpolation[WithTheme[StyleProps, Theme]])*): StyledComponent[InnerProps, StyleProps, Theme] = js.native
  def apply[StyleProps /* <: Omit[Overwrapped[InnerProps, StyleProps], ReactClassPropKeys] */, Theme /* <: js.Object */](template: TemplateStringsArray, styles: (Interpolation[WithTheme[StyleProps, Theme]])*): StyledComponent[InnerProps, StyleProps, Theme] = js.native
}

