package typings.antd.libTransferMod

import typings.antd.Anon_ItemUnitItemsUnitNotFoundContentSearchPlaceholderTitles
import typings.antd.Anon_LeftDataSource
import typings.antd.antdStrings.sourceSelectedKeys
import typings.antd.antdStrings.targetSelectedKeys
import typings.antd.libCollapseCollapseMod.ExpandIconPosition
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.Component
import typings.react.reactMod.ReactNode
import typings.react.reactMod.SyntheticEvent
import typings.react.reactMod._Global_.JSX.Element
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transfer
  extends Component[TransferProps, js.Any, js.Any] {
  var separatedDataSource: Anon_LeftDataSource | Null = js.native
  def getLocale(
    transferLocale: TransferLocale,
    renderEmpty: js.Function1[/* componentName */ js.UndefOr[String], ReactNode]
  ): Anon_ItemUnitItemsUnitNotFoundContentSearchPlaceholderTitles = js.native
  def getSelectedKeysName(direction: TransferDirection): sourceSelectedKeys | targetSelectedKeys = js.native
  def getTitles(transferLocale: TransferLocale): js.Array[String] = js.native
  def handleClear(direction: ExpandIconPosition): Unit = js.native
  def handleFilter(direction: ExpandIconPosition, e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def handleLeftClear(): Unit = js.native
  def handleLeftFilter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def handleLeftScroll(e: SyntheticEvent[HTMLDivElement, Event]): Unit = js.native
  def handleLeftSelect(selectedItem: TransferItem, checked: Boolean): Unit = js.native
  def handleLeftSelectAll(filteredDataSource: js.Array[TransferItem], checkAll: Boolean): Unit = js.native
  def handleListStyle(listStyle: js.Function1[/* style */ ListStyle, CSSProperties], direction: ExpandIconPosition): CSSProperties = js.native
  def handleListStyle(listStyle: CSSProperties, direction: ExpandIconPosition): CSSProperties = js.native
  def handleRightClear(): Unit = js.native
  def handleRightFilter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def handleRightScroll(e: SyntheticEvent[HTMLDivElement, Event]): Unit = js.native
  def handleRightSelect(selectedItem: TransferItem, checked: Boolean): Unit = js.native
  def handleRightSelectAll(filteredDataSource: js.Array[TransferItem], checkAll: Boolean): Unit = js.native
  def handleScroll(direction: ExpandIconPosition, e: SyntheticEvent[HTMLDivElement, Event]): Unit = js.native
  def handleSelect(direction: ExpandIconPosition, selectedItem: TransferItem, checked: Boolean): Unit = js.native
  def handleSelectAll(direction: ExpandIconPosition, filteredDataSource: js.Array[TransferItem], checkAll: Boolean): Unit = js.native
  def handleSelectChange(direction: TransferDirection, holder: js.Array[String]): Unit = js.native
  def moveTo(direction: ExpandIconPosition): Unit = js.native
  def moveToLeft(): Unit = js.native
  def moveToRight(): Unit = js.native
  def onItemSelect(direction: ExpandIconPosition, selectedKey: String, checked: Boolean): Unit = js.native
  def onItemSelectAll(direction: ExpandIconPosition, selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
  def onLeftItemSelect(selectedKey: String, checked: Boolean): Unit = js.native
  def onLeftItemSelectAll(selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
  def onRightItemSelect(selectedKey: String, checked: Boolean): Unit = js.native
  def onRightItemSelectAll(selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
  def renderTransfer(transferLocale: TransferLocale): Element = js.native
  def separateDataSource(): Anon_LeftDataSource = js.native
}

