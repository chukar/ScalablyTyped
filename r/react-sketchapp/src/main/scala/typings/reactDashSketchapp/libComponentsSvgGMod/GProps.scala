package typings.reactDashSketchapp.libComponentsSvgGMod

import typings.reactDashSketchapp.libComponentsSvgPropsMod.ClipProps
import typings.reactDashSketchapp.libComponentsSvgPropsMod.DefinationProps
import typings.reactDashSketchapp.libComponentsSvgPropsMod.FillProps
import typings.reactDashSketchapp.libComponentsSvgPropsMod.Font
import typings.reactDashSketchapp.libComponentsSvgPropsMod.FontFamily
import typings.reactDashSketchapp.libComponentsSvgPropsMod.FontProps
import typings.reactDashSketchapp.libComponentsSvgPropsMod.FontStretch
import typings.reactDashSketchapp.libComponentsSvgPropsMod.FontStyle
import typings.reactDashSketchapp.libComponentsSvgPropsMod.FontVariant
import typings.reactDashSketchapp.libComponentsSvgPropsMod.FontVariantLigatures
import typings.reactDashSketchapp.libComponentsSvgPropsMod.FontWeight
import typings.reactDashSketchapp.libComponentsSvgPropsMod.Kerning
import typings.reactDashSketchapp.libComponentsSvgPropsMod.LetterSpacing
import typings.reactDashSketchapp.libComponentsSvgPropsMod.NumberArrayProp
import typings.reactDashSketchapp.libComponentsSvgPropsMod.NumberProp
import typings.reactDashSketchapp.libComponentsSvgPropsMod.StrokeProps
import typings.reactDashSketchapp.libComponentsSvgPropsMod.TextAnchor
import typings.reactDashSketchapp.libComponentsSvgPropsMod.TextDecoration
import typings.reactDashSketchapp.libComponentsSvgPropsMod.TransformProps
import typings.reactDashSketchapp.libComponentsSvgPropsMod.WordSpacing
import typings.reactDashSketchapp.libComponentsSvgPropsMod.fontSize
import typings.reactDashSketchapp.reactDashSketchappStrings.bevel
import typings.reactDashSketchapp.reactDashSketchappStrings.butt
import typings.reactDashSketchapp.reactDashSketchappStrings.evenodd
import typings.reactDashSketchapp.reactDashSketchappStrings.miter
import typings.reactDashSketchapp.reactDashSketchappStrings.nonzero
import typings.reactDashSketchapp.reactDashSketchappStrings.round
import typings.reactDashSketchapp.reactDashSketchappStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GProps
  extends FillProps
     with StrokeProps
     with ClipProps
     with TransformProps
     with DefinationProps
     with FontProps

object GProps {
  @scala.inline
  def apply(
    clipPath: String = null,
    clipRule: evenodd | nonzero = null,
    fill: String = null,
    fillOpacity: NumberProp = null,
    fillRule: evenodd | nonzero = null,
    font: Font = null,
    fontFamily: FontFamily = null,
    fontSize: fontSize = null,
    fontStretch: FontStretch = null,
    fontStyle: FontStyle = null,
    fontVariant: FontVariant = null,
    fontVariantLigatures: FontVariantLigatures = null,
    fontWeight: FontWeight = null,
    kerning: Kerning = null,
    letterSpacing: LetterSpacing = null,
    name: String = null,
    origin: NumberProp = null,
    originX: NumberProp = null,
    originY: NumberProp = null,
    rotate: NumberProp = null,
    rotation: NumberProp = null,
    scale: NumberProp = null,
    scaleX: NumberProp = null,
    scaleY: NumberProp = null,
    skew: NumberProp = null,
    skewX: NumberProp = null,
    skewY: NumberProp = null,
    stroke: String = null,
    strokeDasharray: NumberArrayProp = null,
    strokeDashoffset: NumberProp = null,
    strokeLinecap: butt | square | round = null,
    strokeLinejoin: miter | bevel | round = null,
    strokeMiterlimit: NumberProp = null,
    strokeOpacity: NumberProp = null,
    strokeWidth: NumberProp = null,
    textAnchor: TextAnchor = null,
    textDecoration: TextDecoration = null,
    transform: js.Object | String = null,
    translate: NumberProp = null,
    translateX: NumberProp = null,
    translateY: NumberProp = null,
    wordSpacing: WordSpacing = null,
    x: NumberProp = null,
    y: NumberProp = null
  ): GProps = {
    val __obj = js.Dynamic.literal()
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath.asInstanceOf[js.Any])
    if (clipRule != null) __obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStretch != null) __obj.updateDynamic("fontStretch")(fontStretch.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
    if (fontVariantLigatures != null) __obj.updateDynamic("fontVariantLigatures")(fontVariantLigatures.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (kerning != null) __obj.updateDynamic("kerning")(kerning.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (originX != null) __obj.updateDynamic("originX")(originX.asInstanceOf[js.Any])
    if (originY != null) __obj.updateDynamic("originY")(originY.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (skew != null) __obj.updateDynamic("skew")(skew.asInstanceOf[js.Any])
    if (skewX != null) __obj.updateDynamic("skewX")(skewX.asInstanceOf[js.Any])
    if (skewY != null) __obj.updateDynamic("skewY")(skewY.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
    if (strokeDashoffset != null) __obj.updateDynamic("strokeDashoffset")(strokeDashoffset.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (translateX != null) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    if (translateY != null) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    if (wordSpacing != null) __obj.updateDynamic("wordSpacing")(wordSpacing.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GProps]
  }
}

