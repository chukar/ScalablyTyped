package typings.antdDashMobileDashRn

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cascade extends js.Object {
  var cascade: Boolean
  var cols: Double
  var pickerPrefixCls: String
  var popupPrefixCls: String
  var prefixCls: String
  var styles: StringDictionary[RegisteredStyle[_]]
  var title: String
  var triggerType: String
  def format(values: js.Array[String]): String
}

object Anon_Cascade {
  @scala.inline
  def apply(
    cascade: Boolean,
    cols: Double,
    format: js.Array[String] => String,
    pickerPrefixCls: String,
    popupPrefixCls: String,
    prefixCls: String,
    styles: StringDictionary[RegisteredStyle[_]],
    title: String,
    triggerType: String
  ): Anon_Cascade = {
    val __obj = js.Dynamic.literal(cascade = cascade.asInstanceOf[js.Any], cols = cols.asInstanceOf[js.Any], format = js.Any.fromFunction1(format), pickerPrefixCls = pickerPrefixCls.asInstanceOf[js.Any], popupPrefixCls = popupPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Cascade]
  }
}

