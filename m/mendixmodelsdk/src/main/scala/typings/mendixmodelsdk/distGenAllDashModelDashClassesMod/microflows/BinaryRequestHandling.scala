package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 6.9.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.BinaryRequestHandling")
@js.native
class BinaryRequestHandling protected ()
  extends typings.mendixmodelsdk.distGenMicroflowsMod.microflows.BinaryRequestHandling {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.BinaryRequestHandling")
@js.native
object BinaryRequestHandling extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new BinaryRequestHandling instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.BinaryRequestHandling = js.native
  /**
    * Creates and returns a new BinaryRequestHandling instance in the SDK and on the server.
    * The new BinaryRequestHandling will be automatically stored in the 'requestHandling' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.9.0 and higher
    */
  def createInRestCallActionUnderRequestHandling(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.RestCallAction): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.BinaryRequestHandling = js.native
  /**
    * Creates and returns a new BinaryRequestHandling instance in the SDK and on the server.
    * The new BinaryRequestHandling will be automatically stored in the 'requestBodyHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.9.0 and higher
    */
  def createInWebServiceCallActionUnderRequestBodyHandling(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.WebServiceCallAction): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.BinaryRequestHandling = js.native
  /**
    * Creates and returns a new BinaryRequestHandling instance in the SDK and on the server.
    * The new BinaryRequestHandling will be automatically stored in the 'requestHeaderHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.9.0 and higher
    */
  def createInWebServiceCallActionUnderRequestHeaderHandling(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.WebServiceCallAction): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.BinaryRequestHandling = js.native
}

