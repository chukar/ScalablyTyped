package typings.mendixmodelsdk.distGenMicroflowsMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Union")
@js.native
class Union protected () extends BinaryListOperation {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FUnion: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Union")
@js.native
object Union extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Union instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): Union = js.native
  /**
    * Creates and returns a new Union instance in the SDK and on the server.
    * The new Union will be automatically stored in the 'operation' property
    * of the parent ListOperationAction element passed as argument.
    */
  def createIn(container: ListOperationAction): Union = js.native
}

