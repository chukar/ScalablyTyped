package typings.stripeDashV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReturnurlUrl extends js.Object {
  /**
    * If the customer does not exit their browser while
    * authenticating, they will be redirected to this
    * specified URL after completion.
    */
  var return_url: String
  /**
    * The URL you must redirect your customer to in
    * order to authenticate.
    */
  var url: String
}

object Anon_ReturnurlUrl {
  @scala.inline
  def apply(return_url: String, url: String): Anon_ReturnurlUrl = {
    val __obj = js.Dynamic.literal(return_url = return_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ReturnurlUrl]
  }
}

