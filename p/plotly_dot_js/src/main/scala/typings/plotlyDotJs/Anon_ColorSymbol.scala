package typings.plotlyDotJs

import typings.plotlyDotJs.plotlyDotJsMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorSymbol extends js.Object {
  var color: Color
  var symbol: String
}

object Anon_ColorSymbol {
  @scala.inline
  def apply(color: Color, symbol: String): Anon_ColorSymbol = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColorSymbol]
  }
}

