package typings.textract

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lang extends js.Object {
  /**
    *  A pass-through to tesseract allowing for setting of language for extraction.
    */
  var lang: String
}

object Anon_Lang {
  @scala.inline
  def apply(lang: String): Anon_Lang = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Lang]
  }
}

