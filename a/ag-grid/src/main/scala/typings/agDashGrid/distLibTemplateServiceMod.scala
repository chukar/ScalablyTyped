package typings.agDashGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/templateService", JSImport.Namespace)
@js.native
object distLibTemplateServiceMod extends js.Object {
  @js.native
  class TemplateService () extends js.Object {
    @JSName("$scope")
    var $scope: js.Any = js.native
    var templateCache: js.Any = js.native
    var waitingCallbacks: js.Any = js.native
    def getTemplate(url: js.Any, callback: js.Any): js.Any = js.native
    def handleHttpResult(httpResult: js.Any, url: js.Any): Unit = js.native
  }
  
}

