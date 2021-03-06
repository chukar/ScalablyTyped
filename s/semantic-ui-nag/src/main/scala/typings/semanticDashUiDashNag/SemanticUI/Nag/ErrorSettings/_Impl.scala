package typings.semanticDashUiDashNag.SemanticUI.Nag.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'The method you called is not defined.'
    */
  var method: String
  /**
    * @default '$.cookie is not included. A storage solution is required.'
    */
  var noCookieStorage: String
  /**
    * @default 'Neither $.cookie or store is defined. A storage solution is required for storing state'
    */
  var noStorage: String
}

object _Impl {
  @scala.inline
  def apply(method: String, noCookieStorage: String, noStorage: String): _Impl = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], noCookieStorage = noCookieStorage.asInstanceOf[js.Any], noStorage = noStorage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

