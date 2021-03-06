package typings.leafletDashRoutingDashMachine.leafletMod.Routing

import typings.leaflet.leafletMod.LatLng
import typings.leaflet.leafletMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Routing.Plan")
@js.native
class Plan protected () extends Layer {
  def this(waypoints: js.Array[LatLng | Waypoint]) = this()
  def this(waypoints: js.Array[LatLng | Waypoint], options: PlanOptions) = this()
  def createGeocoders(): js.Any = js.native
  def getWaypoints(): js.Array[Waypoint] = js.native
  def isReady(): Boolean = js.native
  def setWaypoints(waypoints: js.Array[LatLng | Waypoint]): js.Any = js.native
  def spliceWaypoints(index: Double, waypointsToRemove: Double, wayPoints: Waypoint*): js.Array[Waypoint] = js.native
}

@JSImport("leaflet", "Routing.plan")
@js.native
object plan extends js.Object {
  def apply(waypoints: js.Array[LatLng | Waypoint]): Plan = js.native
  def apply(waypoints: js.Array[LatLng | Waypoint], options: PlanOptions): Plan = js.native
}

