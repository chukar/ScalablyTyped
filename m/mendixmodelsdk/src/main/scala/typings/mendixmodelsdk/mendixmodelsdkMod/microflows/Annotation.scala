package typings.mendixmodelsdk.mendixmodelsdkMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/annotation relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "microflows.Annotation")
@js.native
class Annotation protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows.Annotation {
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
@JSImport("mendixmodelsdk", "microflows.Annotation")
@js.native
object Annotation extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Annotation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.Annotation = js.native
  /**
    * Creates and returns a new Annotation instance in the SDK and on the server.
    * The new Annotation will be automatically stored in the 'objects' property
    * of the parent MicroflowObjectCollection element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowObjectCollection): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.Annotation = js.native
}

