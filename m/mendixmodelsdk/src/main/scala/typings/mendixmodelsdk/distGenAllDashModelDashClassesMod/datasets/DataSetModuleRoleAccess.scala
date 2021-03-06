package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.datasets

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDatasetsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetModuleRoleAccess")
@js.native
class DataSetModuleRoleAccess protected ()
  extends typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetModuleRoleAccess {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetModuleRoleAccess")
@js.native
object DataSetModuleRoleAccess extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataSetModuleRoleAccess instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetModuleRoleAccess = js.native
  /**
    * Creates and returns a new DataSetModuleRoleAccess instance in the SDK and on the server.
    * The new DataSetModuleRoleAccess will be automatically stored in the 'moduleRoleAccessList' property
    * of the parent DataSetAccess element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetAccess): typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetModuleRoleAccess = js.native
}

