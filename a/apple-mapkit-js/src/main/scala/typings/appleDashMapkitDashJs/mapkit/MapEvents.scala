package typings.appleDashMapkitDashJs.mapkit

import typings.appleDashMapkitDashJs.Anon_Annotation
import typings.appleDashMapkitDashJs.Anon_AnnotationCoordinate
import typings.appleDashMapkitDashJs.Anon_Annotation_778575030
import typings.appleDashMapkitDashJs.Anon_Code
import typings.appleDashMapkitDashJs.Anon_Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prettier-ignore
trait MapEvents[T] extends js.Object {
  var deselect: EventBase[T] with Anon_Annotation
  var `double-tap`: EventBase[T]
  var `drag-end`: EventBase[T] with Anon_Annotation_778575030
  var `drag-start`: EventBase[T] with Anon_Annotation_778575030
  var dragging: EventBase[T] with Anon_AnnotationCoordinate
  var `long-press`: EventBase[T]
  var `map-type-change`: EventBase[T]
  var `region-change-end`: EventBase[T]
  var `region-change-start`: EventBase[T]
  var `scroll-end`: EventBase[T]
  var `scroll-start`: EventBase[T]
  // Annotation Events
  var select: EventBase[T] with Anon_Annotation
  var `single-tap`: EventBase[T]
  // User Location Events
  var `user-location-change`: EventBase[T] with Anon_Coordinate
  var `user-location-error`: EventBase[T] with Anon_Code
  var `zoom-end`: EventBase[T]
  var `zoom-start`: EventBase[T]
}

object MapEvents {
  @scala.inline
  def apply[T](
    deselect: EventBase[T] with Anon_Annotation,
    `double-tap`: EventBase[T],
    `drag-end`: EventBase[T] with Anon_Annotation_778575030,
    `drag-start`: EventBase[T] with Anon_Annotation_778575030,
    dragging: EventBase[T] with Anon_AnnotationCoordinate,
    `long-press`: EventBase[T],
    `map-type-change`: EventBase[T],
    `region-change-end`: EventBase[T],
    `region-change-start`: EventBase[T],
    `scroll-end`: EventBase[T],
    `scroll-start`: EventBase[T],
    select: EventBase[T] with Anon_Annotation,
    `single-tap`: EventBase[T],
    `user-location-change`: EventBase[T] with Anon_Coordinate,
    `user-location-error`: EventBase[T] with Anon_Code,
    `zoom-end`: EventBase[T],
    `zoom-start`: EventBase[T]
  ): MapEvents[T] = {
    val __obj = js.Dynamic.literal(deselect = deselect.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
    __obj.updateDynamic("double-tap")(`double-tap`.asInstanceOf[js.Any])
    __obj.updateDynamic("drag-end")(`drag-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("drag-start")(`drag-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("long-press")(`long-press`.asInstanceOf[js.Any])
    __obj.updateDynamic("map-type-change")(`map-type-change`.asInstanceOf[js.Any])
    __obj.updateDynamic("region-change-end")(`region-change-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("region-change-start")(`region-change-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("scroll-end")(`scroll-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("scroll-start")(`scroll-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("single-tap")(`single-tap`.asInstanceOf[js.Any])
    __obj.updateDynamic("user-location-change")(`user-location-change`.asInstanceOf[js.Any])
    __obj.updateDynamic("user-location-error")(`user-location-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("zoom-end")(`zoom-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("zoom-start")(`zoom-start`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapEvents[T]]
  }
}

