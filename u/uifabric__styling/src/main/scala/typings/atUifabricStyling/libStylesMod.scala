package typings.atUifabricStyling

import typings.atUifabricMergeDashStyles.libIRawStyleBaseMod.IFontWeight
import typings.atUifabricMergeDashStyles.libIStyleMod.IRawStyle
import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import typings.atUifabricStyling.atUifabricStylingNumbers.`1024`
import typings.atUifabricStyling.atUifabricStylingNumbers.`1366`
import typings.atUifabricStyling.atUifabricStylingNumbers.`1920`
import typings.atUifabricStyling.atUifabricStylingNumbers.`320`
import typings.atUifabricStyling.atUifabricStylingNumbers.`480`
import typings.atUifabricStyling.atUifabricStylingNumbers.`640`
import typings.atUifabricStyling.atUifabricStylingNumbers.`768`
import typings.atUifabricStyling.atUifabricStylingStrings.`@media screen and Leftparenthesis-ms-high-contrastColon activeRightparenthesis`
import typings.atUifabricStyling.atUifabricStylingStrings.`@media screen and Leftparenthesis-ms-high-contrastColon black-on-whiteRightparenthesis`
import typings.atUifabricStyling.atUifabricStylingStrings.`@media screen and Leftparenthesis-ms-high-contrastColon white-on-blackRightparenthesis`
import typings.atUifabricStyling.atUifabricStylingStrings.absolute
import typings.atUifabricStyling.atUifabricStylingStrings.horizontal
import typings.atUifabricStyling.atUifabricStylingStrings.relative
import typings.atUifabricStyling.atUifabricStylingStrings.theme
import typings.atUifabricStyling.atUifabricStylingStrings.vertical
import typings.atUifabricStyling.libInterfacesIAnimationStylesMod.IAnimationStyles
import typings.atUifabricStyling.libInterfacesIAnimationStylesMod.IAnimationVariables
import typings.atUifabricStyling.libInterfacesIEffectsMod.IEffects
import typings.atUifabricStyling.libInterfacesIFontStylesMod.IFontStyles
import typings.atUifabricStyling.libInterfacesIGetFocusStylesMod.IGetFocusStylesOptions
import typings.atUifabricStyling.libInterfacesIPaletteMod.IPalette
import typings.atUifabricStyling.libInterfacesIThemeMod.IPartialTheme
import typings.atUifabricStyling.libInterfacesIThemeMod.ISchemeNames
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricStyling.libStylesGetGlobalClassNamesMod.GlobalClassNames
import typings.atUifabricUtilities.libCustomizationsCustomizerContextMod.ICustomizerContext
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling/lib/styles", JSImport.Namespace)
@js.native
object libStylesMod extends js.Object {
  val AnimationStyles: IAnimationStyles = js.native
  val AnimationVariables: IAnimationVariables = js.native
  val DefaultEffects: IEffects = js.native
  val DefaultFontStyles: IFontStyles = js.native
  val DefaultPalette: IPalette = js.native
  val HighContrastSelector: `@media screen and Leftparenthesis-ms-high-contrastColon activeRightparenthesis` = js.native
  val HighContrastSelectorBlack: `@media screen and Leftparenthesis-ms-high-contrastColon white-on-blackRightparenthesis` = js.native
  val HighContrastSelectorWhite: `@media screen and Leftparenthesis-ms-high-contrastColon black-on-whiteRightparenthesis` = js.native
  val ScreenWidthMaxLarge: Double = js.native
  val ScreenWidthMaxMedium: Double = js.native
  val ScreenWidthMaxSmall: Double = js.native
  val ScreenWidthMaxXLarge: Double = js.native
  val ScreenWidthMaxXXLarge: Double = js.native
  val ScreenWidthMinLarge: `640` = js.native
  val ScreenWidthMinMedium: `480` = js.native
  val ScreenWidthMinSmall: `320` = js.native
  val ScreenWidthMinUhfMobile: `768` = js.native
  val ScreenWidthMinXLarge: `1024` = js.native
  val ScreenWidthMinXXLarge: `1366` = js.native
  val ScreenWidthMinXXXLarge: `1920` = js.native
  val ThemeSettingName: theme = js.native
  val hiddenContentStyle: IRawStyle = js.native
  val noWrap: IRawStyle = js.native
  val normalize: IRawStyle = js.native
  def createFontStyles(): IFontStyles = js.native
  def createFontStyles(localeCode: String): IFontStyles = js.native
  def createTheme(theme: IPartialTheme): ITheme = js.native
  def createTheme(theme: IPartialTheme, depComments: Boolean): ITheme = js.native
  def focusClear(): IRawStyle = js.native
  def getFadedOverflowStyle(theme: ITheme): IRawStyle = js.native
  def getFadedOverflowStyle(theme: ITheme, color: String): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(theme: ITheme, color: String, direction: horizontal): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(theme: ITheme, color: String, direction: horizontal, width: String): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(theme: ITheme, color: String, direction: horizontal, width: String, height: String): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(theme: ITheme, color: String, direction: horizontal, width: String, height: Double): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(theme: ITheme, color: String, direction: horizontal, width: Double): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(theme: ITheme, color: String, direction: horizontal, width: Double, height: String): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(theme: ITheme, color: String, direction: horizontal, width: Double, height: Double): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(theme: ITheme, color: String, direction: vertical): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(theme: ITheme, color: String, direction: vertical, width: String): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(theme: ITheme, color: String, direction: vertical, width: String, height: String): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(theme: ITheme, color: String, direction: vertical, width: String, height: Double): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(theme: ITheme, color: String, direction: vertical, width: Double): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(theme: ITheme, color: String, direction: vertical, width: Double, height: String): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(theme: ITheme, color: String, direction: vertical, width: Double, height: Double): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: Double): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: Double, width: Double): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: Double, width: Double, color: String): IRawStyle = js.native
  def getFocusStyle(theme: ITheme): IRawStyle = js.native
  def getFocusStyle(theme: ITheme, options: IGetFocusStylesOptions): IRawStyle = js.native
  @JSName("getFocusStyle")
  def getFocusStyle_absolute(
    theme: ITheme,
    inset: js.UndefOr[Double],
    position: js.UndefOr[absolute],
    highContrastStyle: js.UndefOr[IRawStyle],
    borderColor: js.UndefOr[String],
    outlineColor: js.UndefOr[String],
    isFocusedOnly: js.UndefOr[Boolean]
  ): IRawStyle = js.native
  @JSName("getFocusStyle")
  def getFocusStyle_relative(
    theme: ITheme,
    inset: js.UndefOr[Double],
    position: js.UndefOr[relative],
    highContrastStyle: js.UndefOr[IRawStyle],
    borderColor: js.UndefOr[String],
    outlineColor: js.UndefOr[String],
    isFocusedOnly: js.UndefOr[Boolean]
  ): IRawStyle = js.native
  def getGlobalClassNames[T](classNames: GlobalClassNames[T], theme: ITheme): Partial[GlobalClassNames[T]] = js.native
  def getGlobalClassNames[T](classNames: GlobalClassNames[T], theme: ITheme, disableGlobalClassNames: Boolean): Partial[GlobalClassNames[T]] = js.native
  def getPlaceholderStyles(styles: IStyle): IStyle = js.native
  def getScreenSelector(min: Double, max: Double): String = js.native
  def getTheme(): ITheme = js.native
  def getTheme(depComments: Boolean): ITheme = js.native
  def getThemedContext(context: ICustomizerContext): ICustomizerContext = js.native
  def getThemedContext(context: ICustomizerContext, scheme: ISchemeNames): ICustomizerContext = js.native
  def getThemedContext(context: ICustomizerContext, scheme: ISchemeNames, theme: ITheme): ICustomizerContext = js.native
  def loadTheme(theme: IPartialTheme): ITheme = js.native
  def loadTheme(theme: IPartialTheme, depComments: Boolean): ITheme = js.native
  def registerDefaultFontFaces(baseUrl: String): Unit = js.native
  def registerOnThemeChangeCallback(callback: js.Function1[/* theme */ ITheme, Unit]): Unit = js.native
  def removeOnThemeChangeCallback(callback: js.Function1[/* theme */ ITheme, Unit]): Unit = js.native
  @js.native
  object FontSizes extends js.Object {
    val icon: String = js.native
    val large: String = js.native
    val medium: String = js.native
    val mediumPlus: String = js.native
    val mega: String = js.native
    val mini: String = js.native
    val small: String = js.native
    val smallPlus: String = js.native
    val superLarge: String = js.native
    val xLarge: String = js.native
    val xLargePlus: String = js.native
    val xSmall: String = js.native
    val xxLarge: String = js.native
    val xxLargePlus: String = js.native
  }
  
  @js.native
  object FontWeights extends js.Object {
    val bold: IFontWeight = js.native
    val light: IFontWeight = js.native
    val regular: IFontWeight = js.native
    val semibold: IFontWeight = js.native
    val semilight: IFontWeight = js.native
  }
  
  @js.native
  object IconFontSizes extends js.Object {
    val large: String = js.native
    val medium: String = js.native
    val small: String = js.native
    val xSmall: String = js.native
  }
  
  @js.native
  object PulsingBeaconAnimationStyles extends js.Object {
    var continuousPulseAnimationDouble: js.Function5[
        /* beaconColorOne */ String, 
        /* beaconColorTwo */ String, 
        /* innerDimension */ String, 
        /* outerDimension */ String, 
        /* borderWidth */ String, 
        String
      ] = js.native
    var continuousPulseAnimationSingle: js.Function5[
        /* beaconColorOne */ String, 
        /* beaconColorTwo */ String, 
        /* innerDimension */ String, 
        /* outerDimension */ String, 
        /* borderWidth */ String, 
        String
      ] = js.native
    var createDefaultAnimation: js.Function2[/* animationName */ String, /* delayLength */ js.UndefOr[String], IRawStyle] = js.native
  }
  
  @js.native
  object ZIndexes extends js.Object {
    val Coachmark: Double = js.native
    val FocusStyle: Double = js.native
    val KeytipLayer: Double = js.native
    val Layer: Double = js.native
    val Nav: Double = js.native
    /**
      * @deprecated ScrollablePane
      */
    val ScrollablePane: Double = js.native
  }
  
}

