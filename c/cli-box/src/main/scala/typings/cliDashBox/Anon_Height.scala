package typings.cliDashBox

import typings.cliDashBox.cliDashBoxMod.Marks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: Double
  var lines: js.Array[Anon_Offset]
  var marks: Marks
  var width: Double
}

object Anon_Height {
  @scala.inline
  def apply(height: Double, lines: js.Array[Anon_Offset], marks: Marks, width: Double): Anon_Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], marks = marks.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Height]
  }
}

