package typings.mongodb

import typings.mongodb.mongodbMod.ExtractIdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdExtractIdTypeTSchema[TSchema] extends js.Object {
  var _id: ExtractIdType[TSchema]
}

object Anon_IdExtractIdTypeTSchema {
  @scala.inline
  def apply[TSchema](_id: ExtractIdType[TSchema]): Anon_IdExtractIdTypeTSchema[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IdExtractIdTypeTSchema[TSchema]]
  }
}

