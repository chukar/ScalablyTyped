package typings.mendixmodelsdk.mendixmodelsdkMod.appservices

import typings.mendixmodelsdk.distGenAppservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "appservices.MsdMicroflow")
@js.native
class MsdMicroflow protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.appservices.MsdMicroflow {
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
@JSImport("mendixmodelsdk", "appservices.MsdMicroflow")
@js.native
object MsdMicroflow extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdMicroflow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenAppservicesMod.appservices.MsdMicroflow = js.native
  /**
    * Creates and returns a new MsdMicroflow instance in the SDK and on the server.
    * The new MsdMicroflow will be automatically stored in the 'microflows' property
    * of the parent MsdMetadata element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenAppservicesMod.appservices.MsdMetadata): typings.mendixmodelsdk.distGenAppservicesMod.appservices.MsdMicroflow = js.native
}

