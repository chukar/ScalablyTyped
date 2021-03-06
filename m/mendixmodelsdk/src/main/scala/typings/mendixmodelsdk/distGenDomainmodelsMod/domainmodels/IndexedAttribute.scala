package typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.IndexedAttribute")
@js.native
class IndexedAttribute protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FIndexedAttribute: IModel = js.native
  /**
    * In version 7.14.0: introduced
    */
  def ascending(): Boolean = js.native
  def ascending(newValue: Boolean): js.Any = js.native
  def attribute(): Attribute | Null = js.native
  def attribute(newValue: Attribute): js.Any = js.native
  @JSName("attribute")
  def attribute_Any(): js.Any = js.native
  def containerAsIndex(): Index = js.native
  def `type`(): IndexedAttributeType = js.native
  def `type`(newValue: IndexedAttributeType): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.IndexedAttribute")
@js.native
object IndexedAttribute extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new IndexedAttribute instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): IndexedAttribute = js.native
  /**
    * Creates and returns a new IndexedAttribute instance in the SDK and on the server.
    * The new IndexedAttribute will be automatically stored in the 'attributes' property
    * of the parent Index element passed as argument.
    */
  def createIn(container: Index): IndexedAttribute = js.native
}

