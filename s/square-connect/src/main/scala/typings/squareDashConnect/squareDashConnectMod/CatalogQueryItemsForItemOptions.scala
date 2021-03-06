package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogQueryItemsForItemOptions")
@js.native
class CatalogQueryItemsForItemOptions () extends js.Object {
  /**
    * A set of [CatalogItemOption](#type-catalogitemoption) IDs to be used to find associated [CatalogItem](#type-catalogitem)s.
    * All Items that contain all of the given Item Options (in any order) will be returned.
    */
  var item_option_ids: js.UndefOr[js.Array[String]] = js.native
}

