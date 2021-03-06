package typings.gdal.gdalMod

import typings.gdal.Anon_Unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gdal", "SpatialReference")
@js.native
class SpatialReference () extends js.Object {
  def this(wkt: String) = this()
  def EPSGTreatsAsLatLong(): Boolean = js.native
  def EPSGTreatsAsNorthingEasting(): Boolean = js.native
  def autoIdentifyEPSG(): Unit = js.native
  def cloneGeogCS(): SpatialReference = js.native
  def getAngularUnits(): Anon_Unit = js.native
  def getAttrValue(node_name: String): String = js.native
  def getAttrValue(node_name: String, attr_index: Double): String = js.native
  def getAuthorityCode(target_key: String): String = js.native
  def getAuthorityName(target_key: String): String = js.native
  def getLinearUnits(): Anon_Unit = js.native
  def isCompound(): Boolean = js.native
  def isGeocentric(): Boolean = js.native
  def isGeographic(): Boolean = js.native
  def isLocal(): Boolean = js.native
  def isProjected(): Boolean = js.native
  def isSame(srs: SpatialReference): Boolean = js.native
  def isSameGeogCS(srs: SpatialReference): Boolean = js.native
  def isSameVertCS(srs: SpatialReference): Boolean = js.native
  def isVertical(): Boolean = js.native
  def morphFromESRI(): Unit = js.native
  def morphToESRI(): Unit = js.native
  def setWellKnownGeogCS(name: String): Unit = js.native
  def toPrettyWKT(): String = js.native
  def toPrettyWKT(simplify: Boolean): String = js.native
  def toProj4(): String = js.native
  def toWKT(): String = js.native
  def toXML(): String = js.native
  def validate(): String = js.native
}

/* static members */
@JSImport("gdal", "SpatialReference")
@js.native
object SpatialReference extends js.Object {
  def fromCRSURL(input: String): SpatialReference = js.native
  def fromEPSG(input: String): SpatialReference = js.native
  def fromEPSGA(input: Double): SpatialReference = js.native
  def fromESRI(input: js.Array[String]): SpatialReference = js.native
  def fromMICoordSys(input: String): SpatialReference = js.native
  def fromProj4(input: String): SpatialReference = js.native
  def fromURL(url: String): SpatialReference = js.native
  def fromURN(input: String): SpatialReference = js.native
  def fromUserInput(input: String): SpatialReference = js.native
  def fromWKT(wkt: String): SpatialReference = js.native
  def fromWMSAUTO(input: String): SpatialReference = js.native
  def fromXML(input: String): SpatialReference = js.native
}

