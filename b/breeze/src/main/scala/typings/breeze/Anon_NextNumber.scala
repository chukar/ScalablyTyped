package typings.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NextNumber extends js.Object {
  var nextNumber: Double
  var nextNumberIncrement: Double
  var stringPrefix: String
}

object Anon_NextNumber {
  @scala.inline
  def apply(nextNumber: Double, nextNumberIncrement: Double, stringPrefix: String): Anon_NextNumber = {
    val __obj = js.Dynamic.literal(nextNumber = nextNumber.asInstanceOf[js.Any], nextNumberIncrement = nextNumberIncrement.asInstanceOf[js.Any], stringPrefix = stringPrefix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NextNumber]
  }
}

