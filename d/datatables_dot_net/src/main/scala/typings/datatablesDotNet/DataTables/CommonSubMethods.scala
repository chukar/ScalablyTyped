package typings.datatablesDotNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "util-methods"
trait CommonSubMethods extends js.Object {
  /**
    * Get the DataTables cached data for the selected cell
    *
    * @param t Specify which cache the data should be read from. Can take one of two values: search or order
    */
  def cache(t: String): Api
}

object CommonSubMethods {
  @scala.inline
  def apply(cache: String => Api): CommonSubMethods = {
    val __obj = js.Dynamic.literal(cache = js.Any.fromFunction1(cache))
  
    __obj.asInstanceOf[CommonSubMethods]
  }
}

