package typings.typescriptDashTuple

import typings.typescriptDashTuple.typescriptDashTupleStrings.equal
import typings.typescriptDashTuple.typescriptDashTupleStrings.shorterLeft
import typings.typescriptDashTuple.typescriptDashTupleStrings.shorterRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1Equal[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */] extends js.Object {
  var fitBoth: equal
  var fitLeft: shorterLeft
  var fitRight: shorterRight
  var unfit: js.Any
}

object Anon_1Equal {
  @scala.inline
  def apply[Left /* <: js.Array[_] */, Right /* <: js.Array[_] */](fitBoth: equal, fitLeft: shorterLeft, fitRight: shorterRight, unfit: js.Any): Anon_1Equal[Left, Right] = {
    val __obj = js.Dynamic.literal(fitBoth = fitBoth.asInstanceOf[js.Any], fitLeft = fitLeft.asInstanceOf[js.Any], fitRight = fitRight.asInstanceOf[js.Any], unfit = unfit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_1Equal[Left, Right]]
  }
}

