package typings.gaeaDashModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  // 插入的位置
  var index: Double
  // 父级 mapKey
  var parentMapUniqueKey: String
  // 新增组件的唯一标识 id
  var uniqueId: String
}

object Anon_Index {
  @scala.inline
  def apply(index: Double, parentMapUniqueKey: String, uniqueId: String): Anon_Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], parentMapUniqueKey = parentMapUniqueKey.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Index]
  }
}

