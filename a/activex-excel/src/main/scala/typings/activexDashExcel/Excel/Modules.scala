package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modules extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  @JSName("HPageBreaks")
  val HPageBreaks_Original: HPageBreaks = js.native
  val Parent: js.Any = js.native
  @JSName("VPageBreaks")
  val VPageBreaks_Original: VPageBreaks = js.native
  var Visible: js.Any = js.native
  def apply(Index: js.Any): js.Any = js.native
  def Add(): Module = js.native
  def Add(Before: js.Any): Module = js.native
  def Add(Before: js.Any, After: js.Any): Module = js.native
  def Add(Before: js.Any, After: js.Any, Count: js.Any): Module = js.native
  def Copy(): Unit = js.native
  def Copy(Before: js.Any): Unit = js.native
  def Copy(Before: js.Any, After: js.Any): Unit = js.native
  def Delete(): Unit = js.native
  def HPageBreaks(Index: Double): HPageBreak = js.native
  def Item(Index: js.Any): js.Any = js.native
  def Move(): Unit = js.native
  def Move(Before: js.Any): Unit = js.native
  def Move(Before: js.Any, After: js.Any): Unit = js.native
  def PrintOut(
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Preview: js.UndefOr[js.Any],
    ActivePrinter: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any],
    PrToFileName: js.UndefOr[js.Any],
    IgnorePrintAreas: js.UndefOr[js.Any]
  ): Unit = js.native
  def Select(): Unit = js.native
  def Select(Replace: js.Any): Unit = js.native
  def VPageBreaks(Index: Double): VPageBreak = js.native
  def _Default(Index: js.Any): js.Any = js.native
  def _PrintOut(
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Preview: js.UndefOr[js.Any],
    ActivePrinter: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any],
    PrToFileName: js.UndefOr[js.Any]
  ): Unit = js.native
  def __PrintOut(
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Preview: js.UndefOr[js.Any],
    ActivePrinter: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any]
  ): Unit = js.native
}

