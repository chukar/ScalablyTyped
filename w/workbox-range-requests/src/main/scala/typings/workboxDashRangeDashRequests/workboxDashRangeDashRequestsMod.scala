package typings.workboxDashRangeDashRequests

import typings.std.Request
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-range-requests", JSImport.Namespace)
@js.native
object workboxDashRangeDashRequestsMod extends js.Object {
  @js.native
  class Plugin ()
    extends typings.workboxDashRangeDashRequests.pluginMod.Plugin
  
  def createPartialResponse(request: Request, originalResponse: Response): js.Promise[Response] = js.native
}

