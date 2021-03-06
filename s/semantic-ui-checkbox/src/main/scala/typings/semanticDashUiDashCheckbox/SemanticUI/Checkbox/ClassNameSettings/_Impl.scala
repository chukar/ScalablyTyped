package typings.semanticDashUiDashCheckbox.SemanticUI.Checkbox.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'checked'
    */
  var checked: String
  /**
    * @default 'disabled'
    */
  var disabled: String
  /**
    * @default 'radio'
    */
  var radio: String
  /**
    * @default 'read-only'
    */
  var readOnly: String
}

object _Impl {
  @scala.inline
  def apply(checked: String, disabled: String, radio: String, readOnly: String): _Impl = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

