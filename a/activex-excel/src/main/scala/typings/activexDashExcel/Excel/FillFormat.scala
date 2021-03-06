package typings.activexDashExcel.Excel

import typings.activexDashOffice.Office.GradientStop
import typings.activexDashOffice.Office.GradientStops
import typings.activexDashOffice.Office.MsoFillType
import typings.activexDashOffice.Office.MsoGradientColorType
import typings.activexDashOffice.Office.MsoGradientStyle
import typings.activexDashOffice.Office.MsoPatternType
import typings.activexDashOffice.Office.MsoPresetGradientType
import typings.activexDashOffice.Office.MsoPresetTexture
import typings.activexDashOffice.Office.MsoTextureAlignment
import typings.activexDashOffice.Office.MsoTextureType
import typings.activexDashOffice.Office.MsoTriState
import typings.activexDashOffice.Office.PictureEffect
import typings.activexDashOffice.Office.PictureEffects
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.FillFormat")
@js.native
class FillFormat protected () extends js.Object {
  val Application: js.Any = js.native
  var BackColor: ColorFormat = js.native
  val Creator: Double = js.native
  @JSName("Excel.FillFormat_typekey")
  var ExcelDotFillFormat_typekey: FillFormat = js.native
  var ForeColor: ColorFormat = js.native
  var GradientAngle: Double = js.native
  val GradientColorType: MsoGradientColorType = js.native
  val GradientDegree: Double = js.native
  @JSName("GradientStops")
  val GradientStops_Original: GradientStops = js.native
  val GradientStyle: MsoGradientStyle = js.native
  val GradientVariant: Double = js.native
  val Parent: js.Any = js.native
  val Pattern: MsoPatternType = js.native
  @JSName("PictureEffects")
  val PictureEffects_Original: PictureEffects = js.native
  val PresetGradientType: MsoPresetGradientType = js.native
  val PresetTexture: MsoPresetTexture = js.native
  var RotateWithObject: MsoTriState = js.native
  var TextureAlignment: MsoTextureAlignment = js.native
  var TextureHorizontalScale: Double = js.native
  val TextureName: String = js.native
  var TextureOffsetX: Double = js.native
  var TextureOffsetY: Double = js.native
  var TextureTile: MsoTriState = js.native
  val TextureType: MsoTextureType = js.native
  var TextureVerticalScale: Double = js.native
  var Transparency: Double = js.native
  val Type: MsoFillType = js.native
  var Visible: MsoTriState = js.native
  def Background(): Unit = js.native
  def GradientStops(Index: Double): GradientStop = js.native
  def OneColorGradient(Style: MsoGradientStyle, Variant: Double, Degree: Double): Unit = js.native
  def Patterned(Pattern: MsoPatternType): Unit = js.native
  def PictureEffects(Index: Double): PictureEffect = js.native
  def PresetGradient(Style: MsoGradientStyle, Variant: Double, PresetGradientType: MsoPresetGradientType): Unit = js.native
  def PresetTextured(PresetTexture: MsoPresetTexture): Unit = js.native
  def Solid(): Unit = js.native
  def TwoColorGradient(Style: MsoGradientStyle, Variant: Double): Unit = js.native
  def UserPicture(PictureFile: String): Unit = js.native
  def UserTextured(TextureFile: String): Unit = js.native
}

