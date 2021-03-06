package typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomMod

import typings.react.reactMod.TouchEvent
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewerTouchEvent[T] extends js.Object {
  var SVGViewer: SVGSVGElement
  var changedPoints: js.Array[Point]
  var originalEvent: TouchEvent[T]
  var points: js.Array[Point]
  var scaleFactor: Double
  var translationX: Double
  var translationY: Double
  def preventDefault(): Unit
  def stopPropagation(): Unit
}

object ViewerTouchEvent {
  @scala.inline
  def apply[T](
    SVGViewer: SVGSVGElement,
    changedPoints: js.Array[Point],
    originalEvent: TouchEvent[T],
    points: js.Array[Point],
    preventDefault: () => Unit,
    scaleFactor: Double,
    stopPropagation: () => Unit,
    translationX: Double,
    translationY: Double
  ): ViewerTouchEvent[T] = {
    val __obj = js.Dynamic.literal(SVGViewer = SVGViewer.asInstanceOf[js.Any], changedPoints = changedPoints.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), scaleFactor = scaleFactor.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), translationX = translationX.asInstanceOf[js.Any], translationY = translationY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ViewerTouchEvent[T]]
  }
}

