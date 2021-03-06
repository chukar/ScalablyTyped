package typings.mathjs.mathjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MathJsJson extends js.Object {
  /**
    * Returns reviver function that can be used as reviver in JSON.parse function.
    */
  def reviver(): js.Function2[/* key */ js.Any, /* value */ js.Any, _]
}

object MathJsJson {
  @scala.inline
  def apply(reviver: () => js.Function2[/* key */ js.Any, /* value */ js.Any, _]): MathJsJson = {
    val __obj = js.Dynamic.literal(reviver = js.Any.fromFunction0(reviver))
  
    __obj.asInstanceOf[MathJsJson]
  }
}

