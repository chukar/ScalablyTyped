package typings.atThemeDashUiComponents.atThemeDashUiComponentsMod

import typings.atEmotionCore.atEmotionCoreMod.InterpolationWithTheme
import typings.csstype.csstypeMod.BackgroundProperty
import typings.csstype.csstypeMod.ColorProperty
import typings.csstype.csstypeMod.GlobalsNumber
import typings.csstype.csstypeMod.MarginBottomProperty
import typings.csstype.csstypeMod.MarginLeftProperty
import typings.csstype.csstypeMod.MarginProperty
import typings.csstype.csstypeMod.MarginRightProperty
import typings.csstype.csstypeMod.MarginTopProperty
import typings.csstype.csstypeMod.PaddingBottomProperty
import typings.csstype.csstypeMod.PaddingLeftProperty
import typings.csstype.csstypeMod.PaddingProperty
import typings.csstype.csstypeMod.PaddingRightProperty
import typings.csstype.csstypeMod.PaddingTopProperty
import typings.react.reactMod.ElementType
import typings.styledDashSystem.styledDashSystemMod.ResponsiveValue
import typings.styledDashSystem.styledDashSystemMod.TLengthStyledSystem
import typings.themeDashUi.themeDashUiMod.SxStyleProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.SVGProps<std.SVGSVGElement>, 'opacity' | 'color' | 'css' | 'sx' | 'max' | 'min'> ]: react.react.SVGProps<std.SVGSVGElement>[P]} */ trait DonutProps extends BoxOwnProps {
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[String | Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var value: Double
}

object DonutProps {
  @scala.inline
  def apply(
    value: Double,
    as: ElementType[_] = null,
    backgroundColor: ResponsiveValue[BackgroundProperty[TLengthStyledSystem]] = null,
    bg: ResponsiveValue[BackgroundProperty[TLengthStyledSystem]] = null,
    color: ResponsiveValue[ColorProperty] = null,
    css: InterpolationWithTheme[_] = null,
    m: ResponsiveValue[MarginProperty[TLengthStyledSystem]] = null,
    margin: ResponsiveValue[MarginProperty[TLengthStyledSystem]] = null,
    marginBottom: ResponsiveValue[MarginBottomProperty[TLengthStyledSystem]] = null,
    marginLeft: ResponsiveValue[MarginLeftProperty[TLengthStyledSystem]] = null,
    marginRight: ResponsiveValue[MarginRightProperty[TLengthStyledSystem]] = null,
    marginTop: ResponsiveValue[MarginTopProperty[TLengthStyledSystem]] = null,
    marginX: ResponsiveValue[MarginProperty[TLengthStyledSystem]] = null,
    marginY: ResponsiveValue[MarginProperty[TLengthStyledSystem]] = null,
    max: Int | Double = null,
    mb: ResponsiveValue[MarginBottomProperty[TLengthStyledSystem]] = null,
    min: Int | Double = null,
    ml: ResponsiveValue[MarginLeftProperty[TLengthStyledSystem]] = null,
    mr: ResponsiveValue[MarginRightProperty[TLengthStyledSystem]] = null,
    mt: ResponsiveValue[MarginTopProperty[TLengthStyledSystem]] = null,
    mx: ResponsiveValue[MarginProperty[TLengthStyledSystem]] = null,
    my: ResponsiveValue[MarginProperty[TLengthStyledSystem]] = null,
    opacity: ResponsiveValue[GlobalsNumber] = null,
    p: ResponsiveValue[PaddingProperty[TLengthStyledSystem]] = null,
    padding: ResponsiveValue[PaddingProperty[TLengthStyledSystem]] = null,
    paddingBottom: ResponsiveValue[PaddingBottomProperty[TLengthStyledSystem]] = null,
    paddingLeft: ResponsiveValue[PaddingLeftProperty[TLengthStyledSystem]] = null,
    paddingRight: ResponsiveValue[PaddingRightProperty[TLengthStyledSystem]] = null,
    paddingTop: ResponsiveValue[PaddingTopProperty[TLengthStyledSystem]] = null,
    paddingX: ResponsiveValue[PaddingProperty[TLengthStyledSystem]] = null,
    paddingY: ResponsiveValue[PaddingProperty[TLengthStyledSystem]] = null,
    pb: ResponsiveValue[PaddingBottomProperty[TLengthStyledSystem]] = null,
    pl: ResponsiveValue[PaddingLeftProperty[TLengthStyledSystem]] = null,
    pr: ResponsiveValue[PaddingRightProperty[TLengthStyledSystem]] = null,
    pt: ResponsiveValue[PaddingTopProperty[TLengthStyledSystem]] = null,
    px: ResponsiveValue[PaddingProperty[TLengthStyledSystem]] = null,
    py: ResponsiveValue[PaddingProperty[TLengthStyledSystem]] = null,
    size: String | Double = null,
    sx: SxStyleProp = null,
    title: String = null,
    variant: String = null
  ): DonutProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (marginX != null) __obj.updateDynamic("marginX")(marginX.asInstanceOf[js.Any])
    if (marginY != null) __obj.updateDynamic("marginY")(marginY.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (mb != null) __obj.updateDynamic("mb")(mb.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (ml != null) __obj.updateDynamic("ml")(ml.asInstanceOf[js.Any])
    if (mr != null) __obj.updateDynamic("mr")(mr.asInstanceOf[js.Any])
    if (mt != null) __obj.updateDynamic("mt")(mt.asInstanceOf[js.Any])
    if (mx != null) __obj.updateDynamic("mx")(mx.asInstanceOf[js.Any])
    if (my != null) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (paddingX != null) __obj.updateDynamic("paddingX")(paddingX.asInstanceOf[js.Any])
    if (paddingY != null) __obj.updateDynamic("paddingY")(paddingY.asInstanceOf[js.Any])
    if (pb != null) __obj.updateDynamic("pb")(pb.asInstanceOf[js.Any])
    if (pl != null) __obj.updateDynamic("pl")(pl.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (pt != null) __obj.updateDynamic("pt")(pt.asInstanceOf[js.Any])
    if (px != null) __obj.updateDynamic("px")(px.asInstanceOf[js.Any])
    if (py != null) __obj.updateDynamic("py")(py.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sx != null) __obj.updateDynamic("sx")(sx.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[DonutProps]
  }
}

