package typings.winrt

import typings.winrt.Windows.Foundation.IWwwFormUrlDecoderEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValue extends js.Object {
  var items: js.Array[IWwwFormUrlDecoderEntry]
  var returnValue: Double
}

object Anon_ItemsReturnValue {
  @scala.inline
  def apply(items: js.Array[IWwwFormUrlDecoderEntry], returnValue: Double): Anon_ItemsReturnValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ItemsReturnValue]
  }
}

