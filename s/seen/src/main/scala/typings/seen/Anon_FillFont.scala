package typings.seen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FillFont extends js.Object {
  var fill: js.UndefOr[String] = js.undefined
  var font: String
  var `text-anchor`: js.UndefOr[String] = js.undefined
}

object Anon_FillFont {
  @scala.inline
  def apply(font: String, fill: String = null, `text-anchor`: String = null): Anon_FillFont = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (`text-anchor` != null) __obj.updateDynamic("text-anchor")(`text-anchor`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FillFont]
  }
}

