package typings.polished

import typings.polished.polishedNumbers.`0`
import typings.polished.polishedNumbers.`1`
import typings.polished.polishedStrings.Rightparenthesis
import typings.polished.polishedStrings.postfix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01ArgCountF extends js.Object {
  var argCount: `1`
  var f: js.UndefOr[scala.Nothing] = js.undefined
  var notation: postfix
  var precedence: `0`
  var rightToLeft: `0`
  var symbol: Rightparenthesis
}

object Anon_01ArgCountF {
  @scala.inline
  def apply(
    argCount: `1`,
    notation: postfix,
    precedence: `0`,
    rightToLeft: `0`,
    symbol: Rightparenthesis,
    f: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_01ArgCountF = {
    val __obj = js.Dynamic.literal(argCount = argCount.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], precedence = precedence.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    if (!js.isUndefined(f)) __obj.updateDynamic("f")(f.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_01ArgCountF]
  }
}

