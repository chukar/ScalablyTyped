package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenRestMod.rest.ConsumedODataService
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.HttpConfiguration")
@js.native
class HttpConfiguration protected ()
  extends typings.mendixmodelsdk.distGenMicroflowsMod.microflows.HttpConfiguration {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.HttpConfiguration")
@js.native
object HttpConfiguration extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.HttpConfiguration = js.native
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.5.0
    */
  def createIn(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.WebServiceCallAction): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.HttpConfiguration = js.native
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent rest.ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInConsumedODataServiceUnderHttpConfiguration(container: ConsumedODataService): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.HttpConfiguration = js.native
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  def createInRestCallActionUnderHttpConfiguration(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.RestCallAction): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.HttpConfiguration = js.native
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  def createInWebServiceCallActionUnderHttpConfiguration(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.WebServiceCallAction): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.HttpConfiguration = js.native
}

