package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.Anon_Highlight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionListRenderItemInfo[ItemT] extends ListRenderItemInfo[ItemT] {
  var section: SectionListData[ItemT]
}

object SectionListRenderItemInfo {
  @scala.inline
  def apply[ItemT](index: Double, item: ItemT, section: SectionListData[ItemT], separators: Anon_Highlight): SectionListRenderItemInfo[ItemT] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SectionListRenderItemInfo[ItemT]]
  }
}

