package typings.openlayers.openlayersMod.proj

import typings.openlayers.openlayersMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "proj.get")
@js.native
object get extends js.Object {
  /**
    * Fetches a Projection object for the code specified.
    *
    * @param projectionLike Either a code string which is
    *     a combination of authority and identifier such as "EPSG:4326", or an
    *     existing projection object, or undefined.
    * @return Projection object, or null if not in list.
    * @api stable
    */
  def apply(projectionLike: ProjectionLike): Projection = js.native
}

