package typings.baseui

import typings.baseui.baseuiStrings.ID
import typings.baseui.baseuiStrings.Indonesia
import typings.baseui.baseuiStrings.Plussign62
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_62 extends js.Object {
  var dialCode: Plussign62
  var id: ID
  var label: Indonesia
}

object Anon_62 {
  @scala.inline
  def apply(dialCode: Plussign62, id: ID, label: Indonesia): Anon_62 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_62]
  }
}

