package typings.breeze

import typings.breeze.breeze.DataService
import typings.breeze.breeze.EntityQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataService extends js.Object {
  var dataService: DataService
  var query: EntityQuery
  def getUrl(): String
}

object Anon_DataService {
  @scala.inline
  def apply(dataService: DataService, getUrl: () => String, query: EntityQuery): Anon_DataService = {
    val __obj = js.Dynamic.literal(dataService = dataService.asInstanceOf[js.Any], getUrl = js.Any.fromFunction0(getUrl), query = query.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DataService]
  }
}

