package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodels

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.11.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.EntityRefStep")
@js.native
class EntityRefStep protected ()
  extends typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.EntityRefStep {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.EntityRefStep")
@js.native
object EntityRefStep extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new EntityRefStep instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.EntityRefStep = js.native
  /**
    * Creates and returns a new EntityRefStep instance in the SDK and on the server.
    * The new EntityRefStep will be automatically stored in the 'steps' property
    * of the parent IndirectEntityRef element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IndirectEntityRef): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.EntityRefStep = js.native
}

