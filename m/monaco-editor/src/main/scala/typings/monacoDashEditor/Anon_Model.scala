package typings.monacoDashEditor

import typings.monacoDashEditor.monacoDashEditorMod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Model extends js.Object {
  val model: ITextModel
  val oldLanguage: String
}

object Anon_Model {
  @scala.inline
  def apply(model: ITextModel, oldLanguage: String): Anon_Model = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], oldLanguage = oldLanguage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Model]
  }
}

