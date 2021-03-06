package typings.mendixmodelsdk.mendixmodelsdkMod.domainmodels

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "domainmodels.UniqueRuleInfo")
@js.native
class UniqueRuleInfo protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodels.UniqueRuleInfo {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "domainmodels.UniqueRuleInfo")
@js.native
object UniqueRuleInfo extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new UniqueRuleInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.UniqueRuleInfo = js.native
  /**
    * Creates and returns a new UniqueRuleInfo instance in the SDK and on the server.
    * The new UniqueRuleInfo will be automatically stored in the 'ruleInfo' property
    * of the parent ValidationRule element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.ValidationRule): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.UniqueRuleInfo = js.native
}

