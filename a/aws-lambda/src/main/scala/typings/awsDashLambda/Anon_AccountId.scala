package typings.awsDashLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountId extends js.Object {
  var accountId: String
  var data: Anon_ActionConfiguration
  var id: String
}

object Anon_AccountId {
  @scala.inline
  def apply(accountId: String, data: Anon_ActionConfiguration, id: String): Anon_AccountId = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AccountId]
  }
}

