package typings.semanticDashUiDashForm.SemanticUI.Form.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'input, textarea, select'
    */
  var field: String
  /**
    * @default '.field'
    */
  var group: String
  /**
    * @default 'input'
    */
  var input: String
  /**
    * @default '.error.message'
    */
  var message: String
  /**
    * @default '.prompt'
    */
  var prompt: String
  /**
    * @default '.submit'
    */
  var submit: String
}

object _Impl {
  @scala.inline
  def apply(field: String, group: String, input: String, message: String, prompt: String, submit: String): _Impl = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

