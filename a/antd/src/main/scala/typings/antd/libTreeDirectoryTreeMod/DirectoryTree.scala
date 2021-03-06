package typings.antd.libTreeDirectoryTreeMod

import typings.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typings.antd.libTreeTreeMod.AntTreeNode
import typings.antd.libTreeTreeMod.AntTreeNodeExpandedEvent
import typings.antd.libTreeTreeMod.AntTreeNodeSelectedEvent
import typings.react.reactMod.Component
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryTree
  extends Component[DirectoryTreeProps, DirectoryTreeState, js.Any] {
  var cachedSelectedKeys: js.UndefOr[js.Array[String]] = js.native
  var lastSelectedKey: js.UndefOr[String] = js.native
  var tree: typings.antd.libTreeTreeMod.default = js.native
  def expandFolderNode(event: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent], node: AntTreeNode): Unit = js.native
  def onClick(event: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent], node: AntTreeNode): Unit = js.native
  def onDebounceExpand(event: typings.react.reactMod.MouseEvent[HTMLElement, NativeMouseEvent], node: AntTreeNode): Unit = js.native
  def onDoubleClick(event: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent], node: AntTreeNode): Unit = js.native
  def onExpand(expandedKeys: js.Array[String], info: AntTreeNodeExpandedEvent): Unit | js.Thenable[Unit] = js.native
  def onSelect(keys: js.Array[String], event: AntTreeNodeSelectedEvent): Unit = js.native
  def renderDirectoryTree(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def setTreeRef(node: typings.antd.libTreeTreeMod.default): Unit = js.native
  def setUncontrolledState(state: DirectoryTreeState): Unit = js.native
}

