package typings.winrtDashUwp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueArray extends js.Object {
  /** The file name extensions in the collection that start at startIndex. */ var items: js.Array[String]
  /** The number of items retrieved. */ var returnValue: Double
}

object Anon_ItemsReturnValueArray {
  @scala.inline
  def apply(items: js.Array[String], returnValue: Double): Anon_ItemsReturnValueArray = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ItemsReturnValueArray]
  }
}

