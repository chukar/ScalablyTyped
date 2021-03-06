package typings.activexDashWord.Word

import typings.activexDashOffice.Office.MsoPresetTextEffect
import typings.activexDashOffice.Office.MsoPresetTextEffectShape
import typings.activexDashOffice.Office.MsoTextEffectAlignment
import typings.activexDashOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.TextEffectFormat")
@js.native
class TextEffectFormat protected () extends js.Object {
  var Alignment: MsoTextEffectAlignment = js.native
  val Application: typings.activexDashWord.Word.Application = js.native
  val Creator: Double = js.native
  var FontBold: MsoTriState = js.native
  var FontItalic: MsoTriState = js.native
  var FontName: String = js.native
  var FontSize: Double = js.native
  var KernedPairs: MsoTriState = js.native
  var NormalizedHeight: MsoTriState = js.native
  val Parent: js.Any = js.native
  var PresetShape: MsoPresetTextEffectShape = js.native
  var PresetTextEffect: MsoPresetTextEffect = js.native
  var RotatedChars: MsoTriState = js.native
  var Text: String = js.native
  var Tracking: Double = js.native
  @JSName("Word.TextEffectFormat_typekey")
  var WordDotTextEffectFormat_typekey: TextEffectFormat = js.native
  def ToggleVerticalText(): Unit = js.native
}

