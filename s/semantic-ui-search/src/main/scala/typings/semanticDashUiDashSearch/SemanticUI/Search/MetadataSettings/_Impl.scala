package typings.semanticDashUiDashSearch.SemanticUI.Search.MetadataSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'cache'
    */
  var cache: String
  /**
    * @default 'results'
    */
  var results: String
}

object _Impl {
  @scala.inline
  def apply(cache: String, results: String): _Impl = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

