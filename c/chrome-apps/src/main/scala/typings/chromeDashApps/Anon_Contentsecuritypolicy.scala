package typings.chromeDashApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contentsecuritypolicy extends js.Object {
  /**
    * @default 'sandbox allow-scripts allow-forms'
    */
  var content_security_policy: js.UndefOr[String] = js.undefined
  var pages: js.Array[String]
}

object Anon_Contentsecuritypolicy {
  @scala.inline
  def apply(pages: js.Array[String], content_security_policy: String = null): Anon_Contentsecuritypolicy = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any])
    if (content_security_policy != null) __obj.updateDynamic("content_security_policy")(content_security_policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Contentsecuritypolicy]
  }
}

