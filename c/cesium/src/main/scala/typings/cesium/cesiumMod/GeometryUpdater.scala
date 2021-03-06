package typings.cesium.cesiumMod

import typings.cesium.Anon_Entity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "GeometryUpdater")
@js.native
class GeometryUpdater protected () extends js.Object {
  def this(options: Anon_Entity) = this()
  val classificationTypeProperty: Property = js.native
  val entity: Entity = js.native
  val fillEnabled: Boolean = js.native
  val fillMaterialProperty: MaterialProperty = js.native
  val geometryChanged: Boolean = js.native
  val hasConstantFill: Boolean = js.native
  val hasConstantOutline: Boolean = js.native
  val id: String = js.native
  val isClosed: Boolean = js.native
  val isDynamic: Boolean = js.native
  val outlineColorProperty: Property = js.native
  val outlineEnabled: Boolean = js.native
  val outlineWidth: Double = js.native
  val readonlydistanceDisplayConditionProperty: Property = js.native
  val shadowsProperty: Property = js.native
  def createDynamicUpdater(primitives: PrimitiveCollection, groundPrimitives: PrimitiveCollection): DynamicGeometryUpdater = js.native
  def createFillGeometryInstance(time: JulianDate): GeometryInstance = js.native
  def createOutlineGeometryInstance(time: JulianDate): GeometryInstance = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
  def isFilled(time: JulianDate): Boolean = js.native
  def isOutlineVisible(time: JulianDate): Boolean = js.native
}

