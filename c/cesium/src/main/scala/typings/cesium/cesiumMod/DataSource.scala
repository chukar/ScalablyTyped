package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "DataSource")
@js.native
abstract class DataSource () extends js.Object {
  var changedEvent: Event[js.Array[_]] = js.native
  var clock: DataSourceClock = js.native
  var clustering: EntityCluster = js.native
  var entities: EntityCollection = js.native
  var errorEvent: Event[js.Array[_]] = js.native
  var isLoading: Boolean = js.native
  var loadingEvent: Event[js.Array[_]] = js.native
  var name: String = js.native
  var show: Boolean = js.native
  def update(time: JulianDate): Boolean = js.native
}

