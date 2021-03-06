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

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.MemberAccess")
@js.native
class MemberAccess protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FMemberAccess: IModel = js.native
  def accessRights(): MemberAccessRights = js.native
  def accessRights(newValue: MemberAccessRights): js.Any = js.native
  def association(): IAssociationBase | Null = js.native
  def association(newValue: IAssociationBase): js.Any = js.native
  def associationQualifiedName(): String | Null = js.native
  @JSName("association")
  def association_Any(): js.Any = js.native
  def attribute(): IAttribute | Null = js.native
  def attribute(newValue: IAttribute): js.Any = js.native
  def attributeQualifiedName(): String | Null = js.native
  @JSName("attribute")
  def attribute_Any(): js.Any = js.native
  def containerAsAccessRule(): AccessRule = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.MemberAccess")
@js.native
object MemberAccess extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MemberAccess instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MemberAccess = js.native
  /**
    * Creates and returns a new MemberAccess instance in the SDK and on the server.
    * The new MemberAccess will be automatically stored in the 'memberAccesses' property
    * of the parent AccessRule element passed as argument.
    */
  def createIn(container: AccessRule): MemberAccess = js.native
}

