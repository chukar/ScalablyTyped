package typings.rcDashTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyStyle extends js.Object {
  var data: js.Array[_]
  var prefixCls: String
  var rowKey: String
  var showHeader: Boolean
  var useFixedHeader: Boolean
  def emptyText(): String
  def onHeaderRow(): Unit
  def onRow(): Unit
  def rowClassName(): String
  def rowRef(): js.Any
}

object Anon_BodyStyle {
  @scala.inline
  def apply(
    data: js.Array[_],
    emptyText: () => String,
    onHeaderRow: () => Unit,
    onRow: () => Unit,
    prefixCls: String,
    rowClassName: () => String,
    rowKey: String,
    rowRef: () => js.Any,
    showHeader: Boolean,
    useFixedHeader: Boolean
  ): Anon_BodyStyle = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], emptyText = js.Any.fromFunction0(emptyText), onHeaderRow = js.Any.fromFunction0(onHeaderRow), onRow = js.Any.fromFunction0(onRow), prefixCls = prefixCls.asInstanceOf[js.Any], rowClassName = js.Any.fromFunction0(rowClassName), rowKey = rowKey.asInstanceOf[js.Any], rowRef = js.Any.fromFunction0(rowRef), showHeader = showHeader.asInstanceOf[js.Any], useFixedHeader = useFixedHeader.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BodyStyle]
  }
}

