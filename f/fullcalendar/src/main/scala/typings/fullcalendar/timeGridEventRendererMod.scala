package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/TimeGridEventRenderer", JSImport.Namespace)
@js.native
object timeGridEventRendererMod extends js.Object {
  @js.native
  class Default protected ()
    extends typings.fullcalendar.eventRendererMod.default {
    def this(timeGrid: js.Any, fillRenderer: js.Any) = this()
    var timeGrid: js.Any = js.native
    def assignFgSegHorizontals(segs: js.Any): Unit = js.native
    def compareForwardSegs(seg1: js.Any, seg2: js.Any): js.Any = js.native
    def computeFgSegForwardBack(seg: js.Any, seriesBackwardPressure: js.Any, seriesBackwardCoord: js.Any): Unit = js.native
    def computeFgSegHorizontals(segs: js.Any): Unit = js.native
    def generateFgSegHorizontalCss(seg: js.Any): js.Any = js.native
    def renderFgSegsIntoContainers(segs: js.Any, containerEls: js.Any): Unit = js.native
    def sortForwardSegs(forwardSegs: js.Any): Unit = js.native
    def unrenderFgSegs(): Unit = js.native
    def updateFgSegCoords(segs: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends Default {
    def this(timeGrid: js.Any, fillRenderer: js.Any) = this()
  }
  
}

