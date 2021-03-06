package typings.themeDashUi.themeDashUiMod

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.csstypeMod.BorderProperty
import typings.csstype.csstypeMod.BorderRadiusProperty
import typings.csstype.csstypeMod.BorderWidthProperty
import typings.csstype.csstypeMod.BoxShadowProperty
import typings.csstype.csstypeMod.ColorProperty
import typings.csstype.csstypeMod.FontFamilyProperty
import typings.csstype.csstypeMod.FontSizeProperty
import typings.csstype.csstypeMod.FontWeightProperty
import typings.csstype.csstypeMod.HeightProperty
import typings.csstype.csstypeMod.LetterSpacingProperty
import typings.csstype.csstypeMod.LineHeightProperty
import typings.csstype.csstypeMod.StandardProperties
import typings.csstype.csstypeMod.WidthProperty
import typings.csstype.csstypeMod.ZIndexProperty
import typings.styledDashSystem.styledDashSystemNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme
  extends typings.styledDashSystem.styledDashSystemMod.Theme {
  /**
    * Provide a value here to enable color modes
    */
  var initialColorMode: js.UndefOr[String] = js.undefined
  /**
    * Styles for elements rendered in MDX can be added to the theme.styles
    * object. This is the primary, low-level way to control typographic and
    * other styles in markdown content. Styles within this object are processed
    * with @styled-system/css and have access to base theme values like colors,
    * fonts, etc.
    */
  var styles: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in theme-ui.theme-ui.StyledTags ]:? @styled-system/css.@styled-system/css.SystemStyleObject}
    */ typings.themeDashUi.themeDashUiStrings.Theme with js.Any
  ] = js.undefined
  /**
    * Enable/disable custom CSS properties/variables if lower browser
    * support is required (for eg. IE 11).
    *
    * References: https://theme-ui.com/color-modes/#turn-off-custom-properties
    */
  var useCustomProperties: js.UndefOr[Boolean] = js.undefined
}

object Theme {
  @scala.inline
  def apply(
    borderStyles: typings.styledDashSystem.styledDashSystemMod.ObjectOrArray[BorderProperty[js.Object]] = null,
    borderWidths: typings.styledDashSystem.styledDashSystemMod.ObjectOrArray[BorderWidthProperty[js.Object]] = null,
    borders: typings.styledDashSystem.styledDashSystemMod.ObjectOrArray[BorderProperty[js.Object]] = null,
    breakpoints: (js.Array[Double | String]) | js.Object = null,
    buttons: typings.styledDashSystem.styledDashSystemMod.ObjectOrArray[StandardProperties[String | `0`]] = null,
    colorStyles: typings.styledDashSystem.styledDashSystemMod.ObjectOrArray[StandardProperties[String | `0`]] = null,
    colors: typings.styledDashSystem.styledDashSystemMod.ObjectOrArray[ColorProperty] = null,
    fontSizes: typings.styledDashSystem.styledDashSystemMod.ObjectOrArray[FontSizeProperty[Double]] = null,
    fontWeights: typings.styledDashSystem.styledDashSystemMod.ObjectOrArray[FontWeightProperty] = null,
    fonts: typings.styledDashSystem.styledDashSystemMod.ObjectOrArray[FontFamilyProperty] = null,
    initialColorMode: String = null,
    letterSpacings: typings.styledDashSystem.styledDashSystemMod.ObjectOrArray[LetterSpacingProperty[js.Object]] = null,
    lineHeights: typings.styledDashSystem.styledDashSystemMod.ObjectOrArray[LineHeightProperty[js.Object]] = null,
    mediaQueries: StringDictionary[String] = null,
    radii: typings.styledDashSystem.styledDashSystemMod.ObjectOrArray[BorderRadiusProperty[js.Object]] = null,
    shadows: typings.styledDashSystem.styledDashSystemMod.ObjectOrArray[BoxShadowProperty] = null,
    sizes: typings.styledDashSystem.styledDashSystemMod.ObjectOrArray[HeightProperty[js.Object] | WidthProperty[js.Object]] = null,
    space: typings.styledDashSystem.styledDashSystemMod.ObjectOrArray[Double | String] = null,
    styles: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in theme-ui.theme-ui.StyledTags ]:? @styled-system/css.@styled-system/css.SystemStyleObject}
    */ typings.themeDashUi.themeDashUiStrings.Theme with js.Any = null,
    textStyles: typings.styledDashSystem.styledDashSystemMod.ObjectOrArray[StandardProperties[String | `0`]] = null,
    useCustomProperties: js.UndefOr[Boolean] = js.undefined,
    zIndices: typings.styledDashSystem.styledDashSystemMod.ObjectOrArray[ZIndexProperty] = null
  ): Theme = {
    val __obj = js.Dynamic.literal()
    if (borderStyles != null) __obj.updateDynamic("borderStyles")(borderStyles.asInstanceOf[js.Any])
    if (borderWidths != null) __obj.updateDynamic("borderWidths")(borderWidths.asInstanceOf[js.Any])
    if (borders != null) __obj.updateDynamic("borders")(borders.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (colorStyles != null) __obj.updateDynamic("colorStyles")(colorStyles.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (fontSizes != null) __obj.updateDynamic("fontSizes")(fontSizes.asInstanceOf[js.Any])
    if (fontWeights != null) __obj.updateDynamic("fontWeights")(fontWeights.asInstanceOf[js.Any])
    if (fonts != null) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    if (initialColorMode != null) __obj.updateDynamic("initialColorMode")(initialColorMode.asInstanceOf[js.Any])
    if (letterSpacings != null) __obj.updateDynamic("letterSpacings")(letterSpacings.asInstanceOf[js.Any])
    if (lineHeights != null) __obj.updateDynamic("lineHeights")(lineHeights.asInstanceOf[js.Any])
    if (mediaQueries != null) __obj.updateDynamic("mediaQueries")(mediaQueries.asInstanceOf[js.Any])
    if (radii != null) __obj.updateDynamic("radii")(radii.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (textStyles != null) __obj.updateDynamic("textStyles")(textStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(useCustomProperties)) __obj.updateDynamic("useCustomProperties")(useCustomProperties.asInstanceOf[js.Any])
    if (zIndices != null) __obj.updateDynamic("zIndices")(zIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
}

