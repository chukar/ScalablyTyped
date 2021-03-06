package typings.fullcalendar

import typings.fullcalendar.srcTypesJqueryDashHooksMod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/Toolbar", JSImport.Namespace)
@js.native
object toolbarMod extends js.Object {
  @js.native
  class Default protected () extends js.Object {
    def this(calendar: js.Any, toolbarOptions: js.Any) = this()
    var calendar: js.Any = js.native
    var el: js.Any = js.native
    var toolbarOptions: js.Any = js.native
    var viewsWithButtons: js.Any = js.native
    def activateButton(buttonName: js.Any): Unit = js.native
    def deactivateButton(buttonName: js.Any): Unit = js.native
    def disableButton(buttonName: js.Any): Unit = js.native
    def enableButton(buttonName: js.Any): Unit = js.native
    def getViewsWithButtons(): js.Any = js.native
    def removeElement(): Unit = js.native
    def render(): Unit = js.native
    def renderSection(position: js.Any): JQuery = js.native
    def setToolbarOptions(newToolbarOptions: js.Any): Unit = js.native
    def updateTitle(text: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends Default {
    def this(calendar: js.Any, toolbarOptions: js.Any) = this()
  }
  
}

