package typings.cordovaDashPluginDashMsDashAdal.Microsoft.ADAL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseTokenCacheItems extends js.Object {
  def `then`(doneCallBack: js.Function1[/* tokenCacheItems */ js.Array[TokenCacheItem], _]): js.Any = js.native
  def `then`(
    doneCallBack: js.Function1[/* tokenCacheItems */ js.Array[TokenCacheItem], _],
    failCallBack: js.Function1[/* message */ String, _]
  ): js.Any = js.native
}

