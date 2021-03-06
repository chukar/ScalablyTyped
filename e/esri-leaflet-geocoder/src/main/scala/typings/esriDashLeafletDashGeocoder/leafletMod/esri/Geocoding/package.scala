package typings.esriDashLeafletDashGeocoder.leafletMod.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Geocoding {
  import org.scalablytyped.runtime.Instantiable1
  import typings.leaflet.leafletMod.Evented

  type Geosearch = GeosearchControl with Evented
  type GeosearchCallback = js.Function2[/* error */ js.UndefOr[js.Any], /* results */ js.Any, Unit]
  type GeosearchConstructor = Instantiable1[js.UndefOr[/* options */ GeosearchObject], Geosearch]
}
